package choucair.moviles.app.ui;

import org.openqa.selenium.By;

public class HomePageUI {
	private static final By[] LBL_MENSAJE = {By.className("android.view.View")};
	private static final By[] BTN_MAKE_PAYMENT = {By.id("")};
	private static final By[] BTN_MORTGAGE_REQUEST = {By.id("")};
	private static final By[] BTN_EXPENSE_REPORT = {By.id("")};
	private static final By[] BTN_LOGOUT = {By.id("")};
	
	private HomePageUI() {
	    throw new IllegalStateException("Utility class");
	}

	public static By[] lblMensaje() {
		return LBL_MENSAJE;
	}

	public static By[] btnMakePayment() {
		return BTN_MAKE_PAYMENT;
	}

	public static By[] btnMortgageRequest() {
		return BTN_MORTGAGE_REQUEST;
	}

	public static By[] btnExpenseReport() {
		return BTN_EXPENSE_REPORT;
	}

	public static By[] btnLogout() {
		return BTN_LOGOUT;
	}
	
}
