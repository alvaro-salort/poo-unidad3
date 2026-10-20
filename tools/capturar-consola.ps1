# Captura la salida de consola de un ejercicio y la convierte en PNG.
#
# Uso: powershell -ExecutionPolicy Bypass -File tools/capturar-consola.ps1 -Paquete "ejercitacion3_1.ejercicio02" -Clase "VideojuegoFisico" -Titulo "Ejercicio 02 - VideojuegoFisico"

param(
    [Parameter(Mandatory = $true)][string]$Paquete,
    [Parameter(Mandatory = $true)][string]$Clase,
    [string]$Titulo = "Consola",
    [string]$Salida = "consola.png"
)

$ErrorActionPreference = "Stop"
$raiz = Split-Path -Parent $PSScriptRoot
Set-Location $raiz

$carpeta = "src\" + ($Paquete -replace '\.', '\')
$salidaTxt = ".tmp\" + $Paquete + ".txt"
$imagen = $carpeta + "\" + $Salida

javac -encoding UTF-8 -d bin ($carpeta + "\*.java")
if ($LASTEXITCODE -ne 0) { throw "Error de compilacion en $Paquete" }

cmd /c "java -cp bin $Paquete.$Clase > $salidaTxt"

javac -encoding UTF-8 -d .tmp\tools tools\RenderConsola.java
java -cp .tmp\tools RenderConsola $salidaTxt $imagen $Titulo

Write-Output "Captura lista: $imagen"
