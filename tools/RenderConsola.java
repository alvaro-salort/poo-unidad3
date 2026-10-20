import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Convierte la salida de consola capturada en un archivo de texto
 * dentro de una imagen PNG con apariencia de terminal.
 *
 * Uso: java RenderConsola <archivoSalida.txt> <imagen.png> [titulo]
 */
public class RenderConsola {

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Uso: java RenderConsola <salida.txt> <imagen.png> [titulo]");
            return;
        }

        String contenido = leerContenido(Paths.get(args[0]));
        String titulo = args.length > 2 ? args[2] : "Consola";
        Path destino = Paths.get(args[1]);

        String[] lineas = contenido.split("\r?\n", -1);

        int fontSize = 14;
        Font fuente = new Font("Consolas", Font.PLAIN, fontSize);
        if (!fuente.getFamily().equalsIgnoreCase("Consolas")) {
            fuente = new Font("DejaVu Sans Mono", Font.PLAIN, fontSize);
        }

        BufferedImage dummy = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = dummy.createGraphics();
        g.setFont(fuente);
        int anchoChar = g.getFontMetrics().charWidth('M');
        int altoLinea = g.getFontMetrics().getHeight();
        g.dispose();

        int padding = 18;
        int anchoBarra = 34;
        int ancho = (anchoChar * Math.max(60, maxCaracteres(lineas))) + padding * 2;
        int alto = (altoLinea * lineas.length) + padding * 2 + anchoBarra;

        BufferedImage imagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = imagen.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(new Color(0x1E1E1E));
        g2.fillRect(0, 0, ancho, alto);

        // barra de titulo
        g2.setColor(new Color(0x333333));
        g2.fillRect(0, 0, ancho, anchoBarra);
        g2.setColor(new Color(0xE06C75));
        g2.fillOval(14, 12, 10, 10);
        g2.setColor(new Color(0xE5C07B));
        g2.fillOval(32, 12, 10, 10);
        g2.setColor(new Color(0x98C379));
        g2.fillOval(50, 12, 10, 10);
        g2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        g2.setColor(new Color(0xBBBBBB));
        g2.drawString(titulo, 74, 21);

        // cuerpo
        g2.setFont(fuente);
        g2.setColor(new Color(0xD4D4D4));
        int y = anchoBarra + padding + g.getFontMetrics().getAscent();
        for (String linea : lineas) {
            g2.drawString(linea, padding, y);
            y += altoLinea;
        }
        g2.dispose();

        Files.createDirectories(destino.getParent());
        ImageIO.write(imagen, "png", destino.toFile());
        System.out.println("PNG generado: " + destino.toFile().getAbsolutePath());
    }

    private static String leerContenido(Path origen) throws Exception {
        byte[] bytes = Files.readAllBytes(origen);
        if (bytes.length >= 2 && (bytes[0] & 0xFF) == 0xFF && (bytes[1] & 0xFF) == 0xFE) {
            // archivo generado por PowerShell (UTF-16 LE con BOM)
            return new String(bytes, 2, bytes.length - 2, StandardCharsets.UTF_16LE);
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }

    private static int maxCaracteres(String[] lineas) {
        int max = 0;
        for (String linea : lineas) {
            max = Math.max(max, linea.length());
        }
        return max;
    }
}
