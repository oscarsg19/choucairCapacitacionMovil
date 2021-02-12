package choucair.moviles.app.ui;

import org.openqa.selenium.By;

public class SalirUI {
	
	private static final By[] BTN_LOGOUT = {By.id("com.experitest.ExperiBank:id/logoutButton"),By.id("logoutButton")};

	public static By[] BtnLogout() { //Botón salir
		return BTN_LOGOUT;
	}
	
}
