package choucair.moviles.app.utils;

import static choucair.moviles.app.utils.constantes.Constantes.*;
import static choucair.moviles.app.utils.constantes.Comandos.*;
import static choucair.moviles.app.utils.constantes.Mensajes.mensajeAssert;
import static choucair.moviles.app.utils.constantes.Mensajes.mensajeErrorTeclado;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;

public class AccionesObjetos extends PageObject {
	@SuppressWarnings("unchecked")
	AppiumDriver<MobileElement> driverappium = ((AppiumDriver<MobileElement>) ((WebDriverFacade) getDriver())
			.getProxiedDriver());
	private final Logger logger = Logger.getLogger(AccionesObjetos.class.getName());

	private int tiempoEspera = 15;

	public AccionesObjetos(WebDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}

	public AppiumDriver<MobileElement> getAppiumDriver() {
		return this.driverappium;
	}

	public void setTiempoEspera(int newTime) {
		this.tiempoEspera = newTime;
	}

	public void hideKeyboard() {
		try {
			driverappium.hideKeyboard();
		} catch (Exception e) {
			logger.info(mensajeErrorTeclado());
		}
	}

	public void setInputText(WebElement el, String dato) {
		el.sendKeys(dato);
		hideKeyboard();
		Serenity.takeScreenshot();
	}

	public void setInputText(By[] locators, String dato) {
		setInputText(esperarObtenerObjeto(locators), dato);
	}

	public void clickObjeto(WebElement el) {
		tap(el);
		Serenity.takeScreenshot();
	}

	public void clickObjeto(By[] locators) {
		clickObjeto(esperarObtenerObjeto(locators));
	}

	/***
	 * Metodo para encontrar un objeto esperando un tiempo maximo determinado
	 * 
	 * @param locators Array de Bys por el cual buscara el objeto dependiendo la
	 *                 plataforma
	 * @param tiempo   tiempo maximo para esperar, puede ir vacio
	 * @return WebElement con el cual interactuar, null sino se encuentra
	 */
	public WebElement esperarObtenerObjeto(By[] locators, int... tiempo) {
		getAppiumDriver().manage().timeouts().implicitlyWait(tiempo.length > 0 ? tiempo[0] : tiempoEspera,
				TimeUnit.SECONDS);
		return getAppiumDriver().findElement(obtenerLocatorAndroidIos(locators));
	}

	/***
	 * Metodo para encontrar una lista de objetos esperando un tiempo maximo
	 * determinado
	 * 
	 * @param locators Array de Bys por el cual buscara el objeto dependiendo la
	 *                 plataforma
	 * @param tiempo   tiempo maximo para esperar el objeto, puede ir vacio
	 * @return List<WebElementFacade> con los cual interactuar, null sino se
	 *         encuentra
	 */
	public List<WebElementFacade> esperarObtenerObjetos(By[] locators, int... tiempo) {
		return withTimeoutOf(Duration.ofSeconds(tiempo.length > 0 ? tiempo[0] : tiempoEspera))
				.findAll(obtenerLocatorAndroidIos(locators));
	}

	/***
	 * Metodo que determina la plataforma para mapear los elementos
	 * 
	 * @param locators Atributos de mapeo de Android y iOs
	 * @return
	 */
	private By obtenerLocatorAndroidIos(By[] locators) {
		return (isWeb() || isAndroid()) ? locators[0] : locators[1];
	}

	/***
	 * Determina si es Web
	 */
	public boolean isWeb() {
		String navegador;
		try {
			navegador = (String) ((JavascriptExecutor) getDriver()).executeScript(returnUserAgent());
		}catch(Exception e) {
			navegador = empty();
		}
		return (navegador.toLowerCase().contains(chrome()) || navegador.toLowerCase().contains(safari()));
	}

	/***
	 * Determina si es Android
	 */
	public boolean isAndroid() {
		return getAppiumDriver().getCapabilities().getCapability(platformName()).toString()
				.equalsIgnoreCase(android());
	}

