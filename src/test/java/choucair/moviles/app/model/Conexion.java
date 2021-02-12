package choucair.moviles.app.model;

import java.util.List;

public interface Conexion {
	<T> List<T> getDatos(String contenido, Class<T> clazz);
}
