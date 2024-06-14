# IMCHelper: Calculadora de Índice de Masa Corporal en Java

## Introducción

**IMCHelper** es una aplicación gráfica escrita en Java para calcular el Índice de Masa Corporal (IMC) basado en la altura y el peso del usuario. Este proyecto fue creado para aprender sobre Java y se pone a disposición del público para aquellos que también estén interesados en este lenguaje de programación y quieran comprender parte de su sintaxis. IMCHelper es una herramienta útil para los aprendices de Java, ya que ofrece una interfaz gráfica simple y clara para realizar cálculos de IMC.

## Características

* Ingresar peso y altura para calcular el IMC.
* Proporcionar una interpretación del IMC según las categorías estándar.
* Interfaz gráfica intuitiva y fácil de usar.

Para ejecutar este proyecto, necesitarás tener instalado el Kit de Desarrollo de Java (JDK) en tu sistema. El proyecto fue desarrollado utilizando la última versión disponible del JDK en el momento, por lo que debería funcionar con versiones recientes.

## Estructura del Proyecto

El proyecto consta de los siguientes archivos:

* **Main.java**: Contiene el método principal para iniciar la aplicación.
* **CalculatorIMC.java**: Implementa la funcionalidad de la calculadora de IMC.
* **InterpretateIMC.java**: Proporciona la interpretación del valor de IMC calculado.

## Instrucciones

1. Clona el repositorio:

```sh
git clone https://github.com/TuUsuario/IMCHelper.git
```

2. Navega al directorio del proyecto:
```sh
cd IMCHelper
```

3. Compila el código:
```sh
javac Main.java CalculatorIMC.java InterpretateIMC.java
```

4. Ejecuta la aplicación:
```sh
java -cp bin src.main.java.com.imc_helper.Main
```

## Cómo Funciona

Cuando ejecutas el programa, se mostrará una ventana con campos para ingresar el peso y la altura, y un botón para calcular el IMC. Al presionar el botón, se calculará el IMC y se proporcionará una interpretación basada en las categorías estándar.

### Componentes Principales

**Ventana Principal**

* Campos de Texto: Para ingresar el peso (en kilogramos) y la altura (en centímetros).
* Botón Calcular: Para iniciar el cálculo del IMC.
* Etiqueta de Resultado: Para mostrar el IMC calculado y su interpretación.

### Ejemplo de Uso

**Cálculo Básico de IMC**

1. Abre la aplicación.
2. Ingresa tu peso en el campo "Weight (kg)".
3. Ingresa tu altura en el campo "Height (cm)".
4. Haz clic en el botón "Calculate".
5. Verás tu IMC y su interpretación en la etiqueta de resultado.

## Captura de Pantalla

![example_01](https://github.com/Angcroft/IMCHelper/assets/69369902/0b991c6d-997d-4c24-9080-3eb4b829025d)

![example_02](https://github.com/Angcroft/IMCHelper/assets/69369902/2133be2b-5ea9-4466-8b15-e0b704687a0d)


## Acerca del Uso de Este Proyecto
Este proyecto no está destinado a contribuciones, pero eres libre de usar el código para tus propios proyectos. De acuerdo con la licencia MIT, se concede a todos la libertad de usar este código para cualquier propósito beneficioso.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para obtener más detalles.

### Notas adicionales:

1. **Estructura del Proyecto**: Asegúrate de que las rutas de los archivos y directorios sean correctas y se reflejen adecuadamente en la estructura del proyecto.
2. **Instrucciones de Compilación y Ejecución**: Adapta las instrucciones según tu entorno de desarrollo específico.
3. **Captura de Pantalla**: Añadir una captura de pantalla de la aplicación puede ayudar a los usuarios a entender mejor la interfaz.