	/***
	 * Determina si es iOS
	 */
	public boolean isIOS() {
		return getAppiumDriver().getCapabilities().getCapability(platformName()).toString().equalsIgnoreCase(ios());
	}

	/***
	 * Metodo para sustituir el Thread.sleep()
	 * 
	 * @param tiempoEspera tiempo el cual se desea esperar
	 */
	public void falsoSleep(int tiempoEspera) {
		try {
			TimeUnit.MILLISECONDS.sleep(tiempoEspera);
		} catch (InterruptedException e) {
			logger.log(Level.WARNING, interrumped(), e);
			Thread.currentThread().interrupt();
		}
	}

	/***
	 * Modifica el contexto de la automatizacion, a Web o Nativa
	 * @param contexto Contexto al que se quiere cambiar
	 */
	public void cambiarContexto(String contexto) {
		getAppiumDriver().context(contexto);
	}

	/***
	 * Muestra los contextos que se encuentran disponibles para automatizar
	 */
	public void obtenerContexto() {
		Set<String> cerrar = getAppiumDriver().getContextHandles();
		Iterator<String> ite = cerrar.iterator();
		while (ite.hasNext()) {
			mostrarEnConsola(ite.next());
		}
	}

	@SuppressWarnings("rawtypes")
	public void swipe(int inicialx, int inicialy, int finx, int finy) {
		new TouchAction((PerformsTouchActions) driverappium)
				.longPress(new PointOption<>().withCoordinates(inicialx, inicialy))
				.moveTo(new PointOption<>().withCoordinates(finx, finy)).release().perform();
	}

	@SuppressWarnings("rawtypes")
	public void longPress(int x, int y, long duracion) {
		Duration duracion2 = Duration.ofMillis(duracion);
		LongPressOptions lpo = new LongPressOptions();
		lpo.withPosition(new PointOption<>().withCoordinates(x, y));
		lpo.withDuration(duracion2);
		new TouchAction((PerformsTouchActions) driverappium).longPress(lpo).perform().release();
	}

	@SuppressWarnings("rawtypes")
	public void press(int x, int y) {
		new TouchAction((PerformsTouchActions) driverappium).press(new PointOption<>().withCoordinates(x, y)).perform()
				.release();
	}

	@SuppressWarnings("rawtypes")
	public void tap(int x, int y) {
		new TouchAction((PerformsTouchActions) driverappium)
				.tap(new TapOptions().withPosition(new PointOption<>().withCoordinates(x, y))).perform().release();
	}

	public void tap(WebElement elemento) {
		Rectangle rect = elemento.getRect();
		tap(rect.getX() + (rect.getWidth() / 2), rect.getY() + (rect.getHeight() / 2));
	}

	@SuppressWarnings("unchecked")
	public AndroidDriver<AndroidElement> getAndroidDriver() {
		return (AndroidDriver<AndroidElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
	}

	@SuppressWarnings("unchecked")
	public IOSDriver<IOSElement> getIosDriver() {
		return (IOSDriver<IOSElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
	}

	public void obtenerTodoLosObjetos() {
		List<MobileElement> elementos = driverappium.findElementsByXPath(allObjects());
		for (MobileElement el : elementos) {
			logger.info(el.getText());
		}
	}

	public void mostrarEnConsola(String mensaje) {
		logger.info(mensaje);
	}

	public WebElement buscarElementoScrollTextoAndroid(String texto) {
		return (MobileElement) getDriver().findElement(MobileBy.AndroidUIAutomator(
				String.format(uiSelectorTexto(), texto)));
	}

	public void verificarContieneMensaje(By[] locators, String mensaje) {
		String mensajeEnApp = esperarObtenerObjeto(locators).getText();
		Serenity.takeScreenshot();
		if (!mensajeEnApp.contains(mensaje)) {
			throw new AssertionError(
					String.format(mensajeAssert(), mensaje, mensajeEnApp));
		}
	}
}