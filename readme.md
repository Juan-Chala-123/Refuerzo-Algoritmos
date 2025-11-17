**Nombre:** Juan Pablo Chala Ramirez

**Ficha:** 3145556

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

Creacion de Listas con los atributos `promedios` y `nombres`
```java
byte encima = 0;
        
List<Double> promedios = new ArrayList<>();
List<String> nombres = new ArrayList<>();
```
Calculamos el prmedio individual del estudiante.
```java        
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
```
Calculamos el promedio general
```java        
double total = 0;
for (double p : promedios) {
    total += p;
}
        
double pGeneral = total / e;
```
Contamos quienes estan por encima del promedio.
```java
for (double p : promedios) {
    if (p > pGeneral) {
        encima++;
    }
}
        
System.out.println("\nPromedio general del grupo: " + pGeneral);
System.out.println("Estudiantes por encima del promedio general: " + encima);
```

### 4. Tabla de multiplicar con formato
### Codigo: TablaMultiplicacion.java
**proposito:** Solicita un número y muestra su tabla de multiplicar del 1 al 10, formateada en columnas.

**Estructura:** bucle for, operaciones aritméticas, formato de salida.

**Desarrollo:**
```java
byte count = 1;
        
for (int i = 0; i < 10; i++) {
    System.out.println(n + " x " + count + " = " + (n * count));
    count++;
}
```
- Bucle `for`: Siempre 10 iteraciones.
- Contador: Variable `count` para claridad.
- Ecuación completa mostrada.

### 5. Adivina el número
### Codigo: AdivinaNumero.java
**Proposito:** Genera un número aleatorio del 1 al 50. El usuario debe adivinarlo, recibiendo mensajes como 'más alto' o 'más bajo' hasta acertar.

**Estructura:** condicionales.

**Desarrollo:**

Se genera un numero aleatoriamente.

```java
Random rand = new Random();
        
int aleatorio = rand.nextInt(50);
```

**Comparacion:**

```java
System.out.println("Ingresa un numero: ");
byte numero = sc.nextByte();
        
if (numero > aleatorio) {
    System.out.println("Mas bajo.");
} else if (numero < aleatorio) {
    System.out.println("Mas alto.");
} else {
    System.out.println("Es correcto le atinaste al numero.");
}
```
Se compara el numero que ingreso el usuario con el numero que genero la variable `aleatorio`.

Se le brinda una opurtinidad al usuario.

### 6. Calculadora de edad exacta
### Codigo: CalculadoraEdad.java

**Proposito:** Pide al usuario su fecha de nacimiento (día, mes, año) y calcula su edad actual exacta (años, meses y días).

**Estructura:** manejo de fechas, condicionales, operaciones aritméticas.

**Desarrollo:**

Se captura las fechas actuales en las variables

```java
LocalDate hoy = LocalDate.now();
int diaHoy = hoy.getDayOfMonth();
int mesHoy = hoy.getMonthValue();
int anioHoy = hoy.getYear();
```

Se captura los meses en un arreglo

```java
int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
```

Se comprueba que el año actual no sea bisiesto

```java
boolean bisiesto = (anioHoy % 4 == 0 && anioHoy % 100 != 0) || (anioHoy % 400 == 0);
if (bisiesto) {
    meses[1] = 29;
}
```

Se realiza una resta para despues corregirlo si quedan resutados negativos.

```java
int anios = anioHoy - anioNac;
int mes = mesHoy - mesNac;
int dias = diaHoy - diaNac;
```

Se corrgie si los dias son negativos y los meses.

Luego se imprime los resultados de la operacion.

### 7. Cajero automático simplificado
### Codigo: CajeroAutomatico.java

**Proposito:** Simula un cajero: el usuario tiene un saldo inicial. Puede elegir entre depositar, retirar o consultar saldo hasta que elija salir.

**Estructura:** menú con bucle do-while o while, condicionales.

**Desarrollo:**

Se incializan las varibales de `saldo` y `opcion`.

```java
int saldo = 1000;  // Saldo inicial
int opcion;
```

Bucle `do-while` que repetirá el menú hasta que se elija la opción 4 (Salir).

Muestra un menú y lee la opción seleccionada por el usuario.

```java
System.out.println("Cajero Automatico");
System.out.println("1. Consultar saldo");
System.out.println("2. Depositar dinero");
System.out.println("3. Retirar dinero");
System.out.println("4. Salir");
System.out.print("Elige una opción: ");
opcion = sc.nextInt();
```

Control de flujo con Switch: Dependiendo de lo que ingrese el usuario, se ejecuta un caso del switch.

- Consultar Saldo:
```java
// Se muestra unicamente el saldo
case 1:
    System.out.println("Tu saldo actual es: $" + saldo);
    break;
```

- Depositar:
```java
case 2:
    System.out.print("Cantidad a depositar: "); // Pide la cantidad a depositar
    int deposito = sc.nextInt();
    if (deposito > 0) { // Si el deposito es mayo a 0 se le suma al saldo
        saldo += deposito;
        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
    } else { // Numero menor a 0, se muestra error.
        System.out.println("Cantidad inválida.");
    }
    break;
```

