#Author: Oscar Sánchez 

@Hipoteca
Feature: Pruebas realizar solicitud de hipoteca en la app
  
  @SolicitaHipoteca
  Scenario: Realizar hipoteca exitosa
  		Given que Oscar abre la App Eribank
  		When inicia sesion exitosa
					|  id |nombre| usuario | contrasena |
					|12356|Oscar|company|company|
			And que Oscar ingresa a Mortgage Request
  		And que Oscar ingresa informacion de hipoteca 
					|firstName|lastName|age|address1|address2|country|
					|Os|Sanchez|26|Calle 102|Carrera 8|Japon|
			And que Oscar selecciona Tipo de prestamo
			And que Oscar selecciona número de años
			And que Oscar selecciona Tipo de ocupación
			And que Oscar selecciona Ingresos anuales
			And que Oscar envia la solicitud
		  Then podra ver el mensaje: Your balance is
		  
		  