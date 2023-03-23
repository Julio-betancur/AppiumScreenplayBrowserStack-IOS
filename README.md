## Automatizacion IOS con appium y browserstack

_Este proyecto es una implementación de automatización de pruebas para aplicaciones móviles utilizando el framework Appium con el lenguaje de programación Java, el patrón de diseño Screenplay y el framework SerenityBDD para generar informes de prueba detallados y fáciles de entender. Se utiliza Gradle como gestor de dependencias y Cucumber con Gherkin como lenguaje de especificación de pruebas._

## Configuración del proyecto 🚀

Para configurar el proyecto en su entorno local, siga los siguientes pasos:

### Requisitos previos 📋

_Asegúrese de tener instalados los siguientes programas:_

*   **JDK 11**
*   **Gradle**
*   **Appium Inspector**

### Clonar repositorio 🔧

1.  Abra una terminal y navegue a la ubicación donde desea clonar el repositorio.
2.  Ejecute el siguiente comando: `git clone https://github.com/Julio-betancur/AppiumScreenplayBrowserStack-IOS.git`

### Importar el proyecto en su IDE ⚙️

1.  Abra su IDE preferido (Eclipse,IntelliJ, etc.).
2.  Seleccione la opción para importar un proyecto gradle.
3.  Seleccione la carpeta raíz del proyecto que acabas de clonar.

### Ejecutar las pruebas ▶️

_Para ejecutar las pruebas en su entorno local, ejecute el siguiente comando en una terminal desde la carpeta raíz del proyecto:_

`gradle clean test aggregate`

Esto ejecutará todas las pruebas definidas en el proyecto y generará un informe detallado de los resultados en la carpeta **target/site/serenity/index.html**

### Estructura del proyecto 🧱

```css
src
├── main
│   ├── java
│   │   ├── android.demoapk
│   │   │   ├── driver
│   │   │   ├── questions
│   │   │   ├── tasks
│	│	│ 	├── userinterface
│	│	└──
│   └── resources
│      
└── test
    ├── java
    │   ├── android.demoapk
    │   │   ├── runner
    │   │   ├── stepdefinitions
    │   └──   
    └── resources
        └── features
        └── app
```

*   **src/main/java**: contiene las clases de driver, tareas, preguntas, interfaces de usuario.
*   **src/test/java**: contiene los runners y stepdefinitions,
*   **src/test/resources**: contiene los recursos necesarios para ejecutar la aplicación, como el archivo .ipa y los features en gherkin.


## Autores ✒️

*   **Julio Betancur** - _Trabajo Inicial_