- Retirar:
```java
case 3:
    System.out.print("Cantidad a retirar: "); // Pide la cantidad a retirar
    int retiro = sc.nextInt();
    if (retiro > 0 && retiro <= saldo) { // Si la cantidad a retirar es mayor a cero y es menor a o igual al saldo, se puede retirar.
    saldo -= retiro;
    System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
    } else { // Si la anterior accion, cumple alguna de las dos, mostrar error.
        System.out.println("Fondos insuficientes o cantidad inválida.");
    }
    break;
```

- Salir:
```java
case 4:
    System.out.println("Saliendo del cajero. ¡Gracias!");
    break;
```

En caso de que haya seleccionado otro numero o accion diferente al que se muestra en el menu mostrara error:

```java
default:
    System.out.println("Opción inválida. Intenta de nuevo.");
```

El menú se repetirá hasta que el usuario elija 4. Salir.

```java
} while (opcion != 4);
```

### 8. Buscar el valor máximo y mínimo
### Codigo: MaximoMinimo.java

**Proposito:** Pide n números al usuario y determina el mayor y el menor de todos.

**Estructura:** bucle for, comparaciones, acumuladores.

**Desarrollo:**

```java
System.out.println("Ingrese la cantidad de numeros a ingresar:");
byte n = sc.nextByte(); // Pide la cantidad de numeros a ingresar
int[] numeros = new int[n]; // Arreglo que contendra los numeros

// Bucle for para ingresar los numeros.
for (int i = 0; i < numeros.length; i++) {
    System.out.print("Número " + (i + 1) + ": ");
    numeros[i] = sc.nextInt();
}

// Variables mayor y menor, inicializadas en la posicion 0 del arreglo numeros.
int mayor = numeros[0];
int menor = numeros[0];

// Ciclo para recorrer cada posicion del arreglo
for (int i = 1; i < numeros.length; i++) {
    // Ciclos de comparacion de cada posicion del arreglo, donde se actualiza si encuentra el numero mayor o menor
    if (numeros[i] > mayor) {
        mayor = numeros[i];
    }
    if (numeros[i] < menor) {
        menor = numeros[i];
    }
}

// Resultado numero mayor y menor.
System.out.println("El número mayor es: " + mayor);
System.out.println("El número menor es: " + menor);
```

### 9. Contar palabras en una oración
### Codigo: ContarPalabras.java

**Proposito:** Solicita al usuario una oración y muestra cuántas palabras contiene y la longitud promedio de las palabras.

**Estructura:** cadenas, bucle, condicionales.

**Desarrollo:**

Entrada del usaurio. Se le pide una oracion larga. `.nextLine()` lee todo lo que el usuario escriba hasta presionar ENTER. `.trim()` elimina espacios al inicio y al final, para evitar palabras “vacías” que afecten el conteo.

```java
Scanner sc = new Scanner(System.in);

System.out.print("Ingresa una oración: ");
String oracion = sc.nextLine().trim();
```

Separacion de palabras y conteo:
```java
String[] palabras = oracion.split("\\s+"); // Divide la oración en un arreglo de palabras -.split("\\s+")-
int cantidadPalabras = palabras.length; // Calcula cuántas palabras hay contando cuántos elementos tiene el arreglo.
```

Recorre cada palabra del arreglo. Suma la cantidad de caracteres de cada una. El resultado será el total de caracteres de todas las palabras combinadas.
```java
int sumaLongitudes = 0;
for (String palabra : palabras) {
    sumaLongitudes += palabra.length();
}
```

Calcula el promedio dividiendo:
- la suma de longitudes
- entre la cantidad de palabras

Muestra la cantidad de palabras y la longitud promedio en pantalla.
```java
double promedio = (double) sumaLongitudes / cantidadPalabras;

System.out.println("\nCantidad de palabras: " + cantidadPalabras);
System.out.println("Longitud promedio de las palabras: " + promedio);
```

### 10. Validar contraseña segura
### Codigo: Contraseña.java

**Proposito:** Pide una contraseña y valida que cumpla con los siguientes requisitos:
- Al menos 8 caracteres
- Contenga mayúscula, minúscula y número.

**Estructura:** condicionales, bucle sobre cadena, funciones.

**Desarrollo:**

```java
Scanner sc = new Scanner(System.in);

System.out.print("Ingresa una contraseña: "); // Pide que ingrese la contraseña
String contrasena = sc.nextLine(); // Se captura en esta variable

// tres banderas (boolean) que indicarán si la contraseña contiene, una letra mayuscula y minuscula, y si tiene un numero.
boolean mayuscula = false;
boolean minuscula = false;
boolean numero = false;

// Verifica que la contraseña tenga al menos 8 caracteres.
if (contrasena.length() >= 8) {

    // Recorrer cada carácter de la contraseña
    for (int i = 0; i < contrasena.length(); i++) {
        // Recorre carácter por carácter de la contraseña.
        char c = contrasena.charAt(i);

        // Según el tipo de carácter encontrado:
        if (Character.isUpperCase(c)) {
            mayuscula = true; // Si es mayúscula activa mayuscula.
        }
        if (Character.isLowerCase(c)) {
            minuscula = true; // Si es minúscula activa minuscula.
        }
        if (Character.isDigit(c)) {
            numero = true; // Si es número activa numero.
        }
    }

    // Verifica que todas las condiciones sean verdaderas. 
    if (mayuscula && minuscula && numero) { 
        //Si las tres banderas (mayuscula, minuscula, numero) están en true, la contraseña es válida.
        System.out.println("Contraseña válida.");
    } else {
        // Si no cumple, le muestra nuevamente las indicaciones
        System.out.println("La contraseña debe contener:");
        System.out.println("- Al menos una mayúscula");
        System.out.println("- Al menos una minúscula");
        System.out.println("- Al menos un número");
    }

} else {
    System.out.println("La contraseña debe tener al menos 8 caracteres.");
}
```

