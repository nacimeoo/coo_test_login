import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void  tes2() throws FileNotFoundException {
        String repertoire = "../PROJD/musimple/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin magasin = charge.chargerMagasin();
        int expectedNbCD = 12;
        assertEquals(expectedNbCD, magasin.getNombreCds());

    }


}


