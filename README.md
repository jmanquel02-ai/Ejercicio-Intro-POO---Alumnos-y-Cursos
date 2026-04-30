# Ejercicio Intro POO - Alumnos y Cursos

Este repositorio contiene el desarrollo de una actividad introductoria de Programación Orientada a Objetos, donde se modelan alumnos de la UFRO y cursos que gestionan alumnos mediante un `ArrayList`.

## Archivos principales

- `Alumno.java`: clase que representa a un alumno.
- `Curso.java`: clase que representa un curso y gestiona una lista de alumnos.
- `Main.java`: clase utilizada para probar la ejecución del programa.
- `diagrama.puml`: diagrama de clases desarrollado con PlantUML.

## Control de avance

### 1ra versión: Clase Alumno

¿Pudo crear la clase Alumno?  
Sí. Se creó la clase `Alumno.java` con atributos privados como nombre, apellido, número de matrícula, carrera y correo. También se agregaron constructores con y sin parámetros, métodos getter/setter y el método `toString()`.

No todos los atributos tienen setter. En este caso, no se agregó setter para el número de matrícula, ya que este dato identifica al alumno y no debería modificarse libremente.

### 2da versión: Clase Curso

¿Pudo crear la clase Curso?  
Sí. Se creó la clase `Curso.java` con nombre, código y una lista de alumnos gestionada mediante `ArrayList<Alumno>`. Además, se implementaron métodos para agregar, eliminar y buscar alumnos por número de matrícula.

### 3ra versión: Diagrama UML

Sí. Se creó un diagrama de clases en PlantUML para representar la relación entre `Curso`, `Alumno` y `Main`.

### 4ta versión: Prueba de ejecución

Sí. Se creó la clase `Main.java` para probar el programa, instanciando un curso con cinco alumnos y ejecutando los métodos de agregar, buscar, eliminar y mostrar alumnos.

## Ejecución

Para ejecutar el proyecto, abrirlo en IntelliJ IDEA y ejecutar la clase `Main.java`.