## Ejercicios con Programación Orientada a Objetos (POO)

### 11. Clase Persona
### Codigo: POO/Persona.java

**Proposito:** Crea una clase Persona con atributos: nombre, edad y documento. Implementa un método que indique si la persona es mayor de edad.

**Conceptos:** encapsulamiento, métodos.

**Desarrollo:**

Se crea la clase Persona, junto con atributos como nombre, edad y documento, con modificadores de acceso `private`. Se crea el constructor. Metodo para `mayorEdad()`, donde se valida la edad de la persona si es mayor de edad de acuerdo al territorio de `Colombia`, donde la myoria de edad es de 18 años en adelante.

```java
public static void main(String[] args) {
    // Creamos los objetos Persona
    Persona p1 = new Persona("Juan", (byte) 23, "SJ382D");
    Persona p2 = new Persona("Luis", (byte) 17, "HFSKN4W");
      
    // Llamamos para cad persona el metodo mayorEdad
    p1.mayorEdad();
    p2.mayorEdad();
}
```

### 12. Clase Vehículo
### Codigo: POO/Vehiculo.java

**Proposito:** Crea una clase Vehículo con atributos: marca, modelo y velocidad. Agrega métodos acelerar() y frenar() que modifiquen la velocidad.

**Conceptos:** atributos, encapsulamiento.

**Desarrollo:**

Creamos la clase Vehiculo, donde le ponemos atributos como `marca`, `modelo` y `velocidad`. Creamos el constructor.
```java
// Metodo setVelocidad(), para modificar la velocidad
public void setVelocidad(byte velocidad) {
    this.velocidad = velocidad;
}
    
// Metodo acelerar(), para mostrar si el vehiculo acelero de acuerdo al setVelocidad()
public void acelerar() {
    System.out.println("El vehiculo acelero a " + this.velocidad + " Km.");
}

// Metodo frenar(), para mostrar la velocidad cuando baje.
public void frenar() {
    System.out.println("El vehiculo desacelero a " + this.velocidad + " Km.");
}
```
```java
// Creamos el objeto Vehiculo
Vehiculo v = new Vehiculo("Honda", "2019", (byte) 34);

// MOstramos informacion del objeto
System.out.println("Marca: " + v.marca);
System.out.println("Modelo: " + v.modelo);
System.out.println("Velocidad: " + v.velocidad);

// Llamamos el metod setVelocidad(), para modifcar la velocidad
v.setVelocidad((byte) 12);

// Y mostramos la nueva velocidad, cuando el vehiculo frene
v.frenar();
```

### 13. Cuenta Bancaria
### Codigo: POO/CuentaBancaria

**Proposito:** Define una clase CuentaBancaria con saldo, titular y número de cuenta. Implementa métodos depositar(), retirar() y mostrarSaldo(). Evita que el saldo sea negativo.

**Conceptos:** encapsulamiento, validaciones.

**Desarrollo:**

Creamos la clase `CuentaBancaria`, junto con los atributos `int saldo`, `String titular` y `String numero`. Creamos el constructor.

```java
// Metodo depositar(), que recibe como parametro monto y se le suma al saldo
public void depositar(int monto) {
    this.saldo += monto;     
}

// Metodo retirar(), recibe como parametro monto, y se valida si el monto a retirar es mayor a cero, si es menor o igual al saldo en la cuenta y muestra los respectivos mensajes de acuerdo a cada escenario
public void retirar(int monto) {
    if (monto < 0) {
        System.out.println("El monto a retirar no puede ser negativo.");
    } else if (this.saldo >= monto) {
        this.saldo -= monto;
        System.out.println("Retiro exitoso. Saldo actual: " + this.saldo);
    } else {
        System.out.println("No se puede retirar. Saldo insuficiente.");
    }
}

// Metodo mostrarSaldo(), simplemente muestra el saldo de la persona
public void mostrarSaldo() {
    System.out.println("Tu saldo actual es de " + this.saldo);
}
```

