# Ejercicios

### Ejercicio 1: 
Crear la clase Ejercicio01_DefinicionVariables, donde definiras las variables

 - anho
 - nombre_mes
 - dia
 - nombre_dia
 - es_dia_laboral
 
 Imprimir la informacion por consola.
 
 
 ### Ejercicio 2: 
Crear la clase Ejercicio02_ConversionYConstantes, donde:

 - Definir la variable byte fecha, con el valor del dia de hoy y asignar el valor a otra variable de tipo int
 - Definir la variable int salario, con el valor del 5000 y asignar el valor a otra variable de tipo byte
 - Definir como constante el IGV y el nombre del pais
 
 Imprimir la informacion por consola.
 
 
 ### Ejercicio 3: 
Crear la clase Ejercicio03_OperadorCondicional, donde: Si una variable x , es menor que 25, el valor a asignar es 25, caso contrario asignar a la variable x su propio valor


 ### Ejercicio 4: 
 
Crear la clase Ejercicio04_Condicional, donde debe calcular si un trabajador de 5ta categoria (en planilla) paga o no paga impuestos, las condiciones son :

 - Dado un sueldo mensual de 4000 soles y tienen 14 pagas   
 - Considerar que la UIT : 4600 soles  
 - Anualmente si ganas mas de 7 UIT pagas impuestos, si ganas menos de 7 UIT no pagas impuestos


### Ejercicio 5: 

Crear la clase Ejercicio05_For un contador con for de modo que

- El contador debe decrementar de 20 a 5 de 2 en 2
- Si el numero es multiplo de 4 debe imprimir , soy multiplo de cuatro
- Si el numero es multplo de 3 no debe imprimirlo
- Para los otros casos debe imprimir el numero

### Ejercicio 6: 

Crear la clase Ejercicio06_Array donde

- Crear un arreglo de enteros de tamanho 10
- Inicializar con el valor -1 a todos los elementos del arreglo
- Asignar los valores 3,6,9 ,....... a todos los elementos del arreglo
- Sumar todos los valores del arreglo


### Ejercicio 7: 

Los equipos de deportes tienen  la siguiente información , nombre del país, nombre del deporte, cantidad de integrantes y nombre del equipo. Representarlo en una clase adecuada. Usar la clase anterior e instanciarlo desde una aplicación e inicializar la información del equipo


### Ejercicio 8: 

En la clase del ejercicio 7 , crear un constructor para
todos los atributos y crear los siguiente objetos

- Deporte Voley 
-- cantidad de particiantes : 12
-- nombre del equipo : FPV


- Deporte Futbol 
-- cantidad de particiantes : 26
-- nombre del equipo : FPF


### Ejercicio 9:

Crear los métodos faltantes


	public class OperacionesMatematicas {
	
		public static void main(String[] args) {
		
			// TODO Auto-generated method stub
	
			int num1 = 20;
			int num2 = 12;
			// 1.- Crear un metodo que reste dos numeros enteros
			//     e imprima en consola el resultados 
			// 
			
			imprimeResta(num1,num2);
	
			// 2.- Crear un metodo que mulitplique dos numeros enteros
			//     y retorne el valor, imprimir el resulado obtenido
			
			int multi = retornaMultiplicacion(num1,num2);
			System.out.println("La multiplicacion es " + multi);
		}
		// TODO
	}




