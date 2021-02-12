package choucair.moviles.app.ui;

import org.openqa.selenium.By;

public class InformeGastosUI {
	
	private static final By[] BTN_EXPENSE_REPORT = {By.id("com.experitest.ExperiBank:id/expenseReportButton"),By.id("expenseReportButton")};
	private static final By[] BTN_ADD_BUTTON = {By.id("com.experitest.ExperiBank:id/addButton"),By.id("addButton")};
	private static final By[] BTN_DELETE_REPORT = {By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout"),By.id("LinearLayout")};
	
	private static final By[] BTN_BACK_BUTTON = {By.id("com.experitest.ExperiBank:id/backButton"),By.id("backButton")};
	
	
	private InformeGastosUI() {
	    throw new IllegalStateException("Utility class");
	}
	
	
	public static By[] BtnExpenseReport() { //Ingresar a informe de gastos
		return BTN_EXPENSE_REPORT;
	}
	public static By[] BtnAddButton() {  //Botón para agregar informe
		return BTN_ADD_BUTTON;
	}
	public static By[] BtnBackButton() {  //Informe para regresar al menú principal 
		return BTN_BACK_BUTTON;
	}


	public static By[] BtnDeleteReport() { //Botón para eliminar 
		return BTN_DELETE_REPORT;
	}
	
	
	
}
