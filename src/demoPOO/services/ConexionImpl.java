package demoPOO.services;

import demoPOO.utils.VerificarRecursos;

public class ConexionImpl extends VerificarRecursos implements IConexion {

	@Override
	public void verificaConexion() {
		// Aca se aplica toda la lógica que debe tener el método verificarConexion
		
		System.out.println("Conexión verificada...");
		
	}

	@Override
	public void verificaConexion(String numTelefono) {
		// Logica para verificar conexión con número de teléfono
		
		System.out.println("Conexión verificada para el teléfono: " + numTelefono);
		
	}

	@Override
	public void verificaConexion(int imei) {
		// Verificar conexión por medio del IMEI
		
		System.out.println("Conexión verificada para el IMEI: " + imei);
	}

	@Override
	public boolean verificaConexion(String numTelefono, int imei) {
		// Verificando por dos métodos
        System.out.println("Verificando conexión para el teléfono " + numTelefono + " y el IMEI " + imei);

        // 
        if (numTelefono.startsWith("7") && imei > 100000) {
            System.out.println("Conexión válida");
            return true;
        } else {
            System.out.println("Conexión no válida");
            return false;
        }
    }
}