```java
// Objeto Scanner para ingresar los datos por medio del teclado
Scanner sc = new Scanner(System.in);

// Creamos el obejto CuentaBancaria
CuentaBancaria cb = new CuentaBancaria(342142, "Juan", "KSV693");

// Informacion sobre la cuenta
System.out.println("Saldo: " + cb.saldo);
System.out.println("Titular: " + cb.titular);
System.out.println("Numero de Cuenta: " + cb.numero);
        
// Se solicita al usuario que escoja lo que quiere hacer
System.out.println("Ingresa la operacion que quieres hacer (1-depositar, 2-retirar, 3-Consultar Saldo): ");
        byte n = sc.nextByte();

// Validacion de acuerdo a la opcion
if (n == 1) {
    System.out.println("¿Cuanto deseas ingresar? ");
    int monto = sc.nextInt();
    cb.depositar(monto);
    System.out.println("Se ha deposito " + monto + " en su cuenta bancaria.");
    System.out.println("Monto actual: " + cb.saldo);
} else if (n == 2) {
    System.out.println("¿Cuanto deseas retirar? ");
    int monto = sc.nextInt();
    cb.retirar(monto);
} else if (n == 3) {
    cb.mostrarSaldo();
} else {
    System.out.println("Erro: Tienen que ser uno de los tres numeros, 1, 2 o 3.");
}
```

### 14. Clase Estudiante
### Codigo: POO/Estudiante.java

**Proposito:** Crea una clase Estudiante con nombre, programa y lista de calificaciones. Incluye un método para calcular el promedio y otro para mostrar si aprobó.

**Conceptos:** listas, métodos, condicionales.

**Desarrollo:**

Creamos la clase Estudiante, junto con los atributos `String nombre` y `String programa`. Creamos el constructor.

```java
// Metodo calcular(), que recibe el parametro de promedio y muestra el promedio del estudiante
public void calcular(double promedio) {
    System.out.println("Su promedio es de: " + promedio);
}

// Metodo aprobar(), recibe el parametro promedio, y valida si el promedio es mayor de 3.0, el estudiante aprueba. Si no, pues no aprueba.
public void aprobar(double promedio) {
    if (promedio >= 3.0) {
        System.out.println("El estudiante aprueba el programa.");
    } else {
        System.out.println("El estudiante no aprueba el programa.");
    }
}
```
```java
Scanner sc = new Scanner(System.in);

// Creamos el objeto Estudiante
Estudiante e = new Estudiante("Juan", "Ingenieria");
// Incializamos la variable suma en o
double suma = 0;    
// Creamos una lista con la variable notas
List<Double> notas = new ArrayList<>();

// Pide la cantidad de notas a ingresar
System.out.println("Ingresa el numero de notas que va ingresar: ");
byte n = sc.nextByte();
for (int i = 0; i < n; i++) {
    // Ingreso de cada nota
    System.out.println("Ingresa la nota " + (i+1));
    double nota = sc.nextDouble();
    // Se añade a la lista
    notas.add(nota);
    suma += nota;
}

// Promediamos las notas
double promedio = suma / (double) n;

// Llamamos a los metodos de calcular() y aprobar(), para valiar si aprobo o no el estudiante.
e.calcular(promedio);
        
e.aprobar(promedio);

sc.close();
```

### 15. Herencia – Animales
### Codigo: 
```
POO/Herencia/
        Animal.java
        Gato.java
        Perro.Java
        Main.java
```

**Proposito:** Crea una clase base Animal con el método hacerSonido(). Subclases Perro y Gato sobrescriben el método.

**Conceptos:** herencia, polimorfismo.

**Desarrollo:**

Creamos la calse padre abstracta `Animal`, con el atributo `String nombre`. Creamos el constructor.

```java
// Creamos el metodo abstracto hacerSonido(), que va hacer sobrescito por las clases hijas
public abstract void hacerSonido();
```

clase `Gato`
```java
// Llama el constructor de la clase Padre
public Gato(String nombre) {
    super(nombre);
}

// El metodo hacerSonido() es modificado por la clase hija Gato, quien lo ajusta a su necesidad
@Override
public void hacerSonido() {
    System.out.println("El gato " + this.nombre + " hace Miau Miau.");
}
```

clase `Perro`
```java
...

// Modifica de igual forma el metodo de acuerdo a su necesidad.
@Override
public void hacerSonido() {
    System.out.println("El perro " + this.nombre + " hace Gua Gua. ");
}
```

clase `Main`
```java
// Creamos los objetos Perro y Gato. Y llamamos los metodos de hacerSonido()
Perro p = new Perro("Greta");
p.hacerSonido();
        
Gato g = new Gato("Michi");
g.hacerSonido();
```

### 16. Inventario de Productos
### Codigo:
```
POO/Inventario/
        Inventario.java
        Producto.java
        Main.java
```

**Proprosito:** Crea una clase Producto (nombre, precio, cantidad). Crea una clase Inventario que almacene productos y permita agregar, buscar y calcular el valor total del inventario.

**Conceptos:** composición, colecciones.

**Desarrollo:**

Creamos la clase `Producto`, junto con los atributos `String nombre`, `int precio` y `byte cantidad`. Creamos el metodo `getNombre()`, para capturar el nombre del producto, y creamos el metodo `valorTotal()`, para calcular el valor a cada producto.

