package demoPOO;

import demoPOO.models.Componente;
import demoPOO.models.Conexion;
import demoPOO.models.ConexionInternet;
import demoPOO.models.EstadoTelefono;
import demoPOO.models.HistorialLlamadas;
import demoPOO.models.Telefono;
import demoPOO.services.ConexionImpl;

public class Main2 {

	public static void main(String[] args) {
		// Trabajando con objetos
		Telefono telefono = new Telefono();
		
		telefono.setMarca("Samsung");
		telefono.setModelo("Galaxy");
		telefono.setSerie("12345");
		telefono.setNumero("70607060");
		telefono.marcar("70607060");
		
		Conexion conn = new Conexion("0101", "Claro", "8.8.8.8");
		conn.setTelefono(telefono);
		conn.establecerConexion();
		
		ConexionInternet conexionInternet = new ConexionInternet("Claro", true, true); 
        conexionInternet.setTelefono(telefono);
        conexionInternet.establecerConexionInternet();
        
     // Crear estado del teléfono (ejemplo con valores simulados)
        EstadoTelefono estado = new EstadoTelefono(telefono, 80, 45, 60);
        estado.mostrarInforme();
        
     // Crear historial de llamadas
        HistorialLlamadas historial = new HistorialLlamadas();

        // Registrar llamadas simuladas
        historial.registrarLlamada("70607060");
        historial.registrarLlamada("78901234");
        historial.registrarLlamada("22001122");

        // Mostrar historial
        historial.mostrarHistorial();


		
		System.out.println("\n --- Datos del teléfono ---");
		System.out.println("Marca del teléfono: " + telefono.getMarca());
		System.out.println("Modelo del teléfono: " + telefono.getModelo());
		System.out.println("Serie del teléfono: " + telefono.getSerie());

		ConexionImpl conexionImpl = new ConexionImpl();
		conexionImpl.verificarBateria(50);
		conexionImpl.verificacionElectronica();
		conexionImpl.verificacionElectronica(null, null);
		
		// Usando el objeto componente
		Componente componente = new Componente();
	}

}
