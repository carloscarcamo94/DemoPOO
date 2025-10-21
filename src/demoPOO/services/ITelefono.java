package demoPOO.services;

import demoPOO.models.Telefono;

public interface ITelefono {
	
	
	public boolean guardar(Telefono tel);
	public Telefono recuperar(String numero);
	public boolean modificar(Telefono tel);
	public boolean borrar(String numero);
	
	
}
