package choucair.moviles.app.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DatosAPI implements Conexion{
	
	@Override
	public <T> List<T> getDatos(String uriAPI, Class<T> clazz) {
		ObjectMapper jsonMapper = new ObjectMapper();
		Response response = RestAssured.get(uriAPI);
		List<T> usuarios = new ArrayList<>();
		try {
			usuarios = jsonMapper.readValue(response.asString(),
					jsonMapper.getTypeFactory().constructCollectionType(List.class,clazz));
		} catch (IOException e) {
			Logger.getLogger(DatosAPI.class.getName()).log(Level.WARNING,"IOException",e);
		}
		return usuarios;
	}

}