clase `Inventario`
```java
// Creamos la lista  para guardar los prodcutos de la clase Producto
private List<Producto> productos;

// Inicializamos la lista Productos con el ArrayList
public Inventario() {
    this.productos = new ArrayList<>();
}
```
```java
// Metodo para agregar prodcutos a la lista.
public void agregarProducto(Producto producto) {
    productos.add(producto);
}
```
```java
//Busca un producto por su nombre dentro de la lista. Recorre todos los productos uno por uno.
public Producto buscarProducto(String nombre) {
    for (Producto producto : productos) {
        // Usamos .equals() para comparar los nombres correctamente
        if (producto.getNombre().equals(nombre)) {
                return producto;
        }
    }
    return null; // Si no encuentra el producto, retorna null
}
```
```java
// Recorre todos los productos del inventario. Llama al método valorTotal() de la clase Producto. Suma todos esos valores.
public int calcularValorTotal() {
    int total = 0;
    for (Producto producto : productos) {
        total += producto.valorTotal();
    }
    return total;
}
```

clase `Main`
```java
// Creamos los objetos Productos
Producto p1 = new Producto("Coca-Cola", 2114, (byte) 10);
Producto p2 = new Producto("Pepsi", 1233, (byte) 8);
Producto p3 = new Producto("Agua", 1316, (byte) 15);

// Creamos el objetp Inventario
Inventario inventario = new Inventario();

// Agreagamos los objetos Prodcutos a la lista
inventario.agregarProducto(p1);
inventario.agregarProducto(p2);
inventario.agregarProducto(p3);

// Buscamos un prodcuto especifico y validamos si esta en la lista
Producto encontrado = inventario.buscarProducto("Pepsi");
if (encontrado != null) {
    System.out.println("Producto encontrado: " + encontrado.getNombre());
} else {
    System.out.println("Producto no encontrado");
}

// Calcula el valor total del inventario.
double valorTotal = inventario.calcularValorTotal();
System.out.println("El valor total del inventario es: " + valorTotal);
```

### 17. Sistema Académico
### Codigo:
```
POO/Relaciones/
        Curso.java
        Docente.java
        Estudiante.java
        Main.java
```

**Proposito:** Crea clases Curso, Docente y Estudiante. Cada curso tiene un docente y varios estudiantes. Implementa un método que muestre el listado de estudiantes por curso.

**Conceptos:** relaciones uno a muchos.

**Desarrollo:**

Creamos la clase `Docente`, junto con los atributos `String nombre` y `String especialidad`. Creamos el constructor, junto con los metodos `get` para los atributos, junto con el metodo `String toString()` que retorna informacion sobre el docente.

Misma informacion para la clase `Estudiante`, junto con el metodo `toString()`, que retorna la informacion del esrudiante.

clase `Curso.java`
```java
// Atributos de la clase
private String nombre;
private Docente docente;
private List<Estudiante> estudiantes; // Lista para guardar los estudiantes

public Curso(String nombre, Docente docente) {
    this.nombre = nombre;
    this.docente = docente;
    this.estudiantes = new ArrayList<>(); // Inicializamos la lista Estudiante con el ArrayList 
}

// Agregar estudiantes a la lista
public void agregarEstudiante(Estudiante estudiante) {
    estudiantes.add(estudiante);
}

// Muestra informacion del curso desde los estudiante hasta los docentes
public void mostrarListadoEstudiantes() {
    System.out.println("Listado de estudiantes del curso: " + nombre);
    System.out.println("Docente: " + docente.getNombre());
    System.out.println("Especialidad del Docente: " + docente.getEspecialidad());
    System.out.println("-------------------------------");
    for (Estudiante estudiante : estudiantes) {
        System.out.println(estudiante);
    }
}
```

clase `Main`
```java
// Creamos los objetos Docente
Docente d1 = new Docente("Dr. Pérez", "Matemáticas");
Docente d2 = new Docente("Lic. Gómez", "Ciencias");

// Creamos los objetos Estudiante
Estudiante e1 = new Estudiante("Juan", "12345");
Estudiante e2 = new Estudiante("Ana", "12346");
Estudiante e3 = new Estudiante("Carlos", "12347");

// Creamos los objetos Curso
Curso c1 = new Curso("Matemáticas Avanzadas", d1);
Curso c2 = new Curso("Ciencias  Moderna", d2);

// Agregamos los estudiantes a la lista
c1.agregarEstudiante(e1);
c1.agregarEstudiante(e2);
c2.agregarEstudiante(e3);

// Mostramos los estudiantes
c1.mostrarListadoEstudiantes();
System.out.println();
c2.mostrarListadoEstudiantes();
```

### 18. Polimorfismo – Figuras Geométricas
### Codigo:
```
POO/FigurasGeometricas/
        Figura.java
        Circulo.java
        Cuadrado.java
        Triangulo.java
        Main.java
```

**Proposito:** Crea una clase base Figura con el método calcularArea(). Subclases: Cuadrado, Círculo y Triángulo, cada una con su propio cálculo.

**Conceptos:** herencia, polimorfismo.

**Desarrollo:**

Creamos una clase padre abstracta `Figura`, con el metodo abstracto `calcularArea()`.

clase `Cuadrado`
```java
// Atributo lado para calcular el area del cuadrado
private double lado;

// Creamos el constructor
public Cuadrado(double lado) {
    this.lado = lado;
}

// Modificamos el metodo calcularArea() de la clase padre, para realizar los calculos de acuerdo al cuadrado
@Override
public double calcularArea() {
    return lado * lado;
}
```

Para las clases Circulo y Triangulo, el proceso es el mismo solo que cambia la manera en que se calcula el area a cada firgura, junto con los atributos para realizar dichos calculos.

