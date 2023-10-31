/*
Java 4: Clase 6:
Grupo: NoCode
Alumno: Lucas Salinas
*/

package utn.tienda_libros.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.tienda_libros.modelo.Libro;

public interface LibroRepositorio extends JpaRepository <Libro, Integer> {

}

