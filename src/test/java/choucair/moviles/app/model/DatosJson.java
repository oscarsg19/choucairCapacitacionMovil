package choucair.moviles.app.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DatosJson implements Conexion{
	
	@Override
	public <T> List<T> getDatos(String jsonPath, Class<T> clazz) {
		ObjectMapper jsonMapper = new ObjectMapper();
		List<T> usuarios = new ArrayList<>();
		try {
			usuarios = jsonMapper.readValue(new File(jsonPath),
					jsonMapper.getTypeFactory().constructCollectionType(List.class,clazz));
		} catch (IOException e) {
			Logger.getLogger(DatosJson.class.getName()).log(Level.WARNING, "IOException", e);
		}
		return usuarios;
	}
}