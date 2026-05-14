package GerenciamentoBiblioteca.sistema.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_livro")
public class Livro {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false)
private String titulo;
@Column(unique = true)
private String isbn;
@ManyToOne
@JoinColumn(name = categoria_id, nullable = false)
private Categoria categoria;

public Livro() {

}

public Livro(Long id, String titulo, String isbn,
Categoria categoria) {
this.id = id;
this.titulo = titulo;
this.isbn = isbn;
this.categoria = categoria;
}

public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getTitulo() {
return titulo;
}
public void setTitulo(String titulo) {
this.titulo = titulo;
}
public String getIsbn() {
return isbn;
}
public void setIsbn(String isbn) {
this.isbn = isbn;
}
public Categoria getCategoria() {
return categoria;
}
public void setCategoria(Categoria categoria) {
this.categoria = categoria;
}
}