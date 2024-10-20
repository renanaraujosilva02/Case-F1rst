//Classe configurada para gravar 10 livros a cada execução

package com.livraria.catalogo;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataGenerator {

    private final Faker faker;
    private final LivroRepository livroRepository;

    @Autowired
    public DataGenerator(LivroRepository livroRepository) {
        this.faker = new Faker();
        this.livroRepository = livroRepository;
    }

    public List<Livro> generateFakeBooks(int quantity) {
        List<Livro> books = new ArrayList<>();
        
        for (int i = 0; i < quantity; i++) {
            Livro livro = new Livro(
                faker.book().title(),  // Gera um título de livro falso
                faker.book().author(), // Gera o nome de um autor falso
                faker.options().option("Fiction", "Non-Fiction", "Science", "History"), // Gênero principal
                faker.options().option("Mystery", "Fantasy", "Biography", "Romance"),  // Subgênero
                faker.options().option("eBook", "Paperback", "Hardcover"),  // Tipo de livro
                faker.number().randomDouble(2, 5, 200),  // Preço entre 5 e 200, com 2 casas decimais
                faker.number().randomDouble(2, 1, 5),  // Avaliação entre 1.0 e 5.0
                faker.number().numberBetween(1, 100000), // Número de pessoas que avaliaram
                faker.internet().url()  // Gera uma URL falsa
            );
            books.add(livro);
        }

        // Persistir os livros no banco de dados
        livroRepository.saveAll(books); // Salva todos os livros gerados
        return books; // Retorna a lista de livros gerados
    }

    public void insertBooks() {
        generateFakeBooks(10); // Chama o método para gerar e inserir 10 livros
    }
}
