#Author: Oscar Sánchez 

@Salir
Feature: Pruebas salir de sesion de la app
  
  
  @SalirSesion
  Scenario: Realizar cierre de sesion exitoso
  		Given que Oscar abre la App Eribank
  		When inicia sesion exitosa
					|  id |nombre| usuario | contrasena |
					|12356|Oscar|company|company|
			And que Oscar ingresa a Logout
		  Then podra ver el cierre de sesion exitoso
		  		