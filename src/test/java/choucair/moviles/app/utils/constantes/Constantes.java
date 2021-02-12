package choucair.moviles.app.utils.constantes;

public class Constantes {
	private static final String ANDROID = "android";
	private static final String IOS = "ios";
	private static final String CHROME = "chrome";
	private static final String SAFARI = "safari";
	private static final String PLATFORM_NAME = "platformName";
	private static final String INTERRUMPED = "Interrumped";
	private static final String EMPTY = "";

	private Constantes() {
	    throw new IllegalStateException("Utility class");
	}
	
	public static String android() {
		return ANDROID;
	}
	public static String ios() {
		return IOS;
	}
	public static String chrome() {
		return CHROME;
	}
	public static String safari() {
		return SAFARI;
	}
	public static String platformName() {
		return PLATFORM_NAME;
	}
	public static String interrumped() {
		return INTERRUMPED;
	}
	public static String empty() {
		return EMPTY;
	}
}
