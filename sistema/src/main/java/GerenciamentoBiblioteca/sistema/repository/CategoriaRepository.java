package GerenciamentoBiblioteca.sistema.repository;

import GerenciamentoBiblioteca.sistema.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GerenciamentoBiblioteca.sistema.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
