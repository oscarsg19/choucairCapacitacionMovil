package choucair.moviles.app.utils;

public class PersistentData {
	
	private static PersistentData pd = null;
	private String dato1;
	public String getDato1() {return this.dato1;}
	public void setDato1(String dato) {this.dato1 = dato;}
	
	public static PersistentData getPersistentData()
	{
		if(pd == null)
			pd = new PersistentData();
		
		return pd;
	}
}