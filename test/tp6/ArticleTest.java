package tp6;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {

    @org.junit.jupiter.api.Test
    void getIntitule() throws PrixException, StockException, IntituleException {
        Article article1 = new Article("minuscule", 2.0, 10);
        assertEquals(article1.getIntitule(), "Minuscule", "Un intitulé doit avoir la première lettre en Majuscule et le reste en minuscule");
    }

    @org.junit.jupiter.api.Test
    void setIntitule() throws PrixException, StockException, IntituleException {
        //
        assertThrows(IntituleException.class, () -> {
            new Article(null, 2.0, 10);
        }, "Un intitulé ne peut pas être null.");
        //
        assertThrows(IntituleException.class, () -> {
            new Article("", 2.0, 10);
        }, "Un intitulé ne peut pas être vide.");

    }
}