// Classe responsável por ser a controladora dos livros
package com.livraria.catalogo;

import org.springframework.web.bind.annotation.*;
//import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@RestController
@RequestMapping("/books")
public class LivroController {

    private final LivroRepository livroRepository;

    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @GetMapping
    public List<Livro> getAllBooks() {
        return livroRepository.findAll();
    }

    @GetMapping("/{id}")
    public Livro getBookById(@PathVariable Long id) {
        return livroRepository.findById(id).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    @GetMapping("/main-genre/{mainGenre}")
    public List<Livro> getBooksByMainGenre(@PathVariable String mainGenre) {
        return livroRepository.findByMainGenre(mainGenre);
    }

    @GetMapping("/author/{author}")
    public List<Livro> getBooksByAuthor(@PathVariable String author) {
        return livroRepository.findByAuthor(author);
    }
}