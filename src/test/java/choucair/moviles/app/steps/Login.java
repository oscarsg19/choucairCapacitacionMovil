package choucair.moviles.app.steps;

import choucair.moviles.app.ui.LoginUI;
import choucair.moviles.app.utils.AccionesObjetos;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Login extends PageObject {

	private AccionesObjetos ao;
	
	@Step("ingresando usuario {0} y clave {1}")
	public void hacerLogin(String usu,String pass) {
		ao.setInputText(LoginUI.txtUserName(), usu);
		ao.setInputText(LoginUI.txtContrasena(), pass);
		ao.clickObjeto(LoginUI.btnIngresar());
	}
	
	
	@Step("ingresando usuario {0} y clave {1}")
	public void hacerLoginFallido(String usu,String pass) {
		ao.setInputText(LoginUI.txtUserName(), usu);
		ao.setInputText(LoginUI.txtContrasena(), pass);
		ao.clickObjeto(LoginUI.btnIngresar());
	}
	
	public void salirLoginFallido() {
		ao.clickObjeto(LoginUI.BtnInvalidPass());
	}
}