clase `Main`
```java
// Creamos los objetos de las figuras
Cuadrado cuadrado = new Cuadrado(5);
Circulo circulo = new Circulo(3);
Triangulo triangulo = new Triangulo(4, 6);

// Imprimimos los resultados
System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
System.out.println("Área del Círculo: " + circulo.calcularArea());
System.out.println("Área del Triángulo: " + triangulo.calcularArea());
```

### 19. Juego de Personajes
### Codigo:
```
POO/JuegoPersonajes/
        Personaje.java
        Main.java
```

**Proposito:** Crea una clase Personaje con atributos: nombre, vida y poder. Implementa un método atacar() que descuente puntos de vida a otro personaje. Simula una batalla entre dos personajes.

**Conceptos:** encapsulamiento, interacción entre objetos.

**Desarrollo:**

Creamos la clase `Personaje`, junto con los atributos `nombre`, `vida` y `poder`, junto con el constructor y el metodo `atacar()` y `estaVivo()`
```java
// El personaje que ejecuta el método atacar() le resta su poder a la vida del enemigo y muestra un mensaje describiendo el ataque.
public void atacar(Personaje enemigo) {
    enemigo.vida -= this.poder; 
    System.out.println(this.nombre + " atacó a " + enemigo.nombre + " y le quitó " + this.poder + " puntos de vida.");
}

// Retorna true si la vida es mayor que 0. Para saber si el personaje sigue en combate.
public boolean estaVivo() {
    return vida > 0;
}
```

clase `Main`
```java
// Creamos los objetos Personaje
Personaje personaje1 = new Personaje("Guerrero", 100, 20);
Personaje personaje2 = new Personaje("Mago", 80, 25);

// Bule while que valida el combate mientras los dos estén vivos.
while (personaje1.estaVivo() && personaje2.estaVivo()) {
    // El personaje1 ataca al personaje2
    personaje1.atacar(personaje2);
    // Valida si sigue vivo
    if (!personaje2.estaVivo()) {
        System.out.println(personaje2.nombre + " ha sido derrotado.");
        break;
    }

    // De igual forma
    personaje2.atacar(personaje1);
    if (!personaje1.estaVivo()) {
        System.out.println(personaje1.nombre + " ha sido derrotado.");
        break;
    }
}
```

### 20. Reloj Digital
### Codigo: POO/RelojDigital.java

**Proposito:** Crea una clase Reloj con atributos hora, minuto y segundo. Incluye métodos para incrementar segundos y mostrar la hora formateada correctamente.

**Conceptos:** encapsulamiento, validación de datos.

**Desarrollo:**

```java
// Creamos atributos
private int hora;
private int minuto;
private int segundo;

// Creamos el constructor, e inicializamos los atributos en cero
public RelojDigital() {
    this.hora = 0;
    this.minuto = 0;
    this.segundo = 0;
}

// Metodo para incrementar la hora
public void incrementarSegundos() {
    // Incrementamos el segundo de uno en uno
    segundo++;
    if (segundo == 60) {
        // Cuando el segundo llegue a 60, vuelve y se inicia a 0, y el minuto avanza de uno en uno
        segundo = 0;
        minuto++;
        if (minuto == 60) {
            // Cuando el minuto llegue a 60, vuelve a 0, y la hora aumenta
            minuto = 0;
            hora++;
            if (hora == 24) {
                // Cuando la hora llegue a 24, esta vuelva a 0
                hora = 0;
            }
        }
    }
}

// mostramos la hora en formato de 2 dígitos:
public String mostrarHora() {
    return String.format("%02d:%02d:%02d", hora, minuto, segundo);
}
```
```java
// Creamos el objeto RelojDigital
RelojDigital reloj = new RelojDigital();
        
while (true) {
    // Limpia la consola, para que solo se vea la hora en una linea y no en varias imprimiendose.
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Reloj Digital:");
    // Mostramos la hora
    System.out.println(reloj.mostrarHora());
            
    // Espera cada 1 segundo y usamos el metodo de incrementar segundos
    Thread.sleep(1000);
    reloj.incrementarSegundos();
}
```

## Ejercicios de Razonamiento y Lógica Algorítmica

### 21. Números amigos
### Codigo: NumerosAmigos.java

**Proposito:** Dos números son amigos si la suma de los divisores propios del primero es igual al segundo, y viceversa (por ejemplo, 220 y 284). Solicita dos números y determina si son amigos.

**Conceptos:** bucles, funciones, análisis de divisores.

**Desarrollo:**

