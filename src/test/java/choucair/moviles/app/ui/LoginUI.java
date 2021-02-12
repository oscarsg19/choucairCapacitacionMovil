package choucair.moviles.app.ui;

import org.openqa.selenium.By;

public class LoginUI {
	private static final By[] TXT_USERNAME = {By.id("com.experitest.ExperiBank:id/usernameTextField"),By.id("usernameTextField")};
	private static final By[] TXT_CONTRASENA = {By.id("com.experitest.ExperiBank:id/passwordTextField"),By.id("passwordTextField")};
	private static final By[] BTN_INGRESAR = {By.id("com.experitest.ExperiBank:id/loginButton"),By.id("loginButton")};
	
	private static final By[] BTN_INVALID_PASS = {By.id("android:id/button3"),By.id("button3")};
	
	private LoginUI() {
	    throw new IllegalStateException("Utility class");
	}

	public static By[] txtUserName() {
		return TXT_USERNAME;
	}

	public static By[] txtContrasena() {
		return TXT_CONTRASENA;
	}

	public static By[] btnIngresar() {
		return BTN_INGRESAR;
	}

	public static By[] BtnInvalidPass() {
		return BTN_INVALID_PASS;
	}	
}