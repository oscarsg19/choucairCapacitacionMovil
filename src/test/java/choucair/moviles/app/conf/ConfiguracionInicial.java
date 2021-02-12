package choucair.moviles.app.conf;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ConfiguracionInicial {

	@Before
	public void configuracion() {
		//Crear Conexiones DB
		//Configurar Data Tests
		//etc
	}

	@After
	public void finalizar() {
		//Cerrar conexiones
		// Limpiar Data Tests
		//etc
	}
}