```java
public static int sumaDivisores(int n) { // Define el método sumaDivisores que recibe un número n 
    int suma = 0; // Incializa la variable suma en 0
    // Bucle for que recorre todos los números desde 1 hasta n/2, porque ningún divisor propio puede ser mayor que la mitad del número.
    for (int i = 1; i <= n / 2; i++) { 
        if (n % i == 0) { // verifica si i es divisor (n % i == 0).
            suma += i; // Si lo es, lo suma a la variable suma.
        }
    }

    // Devuelve la suma total de los divisores propios (excluyendo al mismo número).
    return suma;
}
```
```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Pide el primer número (num1) y el segundo (num2).
    System.out.print("Ingresa el primer numero: ");
    int num1 = sc.nextInt();

    System.out.print("Ingresa el segundo numero: ");
    int num2 = sc.nextInt();

    // Llama a la función sumaDivisores para cada número. Guarda las sumas resultantes en suma1 y suma2.
    int suma1 = sumaDivisores(num1);
    int suma2 = sumaDivisores(num2);

    // Verifica la condición matemática de números amigos
    if (suma1 == num2 && suma2 == num1) {
        // Si ambas condiciones se cumplen imprime que son números amigos.
        System.out.println(num1 + " y " + num2 + " son numeros amigos.");
    } else {
        // Si no indica que no lo son.
        System.out.println(num1 + " y " + num2 + " NO son numeros amigos.");
    }

    sc.close();
```

### 22. Caminos posibles en una cuadrícula
### Codigo: CaminosCuadricula.java

**Proposito:** Dada una cuadrícula de tamaño N x M, calcula cuántos caminos diferentes hay para ir desde la esquina superior izquierda hasta la inferior derecha, moviéndose solo hacia abajo o hacia la derecha.

**Conceptos:** recursividad o combinatoria, razonamiento lógico.

**Desarrollo:**

```java
public static int caminosRec(int i, int j, int N, int M) {
    // Si estamos en la última fila o en la última columna, solo queda un camino posible: Seguir todo hacia la derecha. O seguir todo hacia abajo
    if (i == N - 1 || j == M - 1)
        return 1; // Por eso retorna 1

    // Desde cualquier celda, tienes dos opciones: Avanzar abajo (i+1, j)Avanzar derecha (i, j+1)
    return caminosRec(i + 1, j, N, M) + caminosRec(i, j + 1, N, M);
}
```
Este método calcula cuántos caminos hay desde una posición (i, j) hasta la esquina inferior derecha de una cuadrícula de tamaño N filas × M columnas, pudiendo moverse solo derecha o abajo.


```java
public static void main(String[] args) {
    // Define el tamaño de la cuadricula
    int N = 3;
    int M = 4;

    // Llama a la función caminosRec empezando desde la posición (0, 0), que es la esquina superior izquierda.
    System.out.println("Número de caminos: " + caminosRec(0, 0, N, M));
}
```

### 23. Simulación de un sistema de colas
### Codigo: SimulacionFila.java

**Proposito:** Simula una fila en una tienda o banco. Cada cliente tiene un tiempo de atención aleatorio. Muestra el tiempo total de espera y el tiempo promedio por cliente.

**Conceptos:** colas, bucles, acumuladores, aleatoriedad.

**Desarrollo:**

```java
// Crea un objeto Random para generar tiempos aleatorios de atención.
Random random = new Random();

// Crea una cola (Queue) llamada fila para simular la fila de clientes.
Queue<Integer> fila = new LinkedList<>();
```

Pregunta cuántos clientes habrá en la fila.
En un ciclo:
- Genera un tiempo de atención aleatorio entre 1 y 10 minutos.
- Agrega ese tiempo a la cola.
```java
System.out.print("¿Cuantos clientes hay en la fila? ");
int cantidadClientes = sc.nextInt();

for (int i = 0; i < cantidadClientes; i++) {
    int tiempoAtencion = random.nextInt(10) + 1;
    fila.add(tiempoAtencion);
}
```

```java
int tiempoTotal = 0; // suma de todos los tiempos.
int clienteNum = 1; // contador visual ej: Cliente 1, Cliente 2, etc.

System.out.println("\nSimulacion de Atencion");

while (!fila.isEmpty()) {
    int tiempo = fila.poll(); // .poll() extrae el primer cliente
    
    // Muestra cuántos minutos tardará.
    System.out.println("Cliente " + clienteNum + ": " + tiempo + " minutos de atención");
    tiempoTotal += tiempo; // Suma ese tiempo al total.
    clienteNum++; // Avanza al siguiente número de cliente.
}
```

```java
// Calcula el tiempo promedio dividiendo el total entre el número de clientes.
double tiempoPromedio = (double) tiempoTotal / cantidadClientes;

// Muestra el tiempo total de atención.
System.out.println("\nTiempo total de espera: " + tiempoTotal + " minutos");

// Muestra el tiempo promedio con 2 decimales usando printf.
System.out.printf("Tiempo promedio por cliente: %.2f minutos\n", tiempoPromedio);
```

### 24. Ahorcado básico (juego de texto)
### Codigo: Ahorcado.java

**Proposito:** Crea un programa que seleccione una palabra secreta al azar y permita al usuario adivinarla letra por letra. Finaliza cuando adivine toda la palabra o se quede sin intentos.

**Conceptos:** cadenas, bucles, condicionales, control de estados.

**Desarrollo:**

