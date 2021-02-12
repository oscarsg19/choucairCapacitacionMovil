package choucair.moviles.app.definitions;

import java.util.List;

import choucair.moviles.app.steps.Login;
import choucair.moviles.app.steps.Hipoteca;
import choucair.moviles.app.steps.VerificarMensajeAcceso;
import choucair.moviles.app.models.Hipo;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HipotecaDefinitions {
	
	@Steps
	Login Login;
	@Steps
	VerificarMensajeAcceso verificarAccesoApp;
	@Steps
	Hipoteca Hipoteca; 

	@When("^que Oscar ingresa a Mortgage Request$")
	public void queOscarIngresaAMortgageRequest() {
		Hipoteca.iniciaHipoteca();
	}


	@When("^que Oscar ingresa informacion de hipoteca$")
	public void queOscarIngresaInformacionDeHipoteca(List<Hipo> datosh) {
		Hipoteca.realizarHipoteca(datosh.get(0).getFirstName(), datosh.get(0).getLastName(), datosh.get(0).getAge(), datosh.get(0).getAddress1(), datosh.get(0).getAddress2(), datosh.get(0).getCountry());
	}

	@When("^que Oscar selecciona Tipo de prestamo$")
	public void queOscarSeleccionaTipoDePrestamo() {
		Hipoteca.seleccionaTipoPrestamo();
	}

	
	
	
	@When("^que Oscar selecciona número de años$")
	public void queOscarSeleccionaNúmeroDeAños() {
		
		Hipoteca.seleccionaNumeroAnios();
	}

	@When("^que Oscar selecciona Tipo de ocupación$")
	public void queOscarSeleccionaTipoDeOcupación() {
		Hipoteca.deslizarPantallaH();
		Hipoteca.seleccionaTipoOcupacion();
	}

	@When("^que Oscar selecciona Ingresos anuales$")
	public void queOscarSeleccionaIngresosAnuales() {
		Hipoteca.seleccionaIngresosAnuales();
		Hipoteca.deslizarPantallaH();
		
	}

	@When("^que Oscar envia la solicitud$")
	public void queOscarEnviaLaSolicitud() {
		Hipoteca.seleccionaGuardar();
	}

	@Then("^podra ver el mensaje: Your balance is$")
	public void podraVerElMensajeYourBalanceIs() {
		
	}


	
}
