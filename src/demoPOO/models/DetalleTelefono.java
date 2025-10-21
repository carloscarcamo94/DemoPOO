package demoPOO.models;

public class DetalleTelefono {

	private int id;
	private boolean versionActiva;
	private String version;
	private int idTelefono;
	
	public int getIdTelefono() {
		return idTelefono;
	}
	public void setIdTelefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isVersionActiva() {
		return versionActiva;
	}
	public void setVersionActiva(boolean versionActiva) {
		this.versionActiva = versionActiva;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}
