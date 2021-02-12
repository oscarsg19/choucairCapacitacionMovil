package choucair.moviles.app.steps;

import choucair.moviles.app.ui.InformeGastosUI;
import choucair.moviles.app.ui.LoginUI;
import choucair.moviles.app.utils.AccionesObjetos;
import net.thucydides.core.annotations.Step;

public class InformeGastos {
	
	private AccionesObjetos ao;
	
	@Step("ingresando usuario {0} y clave {1}")
	public void hacerLogin(String usu,String pass) {
		ao.setInputText(LoginUI.txtUserName(), usu);
		ao.setInputText(LoginUI.txtContrasena(), pass);
		ao.clickObjeto(LoginUI.btnIngresar());
	}
	
	
	public void iniciaInformeGastos() { 
		ao.clickObjeto(InformeGastosUI.BtnExpenseReport());
	}
	
	public void agregarInforme() { 
		ao.clickObjeto(InformeGastosUI.BtnAddButton());
	}
	
	public void eliminarInforme() { 
		ao.clickObjeto(InformeGastosUI.BtnDeleteReport());
	}
	
	
	public void retrocederInforme() { 
		ao.clickObjeto(InformeGastosUI.BtnBackButton());
	}
	
}
