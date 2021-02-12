package choucair.moviles.app.definitions;

import java.io.IOException;
import java.util.List;

import choucair.moviles.app.models.User;
import choucair.moviles.app.steps.AbrirApp;
import choucair.moviles.app.steps.Login;
import choucair.moviles.app.steps.VerificarMensajeAcceso;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitions{

	@Steps
	Login login;
	@Steps
	AbrirApp abrirApp;
	@Steps
	VerificarMensajeAcceso verificarAccesoApp;
	
	@Given("^que (.*) abre la App Eribank$")
	public void queAbreLaAppEribank(String name) throws JsonParseException, JsonMappingException, IOException {
		abrirApp.iniciarAppEribank();
	}
	
	/*
	@When("^inicia sesion exitosa$")
	public void iniciaSesionExitosa(List<User> datos) {
		login.hacerLogin(datos.get(0).getUsuario(), datos.get(0).getContrasena());
	}
	
	@Then("^podria ver en el homepage el mensaje: (.*)$")
	public void podriaVerEnElHomepageElMensaje(String mensaje) {
		verificarAccesoApp.verificarAccesoApp(mensaje);
	}
	*/
	
	
	@When("^inicia sesion fallida$")
	public void iniciaSesionFallida(List<User> datos) {
		login.hacerLoginFallido(datos.get(0).getUsuario(), datos.get(0).getContrasena());
	}
	
	@Then("^podria ver un mensaje de clave incorrecta$")
	public void podriaVerMensajeClaveIncorrecta() {
		login.salirLoginFallido();;
	}
	
}