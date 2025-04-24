public class ChemineeAdapter implements Peripherique {
    private Cheminee cheminee;

    public ChemineeAdapter(Cheminee cheminee) {
        this.cheminee = cheminee;
    }

    public void allumer() {
        cheminee.changerIntensite(cheminee.getLumiere()+10);
    }

    public void eteindre(){
        cheminee.changerIntensite(0);
    }

    public String toString() {
        return cheminee.toString();
    }

}
