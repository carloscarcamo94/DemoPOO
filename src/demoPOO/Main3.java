package demoPOO;

import demoPOO.models.DetalleTelefono;
import demoPOO.models.Telefono;
import demoPOO.models.dto.TelefonoDTO;

public class Main3 {
	
	public static void main(String[] args) {
		
		//guardar();
		//recuperarUnTelefono("72465571");
		//modificar();
		borrar();
	}
	
	private static void testDTO() {
		TelefonoDTO telefonoDto = new TelefonoDTO();
		
		Telefono telefono = new Telefono();
		telefono.setMarca("Nokia");
		telefono.setModelo("N10");
		telefono.setSerie("55555");
		telefono.setNumero("72465571");
		
		DetalleTelefono detalleTelefono = new DetalleTelefono();
		detalleTelefono.setId(0);
		detalleTelefono.setVersion("Android");
		detalleTelefono.setVersionActiva(false);
		detalleTelefono.setIdTelefono(10);
		
	}
	
	private static void borrar() {
		Telefono tel = new Telefono();
		tel.borrar("72465571");
		
		if (tel.borrar("72465571")) {
			System.out.println("Telefono borrado");
		}
		else
			System.out.println("Error");
	}
	
	private static void modificar(){
		Telefono tel = new Telefono();
		tel.setMarca("Nokia");
		tel.setModelo("N10");
		tel.setSerie("55555");
		tel.setNumero("72465571");
		
		boolean r = tel.modificar(tel);
		if (r == true) {
			System.out.println("Teléfono modificado");
			recuperarUnTelefono(tel.getNumero());
		}
		else
			System.out.println("Error");
	}
	
	private static void recuperarUnTelefono(String numero) {
		Telefono tele = new Telefono();
		tele = tele.recuperar(numero);
		System.out.println("Marca: " + tele.getMarca() + " Modelo: " + tele.getModelo() + " Serie: " + tele.getSerie());
	}
	
	private static void guardar() {
		Telefono tel = new Telefono();
		tel.setMarca("Samsung");
		tel.setModelo("S24");
		tel.setSerie("67890");
		tel.setNumero("72435572");
		
		if (tel.guardar(tel))
			System.out.println("Teléfono guardado correctamente");
		else
			System.out.println("Error");
	}
}