package choucair.moviles.app.steps;

import org.junit.Test;

import choucair.moviles.app.ui.HipotecaUI;
import choucair.moviles.app.ui.HomePageUI;
import choucair.moviles.app.ui.LoginUI;
import choucair.moviles.app.utils.AccionesObjetos;
import net.thucydides.core.annotations.Step;

public class Hipoteca {
	
private AccionesObjetos ao;
	
	@Step("ingresando usuario {0} y clave {1}")
	public void hacerLogin(String usu,String pass) {
		ao.setInputText(LoginUI.txtUserName(), usu);
		ao.setInputText(LoginUI.txtContrasena(), pass);
		ao.clickObjeto(LoginUI.btnIngresar());
	}
		
	public void iniciaHipoteca() { 
		ao.clickObjeto(HipotecaUI.BtnMortgageRequest());
	}
	
	@Step("ingresando firstName {0}, lastName {1}, Age {2}, address1 {3}, address2 {4}, country {5}")
	public void realizarHipoteca(String firstName, String lastName, String Age, String address1, String address2, String country) { 
		ao.setInputText(HipotecaUI.TxtFirstName(), lastName);
		ao.setInputText(HipotecaUI.TxtLastName(), lastName);
		ao.setInputText(HipotecaUI.TxtAge(), Age);
		ao.setInputText(HipotecaUI.TxtAddresOne(), address1);
		ao.setInputText(HipotecaUI.TxtAddresTwo(), address2);
		ao.setInputText(HipotecaUI.TxtCountry(), country);
		
		ao.clickObjeto(HipotecaUI.BtnNext());
	}
	
	public void seleccionaTipoPrestamo() { 
		ao.clickObjeto(HipotecaUI.BtnTypeLoan());
	}
	
	
	public void seleccionaNumeroAnios() { 
		ao.clickObjeto(HipotecaUI.BtnNumberYear());
	}
	
	
	
	@Test
	public void deslizarPantallaH() { 
		ao.swipe(544, 1941, 547, 279);
	} 
	
	
	
	public void seleccionaTipoOcupacion() { 
		ao.clickObjeto(HipotecaUI.BtnTypeOcupation());
	}
	
	
	public void seleccionaIngresosAnuales() { 
		ao.clickObjeto(HipotecaUI.BtnYearlyIncome());
	}
	
	
	public void seleccionaGuardar() { 
		ao.clickObjeto(HipotecaUI.BtnSave());
	}
	
	
	@Step("se muestra el mensaje {0}")
	public void verificarAccesoApp(String mensaje){
		ao.verificarContieneMensaje(HomePageUI.lblMensaje(), mensaje);
	}
	
}
