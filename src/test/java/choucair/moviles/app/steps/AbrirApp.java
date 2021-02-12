package choucair.moviles.app.steps;

import static choucair.moviles.app.utils.constantes.Mensajes.mensajeAppAbierta;
import choucair.moviles.app.utils.AccionesObjetos;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class AbrirApp extends PageObject {

	private AccionesObjetos ao;
	
	@Step("se despliega la app Eribank")
	public void iniciarAppEribank()
	{
		ao.mostrarEnConsola(mensajeAppAbierta());
		Serenity.takeScreenshot();
	}
}