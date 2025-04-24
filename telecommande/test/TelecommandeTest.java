import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {

    @Test
    public void ajouter_lampe_vide() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouter(l);
        assertEquals("lampe1: Off\n", t.toString());
    }

    @Test
    public void ajouter_lampe2() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe2");
        t.ajouter(l);
        Lampe l2 = new Lampe("lampe3");
        t.ajouter(l2);
        assertEquals("lampe2: Off\nlampe3: Off\n", t.toString());
    }

    @Test
    public void activation_pos0() {
        Telecommande t = new Telecommande();
        Cheminee c = new Cheminee();
        ChemineeAdapter c2 = new ChemineeAdapter(c);
        Hifi h = new Hifi();
        Lampe l = new Lampe("lampe1");
        t.ajouter(c2);
        t.activer(0);
        assertEquals("cheminee: 10\n", t.toString());
    }

    @Test
    public void eteindre_pos0(){
        Telecommande t = new Telecommande();
        Cheminee c = new Cheminee();
        ChemineeAdapter c2 = new ChemineeAdapter(c);
        t.ajouter(c2);
        t.desactiverPeripherique(0);
        assertEquals("cheminee: 0\n", t.toString());
    }

    @Test
    public void activation_pos1() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouter(l);
        Lampe l2 = new Lampe("lampe2");
        t.ajouter(l2);
        t.activer(1);
        assertEquals("lampe1: Off\nlampe2: On\n", t.toString());
    }

    @Test
    public void activationTout() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouter(l);
        Lampe l2 = new Lampe("lampe2");
        t.ajouter(l2);
        t.activerTout();
        assertEquals("lampe1: On\nlampe2: On\n", t.toString());
    }
}
