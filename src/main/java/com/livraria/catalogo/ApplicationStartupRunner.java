package com.livraria.catalogo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartupRunner implements CommandLineRunner {

    private final DataGenerator dataGenerator;
    private final DatabaseInitializer databaseInitializer;

    public ApplicationStartupRunner(DataGenerator dataGenerator, DatabaseInitializer databaseInitializer) {
        this.dataGenerator = dataGenerator;
        this.databaseInitializer = databaseInitializer;
    }

    @Override
    public void run(String... args) throws Exception {
    	databaseInitializer.resetBookIdSequence(); // Redefine a sequência antes de inserir os livros
        dataGenerator.insertBooks(); // Chama o método para inserir os livros
    }
}