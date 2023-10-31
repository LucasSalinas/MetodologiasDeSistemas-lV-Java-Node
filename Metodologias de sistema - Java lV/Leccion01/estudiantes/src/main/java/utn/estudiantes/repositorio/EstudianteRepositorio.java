/*
Java 4: Leccion 1:
Grupo: NoCode
Alumno: Lucas Salinas
*/

package utn.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.estudiantes.modelo.Estudiante;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer> {

}
