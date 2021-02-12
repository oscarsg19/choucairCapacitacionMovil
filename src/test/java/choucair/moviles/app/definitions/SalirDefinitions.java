package choucair.moviles.app.definitions;

import choucair.moviles.app.steps.Login;
import choucair.moviles.app.steps.Salir;
import choucair.moviles.app.steps.VerificarMensajeAcceso;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SalirDefinitions {
	
	@Steps
	Login Login;
	@Steps
	VerificarMensajeAcceso verificarAccesoApp;
	@Steps
	Salir Salir;
	
	@When("^que Oscar ingresa a Logout$")
	public void queOscarIngresaALogout() {
	    Salir.salirDeSesion();
	}


	@Then("^podra ver el cierre de sesion exitoso$")
	public void podraVerElCierreDeSesionExitoso() {
	   
	}

}
