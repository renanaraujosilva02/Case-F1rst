package com.livraria.catalogo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    
    // Método para buscar livros por gênero principal
    List<Livro> findByMainGenre(String mainGenre);
    
    // Método para buscar livros por autor
    List<Livro> findByAuthor(String author);
}
