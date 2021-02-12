package choucair.moviles.app.definitions;


import java.util.List;

import choucair.moviles.app.models.Pagos;
import choucair.moviles.app.models.User;
import choucair.moviles.app.steps.Login;
import choucair.moviles.app.steps.Pago;
import choucair.moviles.app.steps.VerificarMensajeAcceso;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PagoDefinitions {
		
	@Steps
	Login Login;
	@Steps
	VerificarMensajeAcceso verificarAccesoApp;
	@Steps
	Pago Pago;
	
	@When("^inicia sesion exitosa$")
	public void iniciaSesionPagoOk(List<User> datos) {
		Pago.hacerLogin(datos.get(0).getUsuario(), datos.get(0).getContrasena());
	}
	
	
	@When("^que Oscar ingresa a Make Payment$")
	public void queOscarIngresaAMakePayment() {
		Pago.iniciaPago();
	}
	
	
	/*
	//  ---------------------  NOTA: Usar cuando se envie el pais por teclado ---------------------
	@When("^Realiza ingreso informacion de pago$")
	public void RealizaIngresoInformacionPago(List<Pagos> datospago) {
	    Pago.ingresainformacionPago(datospago.get(0).getPhone(), datospago.get(0).getName(), datospago.get(0).getAmount(), datospago.get(0).getCountry());
	} */
	
	
//  --------------------- NOTA: Comentar método si se ingresa el Pais por teclado ---------------------
	@When("^Realiza ingreso informacion de pago$")
	public void RealizaIngresoInformacionPago(List<Pagos> datospago) {
	    Pago.ingresainformacionPago(datospago.get(0).getPhone(), datospago.get(0).getName(), datospago.get(0).getAmount(), datospago.get(0).getCountry());
	}
	
	//  --------------------- NOTA: Comentar método si se ingresa el Pais por teclado ---------------------
	@When("^que Oscar selecciona el pais$")
	public void queSeleccionaelPais() {
		Pago.deslizarPantallaP();
		Pago.selecionaPais();
	}
	
	
	
	@When("^Realiza pago exitoso$")
	public void RealizaPagoExitoso() {
		Pago.AceptarPago();
	}
	
	
	@Then("^podra ver el pago exitoso$")
	public void podraverelPagoExitoso() {
		Pago.verificarPago();
	}
	
	
	
}
