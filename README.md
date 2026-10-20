# Programación Orientada a Objetos - Ejercitación 3.E.1 (Herencia)

Este repositorio contiene la resolución de la **Ejercitación 3.E.1** de la materia **Programación Orientada a Objetos en Java**, centrada en **herencia**.

Cada ejercicio está modularizado de forma independiente dentro de su propio paquete. Todos los ejercicios son **autocontenidos**: las clases que se necesitan (`ProductoGeek`, `Comic`, `FiguraColeccionable`, etc.) se replican en el paquete de cada ejercicio para poder compilarlo y ejecutarlo por separado sin dependencias externas.

Además, se incluye un **Menú Interactivo de Consola (`Main.java`)** para compilar y ejecutar cualquier consigna cómodamente.

---

## 📂 Índice de Ejercicios Resueltos

### Ejercitación 3.E.1: Herencia

| Ejercicio | Archivo Principal | Descripción & Lógica Aplicada |
| --- | --- | --- |
| **01. ProductoGeek y Comic** | [`Comic.java`](src/ejercitacion3_1/ejercicio01/Comic.java) | Especialización básica y jerarquía con `extends`, atributos `protected` y reutilización de `super(...)`. |
| **02. VideojuegoFisico** | [`VideojuegoFisico.java`](src/ejercitacion3_1/ejercicio02/VideojuegoFisico.java) | Cadena de constructores y orden de ejecución de la JVM al heredar. |
| **03. FiguraColeccionable** | [`FiguraColeccionable.java`](src/ejercitacion3_1/ejercicio03/FiguraColeccionable.java) | Sobrescritura de métodos con `@Override` y aumento de precio por edición limitada. |
| **04. ConsolaEdicionEspecial** | [`ConsolaEdicionEspecial.java`](src/ejercitacion3_1/ejercicio04/ConsolaEdicionEspecial.java) | Diferencia entre `protected` y `private` en el acceso a los miembros de la superclase. |
| **05. IndumentariaGeek** | [`IndumentariaGeek.java`](src/ejercitacion3_1/ejercicio05/IndumentariaGeek.java) | Herencia implícita de `java.lang.Object` y sobrescritura de `toString()` con `super.toString()`. |
| **06. GestorEtiquetado** | [`GestorEtiquetado.java`](src/ejercitacion3_1/ejercicio06/GestorEtiquetado.java) | Polimorfismo mediante referencia de superclase y *dynamic binding* en tiempo de ejecución. |
| **07. MangaImportado** | [`MangaImportado.java`](src/ejercitacion3_1/ejercicio07/MangaImportado.java) | Jerarquía multinivel (superclase → subclase → subclase) con propagación de constructores. |
| **08. CarritoCompras** | [`CarritoCompras.java`](src/ejercitacion3_1/ejercicio08/CarritoCompras.java) | Colección heterogénea `ArrayList<ProductoGeek>` con invocación polimórfica por `for-each`. |
| **09. VerificadorGarantia** | [`VerificadorGarantia.java`](src/ejercitacion3_1/ejercicio09/VerificadorGarantia.java) | Inspección de tipos con `instanceof`, *downcasting* seguro y modificador `final`. |
| **10. PromocionGeek** | [`PromocionGeek.java`](src/ejercitacion3_1/ejercicio10/PromocionGeek.java) | Modelo integral de promociones por categoría sobre un lote de productos. |

---

## Compilación y Ejecución

### Opción 1: Menú Interactivo de Consola (¡Recomendado!)

**Desde la Terminal:**

```bash
# 1. Compilar todo el proyecto
javac -encoding UTF-8 -d bin -sourcepath src src/Main.java

# 2. Ejecutar el menú principal
java -cp bin Main
```

**Desde cualquier IDE:** abrir y ejecutar la clase [`src/Main.java`](src/Main.java).

### Opción 2: Ejecutar un Ejercicio Individual

Cada ejercicio se compila indicando el path completo del archivo principal y se ejecuta con su package completo:

```bash
# Ejemplo: Ejercicio 08 - CarritoCompras
javac -encoding UTF-8 -d bin -sourcepath src src/ejercitacion3_1/ejercicio08/CarritoCompras.java
java -cp bin ejercitacion3_1.ejercicio08.CarritoCompras
```

> La opción `-sourcepath src` le permite a `javac` resolver las clases auxiliares del mismo ejercicio automáticamente.

---

## Requisitos

- **Java Development Kit (JDK):** Versión 17 o superior.
- **IDE recomendado:** Visual Studio Code, IntelliJ IDEA, Eclipse o NetBrains.

---

> **Luke:** "Leia, somos hermanos... los dos hacemos `extends DarthVader`."
>
> **Leia:** "Tenés razón. A mí me tocaron los atributos de diplomacia y a vos te tocó heredar el método `perderMano()`."
