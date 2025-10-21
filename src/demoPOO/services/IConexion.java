package demoPOO.services;

public interface IConexion {

	// Solo define los métodos
	
	public void verificaConexion();
	public void verificaConexion(String numTelefono);
	public void verificaConexion(int imei);
	public boolean verificaConexion(String numTelefono, int imei);
}
