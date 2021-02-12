package choucair.moviles.app.steps;

import org.junit.Test;
import choucair.moviles.app.ui.LoginUI;
import choucair.moviles.app.ui.PagoUI;
import choucair.moviles.app.utils.AccionesObjetos;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;




public class Pago extends PageObject {
	
	private AccionesObjetos ao;
	
		
	@Step("ingresando usuario {0} y clave {1}")
	public void hacerLogin(String usu,String pass) {
		ao.setInputText(LoginUI.txtUserName(), usu);
		ao.setInputText(LoginUI.txtContrasena(), pass);
		ao.clickObjeto(LoginUI.btnIngresar());
	}
	
	
	public void iniciaPago() { 
		ao.clickObjeto(PagoUI.BtnMakePayment());
	}
	
	
	/* //--------------------- NOTA: Usar si se ingresa el pais por teclado ---------------------
	@Step("ingresando phone {0}, name {1}, amount {2} y country {3}")
	public void ingresainformacionPago(String phone,String name, String mount, String country) { 
		ao.setInputText(PagoUI.TxtPhone(), phone);
		ao.setInputText(PagoUI.TxtName(), name);
		ao.setInputText(PagoUI.TxtAmount(), mount);
		ao.setInputText(PagoUI.TxtCountry(), country);
	}*/
	
	
	//--------------------- NOTA: Comentar si se ingresa el pais por teclado ---------------------
	@Step("ingresando phone {0}, name {1}, amount {2} y country {3}")
	public void ingresainformacionPago(String phone,String name, String mount, String country) { 
		ao.setInputText(PagoUI.TxtPhone(), phone);
		ao.setInputText(PagoUI.TxtName(), name);
		ao.setInputText(PagoUI.TxtAmount(), mount);
		ao.setInputText(PagoUI.TxtCountry(), country);
		ao.clickObjeto(PagoUI.BtnCountry());
	}
	
	//--------------------- NOTA: Comentar si se ingresa el pais por teclado ---------------------
	@Test
	public void deslizarPantallaP() { 
		ao.swipe(494, 1899, 547, 279);
	} 
		
	//--------------------- NOTA: Comentar si se ingresa el pais por teclado ---------------------
	@Test
	public void selecionaPais() { 
		ao.clickObjeto(PagoUI.BtnSelectCountry());	
		
	}
	
	
	public void AceptarPago() { 
		ao.clickObjeto(PagoUI.BtnSendPayment());
	}
	

	public void verificarPago(){
		ao.clickObjeto(PagoUI.BtnAccept());
	}

}
