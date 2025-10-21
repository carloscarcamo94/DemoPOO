package demoPOO.models.dto;

import demoPOO.models.DetalleTelefono;
import demoPOO.models.Telefono;

public class TelefonoDTO {

	private Telefono telefono;
	
	private DetalleTelefono detalleTelefono;

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public DetalleTelefono getDetalleTelefono() {
		return detalleTelefono;
	}

	public void setDetalleTelefono(DetalleTelefono detalleTelefono) {
		this.detalleTelefono = detalleTelefono;
	}
	
	
}
