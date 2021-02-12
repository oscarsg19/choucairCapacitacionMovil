package choucair.moviles.app.utils.constantes;

public class Comandos {
	private static final String UI_SELECTOR_TEXTO = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"%s\").instance(0))";
	private static final String ALL_OBJECTS = "//*";
	private static final String RETURN_USER_AGENT = "return navigator.userAgent;";
	
	private Comandos() {
	    throw new IllegalStateException("Utility class");
	}
	
	public static String uiSelectorTexto() {
		return UI_SELECTOR_TEXTO;
	}
	public static String allObjects() {
		return ALL_OBJECTS;
	}
	public static String returnUserAgent() {
		return RETURN_USER_AGENT;
	}

}
