package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instrucciin "switch".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion switch";
	}

	/**
	 * Instruccion switch - Ejercicio1.
	 *
	 * Modificar el metodo  para que al introducir un calificacion numerica  por teclado(1-10) se muestre 
	 * la calificacion de forma textual (1-4 -> Insuficiente , 5 -> Suficiente, 6 -> Bien, 
	 * 7-8 -> Notable, 9 -> Sobresaliente, 10 -> Matricula)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion

		int nota=0;
		
		System.out.println("Introduzca la calificación:");
		
		nota=Teclado.readInteger();

		switch(nota){

		case 1:
		case 2:
		case 3:
		case 4:
                      	System.out.println("Insuficiente");
		      	break;
		case 5:
		      	System.out.println("Suficiente");
		      	break;
		case 6:
		     	System.out.println("Bien");
			break;
		case 7:
		case 8:
		     	System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Matricula");
			break;
		default:
			System.out.println("La calificación es incorrecta");
		}
        // Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio2.
	 *
	 * Modificar el metodo  para que retorne el numero de anillos que tiene un digito entero 
	 * introducido por el teclado. Se definen los anillos de un digito como el numero de circulos
	 * que tiene un digito. Ej.: 0 -> 1 anillo, 2 -> 0 anillos, 8 -> 2 anillos, etc.).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");
		
		// Inicio modificacion
		int num=0;
		int ultimoDigito=0;
		
		System.out.println("Introduzca un  numero: ");
		num = Teclado.readInteger();

		ultimoDigito = num % 10;

		switch(ultimoDigito){

		case 0:
			System.out.println("Tiene un anillo");
			break;
		case 8:
			System.out.println("Tiene dos anillos");
			break;
		default:
			System.out.println("No tiene anillos");
		}
		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio3.
	 *
	 * Modificar el metodo ejercicio3() del Apartado030103, utilizando una sentencia switch, 
	 * para que realice la misma funcionalidad que el metodo ejercicio4() del Apartado030102.
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		int num1 = 0;
		int num2 = 0;
		int opcion = 0;
		int suma = 0;
		int multiplicacion = 0;

		System.out.println("Introduzca el numero1: ");

		num1 = Teclado.readInteger();

		System.out.println("Introduzca el numero2: ");

		num2 = Teclado.readInteger();
		 	
		System.out.println("Elija una opcion: 1-Sumar 2-Multiplicar 3-Divisores");
		
		opcion = Teclado.readInteger();
		
		switch(opcion){

		case 1:
			suma = num1 + num2;
			System.out.println("Suma: " + suma);
			break;
		case 2:
			multiplicacion = num1 * num2;
			System.out.println("Multiplicación: " + multiplicacion);
			break;
		case 3:
			if(num1 % num2 == 0){

				System.out.println("El numero1 es divisor del numero2");

			}else if(num2 % num1 == 0){

				System.out.println("El numero2 es divisor del numero1");
			
			}else{

				System.out.println("El numero1 no es divisor del numero2 y viceversa");

			}
			break;
		default:
			System.out.println("Opcion incorrecta");
		}
		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio4.
	 *
	 * Modificar el metodo ejercicio4() del Apartado030103  para que al introducir una cadena de caracteres 
	 * por teclado  se indique si el primer caracter de la cadena es una vocal escrita en minusculas, 
	 * si es una vocal escrita en mayusculas o si es otro tipo de caracter.
	 * 
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		// Fin modificacion
	}
}
