package demoPOO.models;

public class Conexion {

	private String codProveedor;
	private String nombreProveedor;
	private Telefono telefono;
	
	// Constructor 
	public Conexion(String codProveedor, String nombreProveedor, String host) {
		
		this.codProveedor = codProveedor;
		this.nombreProveedor = nombreProveedor;
	}
	
	//Get and Set
	
	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}


	//Funcionalidades extras de la clase

	public void establecerConexion () {
		System.out.println("Buscando al proveedor " + this.codProveedor);
		System.out.println("Estableciendo conexión con... " + this.nombreProveedor);
		pingProveedor();
	}
	
	private void  pingProveedor() {
		
		System.out.println("Ping con el proveedor: " + this.nombreProveedor + " al número... " + telefono.getNumero());
		
	}
}
