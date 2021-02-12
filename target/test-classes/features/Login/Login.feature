#Author: Adrian

@Login
Feature: Pruebas en el modulo de ingreso a la app
	
			
		@LoginExitoso
		Scenario: Realizar login exitoso
			Given que Oscar abre la App Eribank
		  When inicia sesion exitosa
				|  id |nombre| usuario | contrasena |
				|12356|Adrian|company|company|
		  Then podria ver en el homepage el mensaje: Your balance is
		  

		@LoginFallido
		Scenario: Realizar login fallido
				Oscar ingresa la clave incorrecta 
			Given que Oscar abre la App Eribank
		  When inicia sesion fallida
				|  id |nombre| usuario | contrasena |
				|12356|Oscar|company|prueba123|
		  Then podria ver un mensaje de clave incorrecta 
		  