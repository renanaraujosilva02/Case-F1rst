// Classe criada para resolver o problema de ID

package com.livraria.catalogo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseInitializer(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //Código SQL executa para redefinir a sequência do ID para evitar conflitos de ID
    public void resetBookIdSequence() {
        String sql = "SELECT setval('livro_id_seq', (SELECT COALESCE(MAX(id), 1) FROM livro));"; 
        jdbcTemplate.execute(sql);
    }
}