package choucair.moviles.app.steps;

import choucair.moviles.app.ui.HomePageUI;
import choucair.moviles.app.utils.AccionesObjetos;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class VerificarMensajeAcceso extends PageObject {

	private AccionesObjetos ao;
	
	@Step("se muestra el mensaje {0}")
	public void verificarAccesoApp(String mensaje){
		ao.verificarContieneMensaje(HomePageUI.lblMensaje(), mensaje);
	}
}
