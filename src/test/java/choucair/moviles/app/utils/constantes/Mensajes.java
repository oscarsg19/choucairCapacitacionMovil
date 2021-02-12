package choucair.moviles.app.utils.constantes;

public class Mensajes {
	private static final String MENSAJE_ASSERT = "El mensaje: %s no est\u00E1 contenido en el de la app: %s";
	private static final String MENSAJE_ERROR_TECLADO = "Error al esconder el teclado";
	private static final String MENSAJE_APP_ABIERTA = "App Abierta";
	
	private Mensajes() {
	    throw new IllegalStateException("Utility class");
	}
	
	public static String mensajeAssert() {
		return MENSAJE_ASSERT;
	}
	public static String mensajeErrorTeclado() {
		return MENSAJE_ERROR_TECLADO;
	}
	public static String mensajeAppAbierta() {
		return MENSAJE_APP_ABIERTA;
	}
}
