package choucair.moviles.app.models;

public class User {
	private String id;
	private String nombre;
	private String usuario;
	private String contrasena;
	
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getUsuario(){
		return usuario;
	}
	public void setUsuario(String usuario){
		this.usuario = usuario;
	}
	public String getContrasena(){
		return contrasena;
	}
	public void setContrasena(String contrasena){
		this.contrasena = contrasena;
	}
}