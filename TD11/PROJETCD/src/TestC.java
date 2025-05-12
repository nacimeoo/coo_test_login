import XML.ChargeurMagasin;
import donnees.CD;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestC {

    @Test
    public void  tes1() throws FileNotFoundException {
        String repertoire = "../PROJETCD/musicbrainzSimple/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin magasin = charge.chargerMagasin();
        int expectedNbCD = 12;
        assertEquals(expectedNbCD, magasin.getNombreCds());

    }

    @Test
    public void testtriCD() {
        Magasin m = new Magasin();

        CD cd1 = new CD("Artiste1", "Zebra");
        CD cd2 = new CD("Artiste2", "Beatles");
        CD cd3 = new CD("Artiste3", "Adele");

        m.ajouterCD(cd1);
        m.ajouterCD(cd2);
        m.ajouterCD(cd3);

        m.trierTitre();

        assertEquals("Adele", m.getCd(0).getTitre());
        assertEquals("Zebra", m.getCd(2).getTitre());
    }

    @Test
    public void testtriartiste() {
        Magasin m = new Magasin();

        CD cd1 = new CD("AAAA", "Zebra");
        CD cd2 = new CD("BBBB", "Beatles");
        CD cd3 = new CD("CCCC", "Adele");

        m.ajouterCD(cd1);
        m.ajouterCD(cd2);
        m.ajouterCD(cd3);

        m.trierAriste();

        assertEquals("AAAA", m.getCd(0).getArtiste());
        assertEquals("CCCC", m.getCd(2).getArtiste());
    }




}


