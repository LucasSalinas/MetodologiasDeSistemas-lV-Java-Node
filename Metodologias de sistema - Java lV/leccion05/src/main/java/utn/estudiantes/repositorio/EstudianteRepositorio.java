/*
Java 4: Leccion 5:
Grupo: NoCode
Alumno: Lucas Salinas
*/

package utn.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.estudiantes.modelo.Estudiantes2022;

public interface EstudianteRepositorio extends JpaRepository<Estudiantes2022, Integer> {

}
