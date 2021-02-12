#Author: Oscar Sánchez 

@Informe
Feature: Pruebas agregar informe de gastos en la app

    
  @RealizaInformeGastos
  Scenario: Agregar informe de gasto
  		Given que Oscar abre la App Eribank
  		When inicia sesion exitosa
					|  id |nombre| usuario | contrasena |
					|12356|Oscar|company|company|
			And Oscar ingresa a Expense Report
			And que Oscar agrega un informe
			And que Oscar agrega un segundo informe 
			And que Oscar elimina un informe
  		And que Oscar retrocede 
			Then Podria ver el listado de reportes
			