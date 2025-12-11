# Taller 9 (Laboratorio)
## Construcción de programas usando arreglos unidimensionales

Revisar los ejercicios propuestos en el proyecto de Netbeans denominado: **EjerciciosT9**

## Parte A (en el paquete **paquet01**)
### Ejercicio 001

**Ejercicio.Java**

Genera una aplicación que permita ingresar valores a un arreglo de cadenas. El arreglo almacena el número de elementos
que el usuario lo disponga. Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.

Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe permitir ingresar ese número elementos.

Considerar las siguientes excepciones, no se contabilizan dentro del número de elementos, marcas que empiecen con las letras
A, C, T.

## Parte B (en el **paquete02**)
### Ejercicio 1
**Ejercicio01.Java**
Analizar el ejercicio, identificar la problemática y solucionarlo.

### Ejercicio 2
**Ejercicio02.Java**
Permitir que se cuenten las respuestas que están **fuera de los rangos establecidos** en una nueva categoría llamada **fuera-de-rango**

### Ejercicio 3
**Ejercicio03.Java**
Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.
```
int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
```

### Ejercicio 4
**Ejercicio04.Java**
Dados los siguientes arreglos
```
double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
```

Genere  los datos para el arreglo
```
String[] promediosCualitativos = new String[7];

```
* Promedio Regular son todas las notas >=0 y <=5.9
* Promedio Bueno son todas las notas >=6 y <=8.9
* Promedio Sobresaliente son todas las notas >=9 y <=10

Finalmente presentar un reporte como el que sigue:

```
Kimberly Gonzalez promedio: 10,00 promedio cualitativo ?
Mark Hogan promedio: 10,00 promedio cualitativo ?
Teresa Martinez promedio: 9,10 promedio cualitativo ?
Julia Johnson promedio: 7,00 promedio cualitativo ?
Mark Cook promedio: 6,10 promedio cualitativo ?
Jennifer Manning promedio: 4,00 promedio cualitativo ?
Juan Vasquez promedio: 8,00 promedio cualitativo ?
```

### Ejercicios 5
**Ejercicio05.java**

Generar una solución que permita ingresar los valor de ventas de un vendedor por cada día de la semana (lunes a viernes); donde día 0 es Lunes.

Usar 2 arreglos.
```
(ventas(5),i[0-n])  // arreglo que debe ser llenado por el usuario


(dias(5), x(20)[{a-z}, {BS}])
dias[0]<-- "Lunes"
dias[1]<-- "Martes"
dias[2]<-- "Miércoles"
dias[3]<-- "Jueves"
dias[4]<-- "Viernes"
```

Luego presentar un reporte así
```
- Lunes $130
- Martes $200
- Miércoles $190
- Jueves $200
- Viernes $100
```
### Ejercicios 6

**Ejercicio06.java**

Dados los siguientes arreglos

```
arreglo(3), x(50)[{a-z}, {A-Z}, {1-9}, BS]
arreglo[0] <-- "Café tradicional"
arreglo[1] <-- "Café francés"
arreglo[2] <-- "Café alemán"

arreglo(3),d[0-n]
arreglo[0] <-- 1.5
arreglo[1] <-- 2.1
arreglo[2] <-- 2.3

```

Generar una solución que permita de forma repetitiva solicitar a un cliente que seleccione los productos que desea comprar (hasta que le usuario lo decida). Por ejemplo, si el usuario decide comprar café tradicional, se debe preguntar el número de tazas y calcular el total a pagar por ese pedido solo pedido. Al final se debe presentar en una cada acumuladora lo siguiente.

```
El usuario ha comprado:

  Café tradicional (6 t), valor a cancelar $9
  Café alemán (3 t), valor a cancelar $6.3
  Café francés (2 t), valor a cancelar $4.6

Total a pagar: 19.6
```

### Ejercicio 7
**Ejercicio07.java**

Diseñe una solución que permita al usuario introducir 10 números en un arreglo, luego despliegue cada número y su diferencia a partir del promedio numérico de los números introducidos.
