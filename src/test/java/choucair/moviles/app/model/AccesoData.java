package choucair.moviles.app.model;

import java.util.List;

public class AccesoData {
	
	private Conexion con;
	
	public AccesoData(Conexion con) {
		this.con = con;
	}
	
	public <T> List<T> getDatos(String contenido, Class<T> clazz){
		return con.getDatos(contenido, clazz);
	}

}
