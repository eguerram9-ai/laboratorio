# 📘 Ejercicio en Clase 3 – Modularización en Java

## Curso: Programación 1

---

# 🧠 Parte 1 – Análisis del Programa Original

## 1️⃣ Identificación de Tareas Repetitivas

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

---

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

### ¿Qué variables deberían declararse como globales?

Las variables que deben ser globales (`static`) son:

* `estudiantes`
* `calificaciones`

**Justificación:**
Estas listas representan el estado principal del sistema y necesitan ser accesibles desde varios métodos durante toda la ejecución del programa.

---

### ¿Cuáles deberían ser locales dentro de un método?

Deben ser locales variables como:

* `scanner`
* `opcion`
* `nombre`
* `calificacion`
* `suma`
* `promedio`
* `maxCalificacion`
* `estudianteMax`

**Justificación:**
Estas variables solo se utilizan dentro de un método específico y no necesitan compartirse globalmente.

---

### Reflexión

**Alcance (scope):**
Las variables locales tienen un alcance limitado al método donde se declaran, lo que reduce interferencias entre partes del programa. Las variables globales tienen un alcance amplio y pueden ser accedidas desde cualquier método de la clase.

**Tiempo de vida:**
Las variables locales existen únicamente durante la ejecución del método. En cambio, las variables globales permanecen durante toda la ejecución del programa.

**Riesgos de modificar datos globales accidentalmente:**
El uso excesivo de variables globales aumenta el riesgo de modificaciones no deseadas, lo que puede generar errores difíciles de detectar. Por ello, se recomienda usar variables globales solo cuando sea estrictamente necesario.

---

# 🔐 Parte 3 – Validaciones y Manejo de Excepciones

### ¿Qué errores podrían ocurrir?

Durante la ejecución del programa pueden ocurrir los siguientes errores:

* El usuario ingresa texto en lugar de números.
* El usuario selecciona una opción inválida del menú.
* La calificación ingresada está fuera del rango permitido.
* Se intenta calcular o mostrar información cuando las listas están vacías.

---

### ¿Qué validaciones se implementaron?

En la versión modularizada se implementaron las siguientes validaciones:

* Uso de `try-catch` en el método `leerOpcion()` para manejar entradas no numéricas y repetir la lectura hasta que sea válida.
* Uso de `try-catch` en `leerCalificacion()` para validar que la entrada sea numérica.
* Validación del rango de la calificación (0–100).
* Validación de nombre de estudiante no vacío.
* Verificación de listas vacías antes de mostrar estudiantes, calcular promedio o buscar la calificación más alta.

---

### ¿Por qué son importantes?

Estas validaciones son importantes porque:

* Evitan que el programa se cierre inesperadamente.
* Mejoran la experiencia del usuario.
* Hacen el sistema más robusto y confiable.
* Permiten controlar errores de forma segura.
* Garantizan que los resultados sean correctos.

---

# 🧩 Parte 4 – Preguntas de Reflexión

## 1️⃣ ¿Qué ventajas tiene dividir el código en métodos?

Dividir el código en métodos mejora la **organización**, ya que cada método cumple una función específica. También favorece la **reutilización**, porque un método puede llamarse desde diferentes partes del programa. Facilita el **mantenimiento**, debido a que los cambios se realizan en secciones pequeñas y controladas. Finalmente, aumenta la **claridad**, haciendo que el código sea más fácil de leer y comprender.

---

## 2️⃣ ¿Por qué no es recomendable usar muchas variables globales?

No es recomendable porque aumenta la **posibilidad de errores inesperados**, ya que cualquier método puede modificar esas variables. También incrementa la **dificultad para depurar**, porque es más complejo rastrear dónde cambió un valor. Además, genera **dependencia entre métodos**, lo que reduce la modularidad y la calidad del programa.

---

## 3️⃣ ¿Cómo mejora la modularización la legibilidad del código?

La modularización mejora la legibilidad porque divide el programa en partes pequeñas, ordenadas y con responsabilidades claras. Cada método describe exactamente qué hace, lo que permite entender el flujo del programa rápidamente. Esto hace que el código sea más limpio, estructurado y fácil de mantener en el tiempo.