```java
Scanner sc = new Scanner(System.in);

// Define una lista de palabras posibles dentro del juego.
String[] palabras = {"java", "programa", "teclado", "computadora", "variable"};

// Random para elegir una palabra secreta al azar.
Random rand = new Random();
String palabraSecreta = palabras[rand.nextInt(palabras.length)];

// Crea un arreglo de caracteres con la misma longitud que la palabra secreta.
char[] progreso = new char[palabraSecreta.length()];
for (int i = 0; i < progreso.length; i++) {
    // Lo llena con guiones bajos _ para mostrar qué letras faltan por descubrir.
    progreso[i] = '_';
}

// nicializa el número de intentos del jugador (6 fallos permitidos).
int intentos = 6;

System.out.println("Ahorcado");
System.out.println("Tienes " + intentos + " intentos para adivinar la palabra secreta.");

// bucle que se ejecuta mientras quede al menos 1 intento.
while (intentos > 0) {
    System.out.println("\nPalabra: " + String.valueOf(progreso));
    System.out.print("Ingresa una letra: ");
    // Muestra el progreso actual de la palabra. Pide al jugador una letra y la convierte a minúscula.
    char letra = sc.next().toLowerCase().charAt(0);

    // variable acierto para saber si la letra acertó o falló.
    boolean acierto = false;


    // Recorre la palabra secreta letra por letra.
    for (int i = 0; i < palabraSecreta.length(); i++) {
        // Si encuentra coincidencias: Reemplaza _ por la letra acertada en progreso.
        if (palabraSecreta.charAt(i) == letra) {
            progreso[i] = letra;
            // Marca que hubo un acierto.
            acierto = true;
        }
    }

    if (!acierto) {
        // Si el jugador falló, se reduce un intento.
        intentos--;
        System.out.println("Letra incorrecta. Te quedan " + intentos + " intentos.");
    } else {
        // Si acertó, muestra un mensaje positivo.
        System.out.println("La letra esta en la palabra.");
    }

    // Si la palabra esta completa el programa termina y el jugador/usuario gano.
    if (String.valueOf(progreso).equals(palabraSecreta)) {
        System.out.println("\nLe atinaste a la palabra: " + palabraSecreta);
        return;
    }
}
// Si se quedo son intentos muestra el mensaje de que perdio. Y muestra la palabra.
System.out.println("\nTe has quedaste sin intentos. La palabra es: " + palabraSecreta);

sc.close();
```

### 25. Planificador de tareas
### Codigo:
```
PlanificadorTareas
    /Planificador.java, 
    /Tarea.java, 
    /Main.java
```

**Proposito:** Crea una clase Tarea (nombre, prioridad, estado) y una clase Planificador que gestione una lista de tareas. Permite agregar, completar y listar tareas pendientes o finalizadas.

**Conceptos:** POO, listas, filtrado y lógica condicional.

**Desarrollo:**

* En la clase Tarea (`PlanificadorTareas/Tareas.java`), se crean los atributos con modificadores de acceso private y tipos de datos desde String, int hasta boolean, que son los que identifican cada tarea. Se crea el constructor Tarea, pone la tarea en no completada al inicio. Se crean los metodo get para acceder a los datos privados. Metodo `completar()` para marcar la tarea completada, y pcambiar el estado de `false` a `true`. Metodo `toString()` imprime la informacion de la tarea.

Clase `Planificador.java`
```java
// Define una lista que almacenara todas las tareas
private List<Tarea> tareas;

// La inicializa en el constructor
public Planificador() {
    this.tareas = new ArrayList<>();
}
```

```java
// Crea una nueva tarea con nombre y prioridad
public void agregarTarea(String nombre, int prioridad) {
    // La agrega a la lista
    tareas.add(new Tarea(nombre, prioridad));
    
    // Informa que se agrego
    System.out.println("Tarea agregada: " + nombre);
}
```
```java
// Busca una tarea por nombre sin importar mayusculas o minisculas.
public void completarTarea(String nombre) {
    for (Tarea t : tareas) {
        // Si la encuentra la marca como completada
        if (t.getNombre().equalsIgnoreCase(nombre)) {
            t.completar();
            System.out.println("Tarea completada: " + nombre);
            return;
        }
    }
    // Si no existe, informa que no la encontro
    System.out.println("No se encontró la tarea: " + nombre);

```
```java
// Muestra las tareas que estan pendientes
public void listarPendientes() {
    System.out.println("\nTareas Pendientes");
    for (Tarea t : tareas) {
        // Usa el toString() para imprimirlas
        if (!t.estaCompletada()) {
            System.out.println(t);
        }
    }
}
```
```java
// Muestra las tareas completadas
public void listarFinalizadas() {
    System.out.println("\nTareas Finalizadas");
    for (Tarea t : tareas) {
        if (t.estaCompletada()) {
            System.out.println(t);
        }
    }
}
```
```java
// Muestra todas las tareas
public void listarTodas() {
    System.out.println("\nTodas las tareas");
    for (Tarea t : tareas) {
        System.out.println(t);
    }
}
```

`PlanificadorTareas/Main.java`
```java
// Crea el objeto Planificador
Planificador plan = new Planificador();
// Agrega tres tareas nuevas
plan.agregarTarea("Estudiar Java", 1);
plan.agregarTarea("Hacer ejercicio", 2);
plan.agregarTarea("Comprar comida", 3);
// Muestra todas las tareas pendiente
plan.listarPendientes();

// Marca la tarea "Hacer ejercicio" como completada
plan.completarTarea("Hacer ejercicio");

// Lista las tareas, pendienes, completadas y todas
plan.listarPendientes();
plan.listarFinalizadas();
plan.listarTodas();
```