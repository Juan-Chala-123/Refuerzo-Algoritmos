# Taller de Refuerzo - Documentación de Ejercicios

Este repositorio contiene una serie de ejercicios en Java organizados en diferentes carpetas según su temática. A continuación, se documenta cada uno de los ejercicios, explicando su propósito y las principales líneas de código.

## Estructura De Control

### 1. Números primos en un rango
### Codigo: NumeroPrimo.java
**Propósito:** Solicita al usuario dos números (inicio y fin) y muestra todos los números primos dentro de ese rango.

**Estrucutra:** condicionales, bucles anidados, funciones.

**Desarrollo:**

1. Lectura de datos con Scanner

    ```java
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa el número de inicio: ");
    int num1 = sc.nextInt();

    System.out.print("Ingresa el número de fin: ");
    int num2 = sc.nextInt();
    ```

- Se crea un objeto Scanner para leer datos desde el teclado.
    
    El usuario ingresa dos números:

    - num1: inicio del rango.

    - num2: fin del rango.

**Logica:**

```java
    for (int num = num1; num <= num2; num++) {
        if (num > 1) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(num + " ");
            }
        }
    }
```

- **Bucle `for` Externo:** Itera a través de todos los números en el rango [num1, num2].

- Excluye números ≤ 1 (no son primos).

- **Verificación:**

  - Inicializa primo = true (asumimos que es primo hasta probar lo contrario).

  - solo verifica divisores hasta √num.

  - Si encuentra algún divisor, marca primo = false y termina la verificación.

- Imprime el número si pasa todas las verificaciones.

- O(n√n) donde n es el tamaño del rango.

- O(1) - uso constante de memoria.


### 2. Serie de Fibonacci con límite

### Codigo: Fibonacci.java

**Proposito:** Genera los primeros n números de la serie de Fibonacci, donde n es ingresado por el usuario.

**Estructura:** bucle for o while, variables acumuladoras.

**Desarrollo:**

1. Se crea un objeto Scanner para leer datos desde el teclado.

```java
Scanner sc = new Scanner(System.in);
        
System.out.println("Ingresa el numero hasta donde quieres llegar: ");
int n = sc.nextInt();
```

**Logica:**

```java
int fibonacci = 0;
int num = 0;
int num2 = 1;
        
for (int i = 0; i < n; i++) {
    fibonacci = num2 + num;
            
    System.out.println("Resultado: " + num + " + " + num2 + " = " + fibonacci);
            
    num = num2;
    num2 = fibonacci;
}
```

Inicializamos:
  - num = 0
  - num2 = 1

Bucle `for`:
- Calcula el siguiente término: fibonacci = num + num2
- Actualiza variables para la siguiente iteración
- num toma el valor de num2
- num2 toma el valor del nuevo fibonacci
- Continua el ciclo

### 3. Promedio de calificaciones
### Codigo: PromedioCalificaciones.java
**Proposito:** Pide al usuario las calificaciones de varios estudiantes (cantidad determinada por el usuario). Calcula y muestra el promedio general y cuántos están por encima del promedio.

**Estructura:** bucle for, listas, condicionales.

**Desarrollo:**

1. Se crea un objeto Scanner para leer datos desde el teclado.

```java
Scanner sc = new Scanner(System.in);
        
System.out.println("Ingresa la cantidad de estudiantes: ");
byte e = sc.nextByte();

System.out.println("Ingresa la cantidad de notas que vas a ingresar: ");
byte n = sc.nextByte();
```

**Desarrollo:**

```java
byte encima = 0;
        
List<Double> promedios = new ArrayList<>();
List<String> nombres = new ArrayList<>();
        
for (int i = 0; i < e; i++) {
    System.out.println("Estudiante " + (i+1));
    System.out.println("Nombre Estudiante: ");
    sc.nextLine();
    String nombre = sc.nextLine();
    nombres.add(nombre);
            
    List<Double> notas = new ArrayList<>();
    double suma = 0;

    for (int a = 0; a < n; a++) {
        System.out.println("Ingresa la nota " + (a+1));
        double nota = sc.nextDouble();
        notas.add(nota);
        suma += nota;
    }

    double promedio = (suma / n);
    promedios.add(promedio);
    System.out.println("Promedio del Estudiante " + nombre + ": " + promedio);         
}
        
double total = 0;
for (double p : promedios) {
    total += p;
}
        
double pGeneral = total / e;
        
for (double p : promedios) {
    if (p > pGeneral) {
        encima++;
    }
}
        
System.out.println("\nPromedio general del grupo: " + pGeneral);
System.out.println("Estudiantes por encima del promedio general: " + encima);
```