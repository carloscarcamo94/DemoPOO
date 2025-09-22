package demoPOO;

import demoPOO.models.Telefono;

public class Main {

	public static void main(String[] args) {
		// Programa tipo de datos
		//tiposDeDatos();
		//tipoDatosString();
		//saludoConVariables("Cesar", 40);
		//Crear un método que dado dos números enteros, resuelvas las 4 operaciones matemáticas
		//operacionesMatematicas(5, 2);
		
		//Datos de tipo objeto
		Telefono telefono = new Telefono();
		
	}
	
	static private void usandoTelefono() {
		//Datos de tipo objeto
		Telefono telefono = new Telefono();
	}
	
	static private void operacionesMatematicas(int num1, int num2) {
		
		try {
			System.out.println("--- Operaciones Matemáticas Básicas ---");
			System.out.println("Los números ingresados son: " + num1 + " y " + num2);
			System.out.println("El resultado de la suma es: " + (num1 + num2));
			System.out.println("El resultado de la resta es: " + (num1 - num2));
			System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
			System.out.println("El resultado de la división es: " + (num1 / num2));
		} catch (Exception e) {
			System.out.println("Error al ejeuctar la aplicación");
		}
		
		
		
	}
	
	
	static private void saludoConVariables(String nombre, int edad) {
		
		System.out.println("Buenos días " + nombre + ", Edad: " + edad);
	}
	
	static private void tipoDatosString () {
		System.out.println("--- Tipo de datos String ---");
		String saludo = "Hola mundo";
		
		String saludo2 = new String();
		saludo2 = "Buenos días";
		
		System.out.println("El saludo es: " + saludo);
		System.out.println("Longitud de saludo: " + saludo.length());
		System.out.println("Saludo en mayúsculas: " + saludo.toUpperCase());
		System.out.println("El segundo saludo es: " + saludo2);
	}
	
	
	static private void tiposDeDatos () {
		System.out.println("--- Datos primitivos ---");
		
		char tipoChar = 'd';
		boolean tipoBooleano = true;
		byte tipoByte = 10;
		short tipoShort = 32767;
		int	tipoInt = 25625;
		long tipoLong = 6578901;
		float tipoFloat = 20.5f;
		double tipoDouble = 25.75;
		//--- String
		String tipoString = "Hola mundo!";
		
		System.out.println("Tipo de dato Char: " + tipoChar);
		System.out.println("Tipo de dato Boolean: " + tipoBooleano);
		System.out.println("Tipo de dato Byte: " + tipoByte);
		System.out.println("Tipo de dato Short: " + tipoShort);
		System.out.println("Tipo de dato Int: " + tipoInt);
		System.out.println("Tipo de dato Long: " + tipoLong);
		System.out.println("Tipo de dato Float: " + tipoFloat);
		System.out.println("Tipo de dato Double: " + tipoDouble);
		System.out.println("Tipo de dato String: " + tipoString);
		System.out.println("El lardo es: " + tipoString.length());
	}

}
