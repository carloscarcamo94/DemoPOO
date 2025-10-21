package demoPOO.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import demoPOO.models.Telefono;
import demoPOO.utils.ConexionMySql;

public class TelefonoImpl implements ITelefono{

	@Override
	public boolean guardar(Telefono tel) {
		
		ConexionMySql con = new ConexionMySql();
		Connection conexion = con.getConexion();
		
		PreparedStatement ps;
		String sql = "INSERT INTO telefono (marca, modelo, serie, numero) values (?,?,?,?)";
		
		try {
			ps = conexion.prepareStatement(sql);
			ps.setString(1, tel.getMarca());
			ps.setString(2, tel.getModelo());
			ps.setString(3, tel.getSerie());
			ps.setString(4, tel.getNumero());
			ps.execute();
			return true;
		} catch (Exception e) {
			System.out.println("Error");
			System.out.println(e);
			return false;
		}
	}

	@Override
	public Telefono recuperar(String numero) {
		
		ConexionMySql con = new ConexionMySql();
		Connection conexion = con.getConexion();
		
		PreparedStatement ps;
		ResultSet rs;
		String sql = "select * from telefono where numero=?";
		Telefono tel = new Telefono();
		
		try {
			ps = conexion.prepareStatement(sql);
			ps.setString(1, numero);
			rs = ps.executeQuery();
			
			if (rs.next()){
				
				tel.setMarca(rs.getString("marca"));
				tel.setModelo(rs.getString("modelo"));
				tel.setSerie(rs.getString("serie"));
			}

		} catch (Exception e) {

			System.err.println("Error en recuperar teléfono...");
			System.err.println(e);
		}
		
		return tel;
	}

	@Override
	public boolean modificar(Telefono telefono) {
		
		ConexionMySql con = new ConexionMySql();
		Connection conexion = con.getConexion();
		
		PreparedStatement ps;
		String sql = "update telefono set marca=?, modelo=?, serie=? where numero=?";
		
		try {
			ps = conexion.prepareStatement(sql);
			ps.setString(1, telefono.getMarca());
			ps.setString(2, telefono.getModelo());
			ps.setString(3, telefono.getSerie());
			ps.setString(4, telefono.getNumero());
			
			ps.execute();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean borrar(String numero) {
		
		ConexionMySql con = new ConexionMySql();
		Connection conexion = con.getConexion();
		
		PreparedStatement ps;
		String sql = "delete from telefono where numero=?";
		
		try {
			ps = conexion.prepareStatement(sql);
			ps.setString(1, numero);
			ps.execute();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

}
