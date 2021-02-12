package choucair.moviles.app.definitions;

import choucair.moviles.app.steps.Login;
import choucair.moviles.app.steps.InformeGastos;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InformeGastosDefinitions {
	
	@Steps
	Login Login;
	@Steps
	InformeGastos InformeGastos;
	
	@When("^Oscar ingresa a Expense Report$")
	public void oscarIngresaAExpenseReport() {
		InformeGastos.iniciaInformeGastos();
	}


	@When("^que Oscar agrega un informe$")
	public void queOscarAgregaUnInforme() {
	    InformeGastos.agregarInforme();
	}

	@When("^que Oscar agrega un segundo informe$")
	public void queOscarAgregaUnSegundoInforme() {
		InformeGastos.agregarInforme();
	}
	
	
	@When("^que Oscar elimina un informe$")
	public void queOscarEliminaUnInforme() {
		InformeGastos.eliminarInforme();
	}
	
	@When("^que Oscar retrocede$")
	public void queOscarRetrocede() {
		InformeGastos.retrocederInforme();
	}

	@Then("^Podria ver el listado de reportes$")
	public void podriaVerElListadoDeReportes() {

	}


	
}
