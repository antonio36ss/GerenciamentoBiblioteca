package sistema.GerenciamentoBiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistema.GerenciamentoBiblioteca.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
