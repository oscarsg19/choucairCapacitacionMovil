package choucair.moviles.app.model;

import choucair.moviles.app.models.User;

public class Data {
	
	private static Data data;
	private User usuario;

	public Data(){
		//Esto hace algo
	}
	
	public static Data getDatos(){
		if(data == null)
			data = new Data();
		
		return data;
	}

	public User getUsuario() {return usuario;}
	public void setUsuario(User usuario) {this.usuario = usuario;}
	
}
