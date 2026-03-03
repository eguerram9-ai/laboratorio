# 📘 Ejercicio en Clase 3 – Modularización en Java
## Curso: Programación 1

---

## 🎯 Objetivo

Aplicar los conceptos de:

- Modularización mediante métodos.
- Uso correcto de variables locales y globales.
- Validación de entradas del usuario.
- Manejo básico de excepciones.
- Mejora de la organización y legibilidad del código.

---

## 📌 Instrucciones Generales

- Trabajar en parejas (**Obligatorio**).
- No utilizar IA para el análisis.
- Se proporcionará un programa base en Java.
- Analizarlo, mejorarlo y documentar el proceso en este archivo `README.md`.

---

# 🧠 Parte 1 – Análisis del Programa Original

En esta sección deben analizar el programa entregado.

## 1️⃣ Identificación de Tareas Repetitivas

Responder:

### ¿Qué partes del código pueden convertirse en métodos?

En el programa original, varias secciones del método `main` pueden convertirse en métodos independientes, tales como:

* Mostrar el menú de opciones.
* Leer la opción del usuario.
* Agregar estudiante.
* Mostrar lista de estudiantes.
* Calcular promedio de calificaciones.
* Mostrar el estudiante con la calificación más alta.
* Validar la entrada numérica del usuario.

Estas partes realizan tareas específicas y pueden modularizarse para mejorar la estructura del programa.

---

### ¿Qué bloques de código se repiten?

Se identificaron los siguientes patrones repetitivos:

* Validaciones de listas vacías antes de realizar operaciones.
* Recorridos de listas usando ciclos `for`.
* Lectura de datos mediante `Scanner`.
* Conversión de texto a números (`Integer.parseInt` y `Double.parseDouble`).
* Estructura del menú dentro del bucle principal.

La repetición de estos bloques hace que el método `main` sea más largo y menos legible.

---

### ¿Qué responsabilidades pueden separarse?

El programa original mezcla múltiples responsabilidades dentro del `main`. Las principales que pueden separarse son:

* Control del menú.
* Gestión de estudiantes.
* Cálculo de estadísticas.
* Validación de entradas.
* Interacción con el usuario.

Separar estas responsabilidades permite aplicar el principio de **una sola responsabilidad por método**.


Ejemplos de posibles tareas:

- Agregar estudiante.
- Mostrar estudiantes.
- Calcular promedio.
- Mostrar estudiante con mayor calificación.

### ¿Por qué dividir estas tareas mejora el programa?

Dividir el código en métodos mejora el programa porque:

* Reduce la complejidad del `main`.
* Hace el código más organizado.
* Facilita la reutilización de funciones.
* Mejora la legibilidad.
* Simplifica el mantenimiento.
* Permite detectar errores con mayor facilidad.

---

## 2️⃣ Variables Locales vs Globales

Responder:

- ¿Qué variables deberían declararse como globales (atributos `static` de la clase)?
- ¿Cuáles deberían ser locales dentro de un método?
- ¿Por qué?

Reflexionar sobre:

- Alcance (scope)
- Tiempo de vida de la variable
- Riesgos de modificar datos globales accidentalmente

---

# 🏗️ Parte 2 – Modularización del Programa

Reestructurar el programa aplicando modularización:

- Crear métodos claros y específicos.
- Cada método debe tener una sola responsabilidad.
- Todos los métodos deben ser llamados desde `main`.
- Mantener el programa completamente funcional.

No es obligatorio usar nombres específicos, pero deben ser descriptivos.

Ejemplo de buenas prácticas:

- Un método = una responsabilidad.
- No mezclar múltiples tareas en un mismo método.
- Mantener el código ordenado e indentado.

---

# 🔐 Parte 3 – Validaciones y Manejo de Excepciones

Implementar mejoras en el programa:

- Validar entradas numéricas.
- Evitar que el programa falle si el usuario ingresa texto en lugar de números.
- Verificar que las calificaciones estén en un rango válido.
- Usar `try-catch` cuando sea necesario.

Explicar en esta sección:

- Qué errores podrían ocurrir.
- Qué validaciones implementaron.
- Por qué son importantes.

---

# 🧩 Parte 4 – Preguntas de Reflexión

Responder con sus propias palabras.

## 1️⃣ ¿Qué ventajas tiene dividir el código en métodos?

Reflexionar sobre:

- Organización
- Reutilización
- Mantenimiento
- Claridad

---

## 2️⃣ ¿Por qué no es recomendable usar muchas variables globales?

Reflexionar sobre:

- Posibilidad de errores inesperados
- Dificultad para depurar
- Dependencia entre métodos

---

## 3️⃣ ¿Cómo mejora la modularización la legibilidad del código?

---

# 📦 Entregables

## 1️⃣ Código Java

- Archivo `Main.java`.
- Modularizado correctamente.
- Funcional.
- Con validaciones básicas.
- Ordenado y bien indentado.

---

## 2️⃣ Este archivo `README.md`

Debe contener:

- Análisis del programa original.
- Decisiones de modularización.
- Justificación de variables locales y globales.
- Respuestas a las preguntas guía.
- Explicación de validaciones implementadas.

---

# 📊 Criterios de Evaluación

| Criterio | Puntos |
|----------|--------|
| Programa funciona correctamente | 30 |
| Modularización adecuada | 25 |
| Uso correcto de variables locales y globales | 15 |
| Validaciones implementadas | 15 |
| Calidad del README | 15 |
| **Total** | **100 puntos** |
