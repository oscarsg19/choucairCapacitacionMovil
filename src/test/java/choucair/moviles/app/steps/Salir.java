package choucair.moviles.app.steps;

import choucair.moviles.app.ui.LoginUI;
import choucair.moviles.app.ui.SalirUI;
import choucair.moviles.app.utils.AccionesObjetos;
import net.thucydides.core.annotations.Step;

public class Salir {
	
private AccionesObjetos ao;
	
	@Step("ingresando usuario {0} y clave {1}")
	public void hacerLogin(String usu,String pass) {
		ao.setInputText(LoginUI.txtUserName(), usu);
		ao.setInputText(LoginUI.txtContrasena(), pass);
		ao.clickObjeto(LoginUI.btnIngresar());
	}
	
	public void salirDeSesion() { 
		ao.clickObjeto(SalirUI.BtnLogout());
	}
}
