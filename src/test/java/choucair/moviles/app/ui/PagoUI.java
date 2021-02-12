package choucair.moviles.app.ui;

import org.openqa.selenium.By;

public class PagoUI {
	private static final By[] BTN_MAKE_PAYMENT = {By.id("com.experitest.ExperiBank:id/makePaymentButton"),By.id("makePaymentButton")};
	private static final By[] TXT_PHONE = {By.id("com.experitest.ExperiBank:id/phoneTextField"),By.id("phoneTextField")};
	private static final By[] TXT_NAME = {By.id("com.experitest.ExperiBank:id/nameTextField"),By.id("nameTextField")};
	private static final By[] TXT_AMOUNT = {By.id("com.experitest.ExperiBank:id/amountTextField"),By.id("amountTextField")};
	
	private static final By[] TXT_COUNTRY = {By.id("com.experitest.ExperiBank:id/countryTextField"),By.id("countryTextField")};
	private static final By[] BTN_COUNTRY = {By.id("com.experitest.ExperiBank:id/countryButton"),By.id("countryButton")};
		private static final By[] BTN_SELECT_COUNTRY = {By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[5]"),By.id("rowTextView")};
	
	private static final By[] BTN_SEND_PAYMENT = {By.id("com.experitest.ExperiBank:id/sendPaymentButton"),By.id("sendPaymentButton")};
	private static final By[] BTN_ACCEPT = {By.id("android:id/button1"),By.id("button1")};
	
	
	private PagoUI() {
	    throw new IllegalStateException("Utility class");
	}

	
	public static By[] BtnMakePayment() { //Botón hacer pago
		return BTN_MAKE_PAYMENT;
	}

	public static By[] TxtPhone() {  //Campo telefono
		return TXT_PHONE;
	}

	public static By[] TxtName() {  //Campo nombre
		return TXT_NAME;
	}

	public static By[] TxtAmount() { //Campo monto 
		return TXT_AMOUNT;
	}

	public static By[] TxtCountry() { //Campo pais  
		return TXT_COUNTRY;
	}

	public static By[] BtnCountry() {  //Botón pais 
		return BTN_COUNTRY;
	}

	public static By[] BtnSelectCountry() { //Seleccionar pais 
		return BTN_SELECT_COUNTRY;
	}

	public static By[] BtnSendPayment() { //Botón enviar pago
		return BTN_SEND_PAYMENT;
	}

	public static By[] BtnAccept() {  //Botón aceptar pago
		return BTN_ACCEPT;
	}

	
	
}
