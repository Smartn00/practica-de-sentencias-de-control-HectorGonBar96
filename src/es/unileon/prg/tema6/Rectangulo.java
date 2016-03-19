package es.unileon.prg.tema6;
/**
 * Clase que representa un rectangulo
 * 
 * @author PRG
 * @version 1.0
 */
public class Rectangulo {
	/**
	 * Base del rectangulo
	 * 
	 */
	private int _base;
	/**
	 * Altura del rectangulo
	 * 
	 */
	private int _altura;

	private int _area;
	
	private int _perimetro;

	
	/**
	 * Constructor de la clase. Crea un rectangulo sin dimensiones
	 */
	public Rectangulo() {
		_base = 0;
		_altura = 0;
		_area = 0;
		_perimetro = 0;
	}

	/**
	 * Constructor de la clase. Crea un rectangulo con las dimensiones introducidas
	 * Si la dimensiones son menores que 0 crea un rectangulo sin dimensiones (base=0 y altura=0)
	 * 
	 * @param base
	 *           Base del rectangulo
	 * @param altura
	 *           Altura del rectangulo
	 */
	public Rectangulo(int base, int altura) {

		//Inicio modificacion ejercicio07
		
		_base = base;
		_altura = altura;

		if( base<=0 && altura<=0){
		_base=0;
		_altura=0;
		}
		
		//Fin modificacion ejercicio07		
	}
	
	/**
	 * Obtiene la base del rectangulo
	 * 
	 * @return Retorna la base del Rectangulo
	 */
	public int getBase(){
		return _base;
	}
	
	
	/**
	 * Obtiene la altura del rectangulo
	 * 
	 * @return Retorna la altura del Rectangulo
	 */
	public int getAltura(){
		return _altura;
	}

	/**
	 * Modifica la base del rectangulo solo si la base introducida  es mayor que 0
	 * 
	 * @param base 
	 * 		Base del Rectangulo
	 */
	public void setBase(int base){
		//Inicio modificacion ejercicio07

		if(base > 0){
				System.out.println("Introduce la nueva base del rectangulo:");
				base=Teclado.readInteger();
		}
		
		//Fin modificacion ejercicio07			
	}

	
	/**
	 * Modifica la altura del rectangulo solo si la altura introducida  es mayor que 0
	 * 
	 * @param altura 
	 * 		Altura del Rectangulo
	 */
	public void setAltura(int altura){
		//Inicio modificacion ejercicio07

		if(altura>0){
			
			System.out.println("Introduce la nueva altura del rectangulo:");
			altura=Teclado.readInteger();
		}
		
		
		//Fin modificacion ejercicio07		
	}
	
	
	/**
	 * Retorna si el rectangulo es un cuadrado
	 * 
	 * @return
	 * 		Retorna true si el rectangulo es un cuadrado y false si no lo es.
	 * 		Un resctagulo sin dimensiones (base=0 y altura=0) no se considera un cuadrado
	 */
	
	public boolean esUnCuadrado(){

		boolean esUnCuadrado=false;
		//Inicio modificacion ejercicio07

		if(_base==_altura){

			esUnCuadrado=true;
		}

		if(_base==0 && _altura==0){
			
			esUnCuadrado=false;

		}

		//Fin modificacion ejercicio07
		return esUnCuadrado;
		
	}
	
	/**
	 * Retorna el area del rectangulo
	 * 
	 * @return
	 * 		Retorna el area del rectangulo
	 */
	public long getArea(){
	
			
		_area = _base * _altura;

		return _area;
		
	}
	
	 /**
	 * Retorna el perimetro del rectangulo
	 * 
	 * @return
	 * 		Retorna el perimetro del rectangulo
	 */
	public long getPerimetro(){
		
		_perimetro = (_base*2 + _altura*2);
	
		return _perimetro;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * 
	 * Si el rectangulo es un cuadrado se indica con el texto: Es un cuadrado.
	 */
	
	public String toString() {
		StringBuffer salida = new StringBuffer();
		
		salida.append("Rectangulo: "+" ");
		salida.append("base: "+_base+" ");
		salida.append("altura: "+_altura+" ");
		salida.append("area: "+ _area +" "); 
		salida.append("perimetro: "+ _perimetro +" "); 
		

		//Inicio modificacion ejercicio07

		if(esUnCuadrado()==true){
		salida.append(" Es un cuadrado");
		}
		

		//Fin modificacion ejercicio07
		return salida.toString();	
		
	}
	
	/* -- Inicio modificacion del ejercicio09 Apartado030201.
	 * int compareTo(Rectangulo rectangulo){
	 * 
	 * 
	 * }
	 * -- Fin modificacion del ejercicio09 Apartado030201.
	 */
	
	
	
}
