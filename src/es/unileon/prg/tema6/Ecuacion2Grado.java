package es.unileon.prg.tema6;

public class Ecuacion2Grado {
	/**
	 * Primer coeficiente
	 * 
	 */
	private int _a;
	/**
	 * Segundo coeficiente
	 * 
	 */
	private int _b;
	/**
	 * Tercer coeficiente
	 * 
	 */
	private int _c;

	private int _discriminante;

	private double _x1;

	private double _x2;

	private int _solucion;

	
	
	/**
	 * Constructor de la clase.Crea los tres coeficientes inicializados a 0;
	 */
	public Ecuacion2Grado() {
		_a = 0;
		_b = 0;
		_c = 0;
		_discriminante=0;
		_solucion=0;
		_x1=0;
		_x2=0;
		
	}

	/**
	 * Constructor de la clase. 
	 * 
	 */
	public Ecuacion2Grado(int a, int b,int c) {

		_a = a;
		_b = b;
		_c = c;
		
	
	}
	
	/**
	 * Obtiene el primer coeficiente
	 * 
	 * @return Retorna el primer coeficiente de la ecuación
	 */
	public int getA(){
		return _a;
	}
	
	
	/**
	 * Obtiene el segundo coeficiente
	 * 
	 * @return Retorna el segundo coeficiente de la ecuación
	 */
	public int getB(){
		return _b;
	}


	/**
	 * Obtiene la base el tercer coeficiente
	 * 
	 * @return Retorna el tercer coeficiente de la ecuación
	 */
	public int getC(){
		return _c;
	}

	
	 /**
	 * Retorna el numero de soluciones de la ecuación de segundo grado
	 * 
	 * 
	 */
	public int numeroDeSoluciones(){

		
		
		_discriminante = ((_b * _b) - (4 * ( _a * _c )));


		if ( _discriminante < 0) {
		
		 _solucion = 0;

		}
		
		if ( _discriminante == 0) {
		
		_solucion = 1;

		}
		
		if ( _discriminante > 0) {
		
		_solucion = 2;

		}

		
		return _solucion;
		
	}

	public String toString(){

		StringBuffer salida = new StringBuffer();
		
		salida.append("El numero de soluciones: " + _solucion +" ");

		if (_solucion == 1){

		_x1 = (- _b) / (2 * _a);
		
		salida.append("La Solucion es, X1=X2 : "+ _x1);
		}
		
		if(_solucion ==2 ){
		
		        _x1 = ((- _b) + Math.sqrt( Math.pow(_b,2)-(4 * _a * _c ))) / (2 * _a);
			_x2 = ((- _b) - Math.sqrt( Math.pow(_b,2)-(4 * _a * _c )))/(2 * _a);
			salida.append("La Solucion es, X1 = " + _x1 + " y, X2 = " + _x2);
		 
		}
		return salida.toString();	
		
	}
}
	


