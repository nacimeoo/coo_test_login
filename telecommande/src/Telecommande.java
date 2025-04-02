import java.util.ArrayList;

public class Telecommande {
    private final ArrayList<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<>();
    }


    public void ajouterLampe(Lampe l){
        lampes.add(l);
    }

    public void activerLampe(int indiceLampe ){
        if(indiceLampe >= 0 && indiceLampe < lampes.size()){
            lampes.get(indiceLampe).allumer();
        }else{
            System.out.println("Lampe exists pas");
        }
    }

    public void desactiverLampe(int indiceLampe){
        if(indiceLampe >= 0 && indiceLampe < lampes.size()) {
            lampes.get(indiceLampe).eteindre();
        }else{
            System.out.println("Lampe nexiste pas");
        }
    }
    public void activerTout(){
        for (Lampe l : lampes) {
            l.allumer();
        }
    }

    public String toString(){
        String res ="";
        for (Lampe l : lampes) {
            res += l.toString() + "\n";
        }
        return res;
    }

}
