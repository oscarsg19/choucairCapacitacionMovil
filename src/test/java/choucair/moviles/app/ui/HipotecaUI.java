package choucair.moviles.app.ui;

import org.openqa.selenium.By;

public class HipotecaUI {
	
	private static final By[] BTN_MORTGAGE_REQUEST = {By.id("com.experitest.ExperiBank:id/mortageRequestButton"),By.id("mortageRequestButton")};
	
	private static final By[] TXT_FIRST_NAME = {By.id("com.experitest.ExperiBank:id/nameTextField"),By.id("nameTextField")};
	private static final By[] TXT_LAST_NAME = {By.id("com.experitest.ExperiBank:id/lastNameTextField"),By.id("lastNameTextField")};
	private static final By[] TXT_AGE = {By.id("com.experitest.ExperiBank:id/ageTextField"),By.id("ageTextField")};
	private static final By[] TXT_ADDRES_ONE = {By.id("com.experitest.ExperiBank:id/addressOneTextField"),By.id("addressOneTextField")};
	private static final By[] TXT_ADDRES_TWO = {By.id("com.experitest.ExperiBank:id/addressTwoTextField"),By.id("addressTwoTextField")};
	private static final By[] TXT_COUNTRY = {By.id("com.experitest.ExperiBank:id/countryTextField"),By.id("countryTextField")};
	private static final By[] BTN_NEXT = {By.id("com.experitest.ExperiBank:id/nextButton"),By.id("nextButton")};
	
	
	private static final By[] BTN_TYPE_LOAN = {By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.CheckedTextView[2]"),By.id("CheckedTextView")};
	private static final By[] BTN_NUMBER_YEAR = {By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.CheckedTextView[2]"),By.id("CheckedTextView")};
	private static final By[] BTN_TYPE_OCUPATION = {By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.CheckedTextView[2]"),By.id("CheckedTextView")};
	private static final By[] BTN_YEARLY_INCOME = {By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[3]/android.widget.CheckedTextView[2]"),By.id("CheckedTextView")};
	
	private static final By[] BTN_SAVE = {By.id("com.experitest.ExperiBank:id/saveButton"),By.id("saveButton")};

	public static By[] BtnMortgageRequest() { //Botón solicitud hipoteca
		return BTN_MORTGAGE_REQUEST;
	}
	

	public static By[] TxtFirstName() { //Campo nombre
		return TXT_FIRST_NAME;
	}

	public static By[] TxtLastName() { //Campo apellido
		return TXT_LAST_NAME;
	}

	public static By[] TxtAge() { //Campo edad
		return TXT_AGE;
	}

	public static By[] TxtAddresOne() { //Campo primera dirección
		return TXT_ADDRES_ONE;
	}

	public static By[] TxtAddresTwo() { //Campo segunda dirección
		return TXT_ADDRES_TWO;
	}

	public static By[] TxtCountry() { //Campo Ciudad
		return TXT_COUNTRY;
	}
	
	
	
	public static By[] BtnNext() {  //Botón siguiente
		return BTN_NEXT;
	}

	public static By[] BtnTypeLoan() {  //Opción tipo de prestamo
		return BTN_TYPE_LOAN;
	}

	public static By[] BtnNumberYear() { //Opción numero de años
		return BTN_NUMBER_YEAR;
	}

	public static By[] BtnTypeOcupation() { //Opción ocupación
		return BTN_TYPE_OCUPATION;
	}

	public static By[] BtnYearlyIncome() { //Opción Ingresos anuales 
		return BTN_YEARLY_INCOME;
	}
	
	public static By[] BtnSave() {  //Botón guardar 
		return BTN_SAVE;
	}
	
}
