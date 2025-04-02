import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {

    @Test
    public void ajouter_lampe_vide() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterLampe(l);
        assertEquals("lampe1: Off\n", t.toString());
    }

    @Test
    public void ajouter_lampe2() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe2");
        t.ajouterLampe(l);
        Lampe l2 = new Lampe("lampe3");
        t.ajouterLampe(l2);
        assertEquals("lampe2: Off\nlampe3: Off\n", t.toString());
    }

    @Test
    public void activation_pos0() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterLampe(l);
        t.activerLampe(0);
        assertEquals("lampe1: On\n", t.toString());
    }

    @Test
    public void activation_pos1() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterLampe(l);
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l2);
        t.activerLampe(1);
        assertEquals("lampe1: Off\nlampe2: On\n", t.toString());
    }

    @Test
    public void activationTout() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterLampe(l);
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l2);
        t.activerTout();
        assertEquals("lampe1: On\nlampe2: On\n", t.toString());
    }
}
