// O mais temido: teste unitário

package com.livraria.catalogo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LivroTest {

    @Test
    public void testLivroCreation() {
        Livro livro = new Livro("Title", "Author", "Fiction", "Fantasy", "eBook", 20.0, 4.5, 100, "http://example.com");
        
        // Verifica se o livro foi criado corretamente
        Assertions.assertNotNull(livro);
        Assertions.assertEquals("Title", livro.getTitle());
        Assertions.assertEquals("Author", livro.getAuthor());
        Assertions.assertEquals("Fiction", livro.getMainGenre());
    }
}
