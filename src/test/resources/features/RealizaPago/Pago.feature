#Author: Oscar Sánchez 

@Pago
Feature: Pruebas realizar pago en la app
  
  @RealizaPago
  Scenario: Realizar pago exitoso
  		Given que Oscar abre la App Eribank
  		When inicia sesion exitosa
					|  id |nombre| usuario | contrasena |
					|12356|Oscar|company|company|
			And que Oscar ingresa a Make Payment
  		And Realiza ingreso informacion de pago
					|phone|name|amount|country|
					|3286525 |Oscar|20|Noruega|
		  And Realiza pago exitoso
		  Then podra ver el pago exitoso
		  		
    
    
  @RealizaPagoSelectCountry
  Scenario: Realizar pago exitoso
  		Given que Oscar abre la App Eribank
  		When inicia sesion exitosa
					|  id |nombre| usuario | contrasena |
					|12356|Oscar|company|company|
			And que Oscar ingresa a Make Payment
			And Realiza ingreso informacion de pago
					|phone|name|amount|country|
					|321589 |Fernando|10|   |
			And que Oscar selecciona el pais 
  		And Realiza pago exitoso
			Then podra ver el pago exitoso
	
	