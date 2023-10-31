/*
Java 4: Leccion 1:
Grupo: NoCode
Alumno: Lucas Salinas
*/

package utn.estudiantes;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.estudiantes.servicio.EstudianteServicio;


@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {
	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.line.separator();

	public static void main(String[] args) {

		logger.info("Iniciando la aplicación...");
		//Levantar fabrica de Spring
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicación Finalizada!");
	}
	@Override
	public void run(String... args) throws Exception {
		logger.info(nl+"Ejecutando el meétodo run de Spring..."+nl);
	}
}