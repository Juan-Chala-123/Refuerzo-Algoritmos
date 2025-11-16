# Taller de Refuerzo - Documentación de Ejercicios

Este repositorio contiene una serie de ejercicios en Java organizados en diferentes carpetas según su temática. A continuación, se documenta cada uno de los ejercicios, explicando su propósito y las principales líneas de código.

---

## EstructuraDeControl

### 1. AdivinaNumero.java
**Propósito:** Implementa un juego donde el usuario debe adivinar un número generado aleatoriamente por el programa.

- **Lógica principal:** Se utiliza `Math.random()` para generar un número aleatorio y un bucle `while` para permitir múltiples intentos.
- **Entrada del usuario:** Se captura con `Scanner`.
- **Condicionales:** Se evalúa si el número ingresado es mayor, menor o igual al número generado.

---

### 2. CajeroAutomatico.java
**Propósito:** Simula un cajero automático con opciones como consultar saldo, retirar dinero y salir.

- **Menú:** Implementado con un bucle `do-while` y un `switch` para manejar las opciones.
- **Operaciones:** Variables para almacenar el saldo y realizar operaciones básicas.

---

### 3. CalculadoraEdad.java
**Propósito:** Calcula la edad de una persona a partir de su año de nacimiento.

- **Entrada:** Año de nacimiento ingresado por el usuario.
- **Cálculo:** Se resta el año actual al año ingresado.

---

### 4. ContarPalabras.java
**Propósito:** Cuenta el número de palabras en una frase ingresada por el usuario.

- **Lógica:** Divide la frase usando `split(" ")` y cuenta los elementos del arreglo resultante.

---

### 5. Contraseña.java
**Propósito:** Verifica si una contraseña ingresada coincide con una almacenada previamente.

- **Seguridad:** Compara cadenas de texto y permite múltiples intentos.

---

### 6. Fibonacci.java
**Propósito:** Genera la secuencia de Fibonacci hasta un número dado.

- **Lógica:** Usa un bucle para calcular los términos de la secuencia.

---

### 7. MaximoMinimo.java
**Propósito:** Encuentra el número máximo y mínimo en una lista de números ingresados por el usuario.

- **Lógica:** Usa variables auxiliares para almacenar los valores máximo y mínimo.

---

### 8. NumeroPrimo.java
**Propósito:** Determina si un número ingresado es primo.

- **Lógica:** Usa un bucle para verificar divisores del número.

---

### 9. PromedioCalificaciones.java
**Propósito:** Calcula el promedio de un conjunto de calificaciones ingresadas.

- **Lógica:** Suma las calificaciones y divide entre el número total.

---

### 10. TablaMultiplicacion.java
**Propósito:** Genera la tabla de multiplicar de un número ingresado.

- **Lógica:** Usa un bucle para calcular y mostrar los resultados.

---

## POO (Programación Orientada a Objetos)

### 1. CuentaBancaria.java
**Propósito:** Representa una cuenta bancaria con operaciones como depósito y retiro.

- **Clases y métodos:** Define atributos como `saldo` y métodos para las operaciones.

---

### 2. Estudiante.java
**Propósito:** Modela un estudiante con atributos como nombre, edad y calificaciones.

- **Métodos:** Incluye métodos para calcular el promedio de calificaciones.

---

### 3. Persona.java
**Propósito:** Representa una persona con atributos básicos como nombre y edad.

- **Uso:** Base para otros ejercicios de POO.

---

### 4. RelojDigital.java
**Propósito:** Simula un reloj digital que muestra la hora actual.

- **Lógica:** Usa la clase `LocalTime` para obtener la hora del sistema.

---

### 5. Vehiculo.java
**Propósito:** Modela un vehículo con atributos como marca, modelo y velocidad.

- **Métodos:** Incluye métodos para acelerar y frenar.

---

## FigurasGeométricas

### 1. Circulo.java
**Propósito:** Calcula el área y el perímetro de un círculo.

- **Fórmulas:** Usa `Math.PI` para los cálculos.

---

### 2. Cuadrado.java
**Propósito:** Calcula el área y el perímetro de un cuadrado.

- **Atributos:** Lado del cuadrado.

---

### 3. Figura.java
**Propósito:** Clase base para figuras geométricas.

- **Uso:** Heredada por otras clases como `Circulo` y `Cuadrado`.

---

### 4. Main.java
**Propósito:** Punto de entrada para probar las figuras geométricas.

- **Lógica:** Crea instancias de las figuras y muestra sus propiedades.

---

### 5. Triangulo.java
**Propósito:** Calcula el área y el perímetro de un triángulo.

- **Fórmulas:** Usa la base y la altura para el área.

---

## Herencia

### 1. Animal.java
**Propósito:** Clase base para animales.

- **Atributos:** Nombre y edad.

---

### 2. Gato.java
**Propósito:** Clase que hereda de `Animal` y agrega comportamientos específicos.

- **Métodos:** Incluye un método para maullar.

---

### 3. Perro.java
**Propósito:** Clase que hereda de `Animal` y agrega comportamientos específicos.

- **Métodos:** Incluye un método para ladrar.

---

### 4. Main.java
**Propósito:** Prueba las clases de herencia.

- **Lógica:** Crea instancias de `Perro` y `Gato`.

---

## Inventario

### 1. Inventario.java
**Propósito:** Gestiona un inventario de productos.

- **Atributos:** Lista de productos.

---

### 2. Producto.java
**Propósito:** Representa un producto con atributos como nombre y precio.

---

### 3. Main.java
**Propósito:** Prueba el sistema de inventario.

---

## JuegoPersonajes

### 1. Personaje.java
**Propósito:** Representa un personaje con atributos como nombre y puntos de vida.

---

### 2. Main.java
**Propósito:** Prueba el sistema de personajes.

---

## Relaciones

### 1. Curso.java
**Propósito:** Representa un curso con una lista de estudiantes.

---

### 2. Docente.java
**Propósito:** Representa un docente asociado a un curso.

---

### 3. Estudiante.java
**Propósito:** Representa un estudiante inscrito en un curso.

---

### 4. Main.java
**Propósito:** Prueba las relaciones entre cursos, docentes y estudiantes.

---

## RazonamientoLogicaAlgortimica

### 1. Ahorcado.java
**Propósito:** Implementa el juego del ahorcado.

---

### 2. CaminosCuadricula.java
**Propósito:** Calcula los caminos posibles en una cuadrícula.

---

### 3. NumerosAmigos.java
**Propósito:** Determina si dos números son amigos.

---

### 4. SimulacionFila.java
**Propósito:** Simula una fila de personas.

---

### 5. PlanificadorTareas
**Propósito:** Gestiona tareas con un planificador.

- **Clases:** `Planificador` y `Tarea`.

---

Este archivo puede expandirse con más detalles según sea necesario.