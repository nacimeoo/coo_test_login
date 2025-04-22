import java.lang.reflect.Array;
import java.util.ArrayList;

public class Telecommande {
    private final ArrayList<Lampe> lampes;
    private final ArrayList<Hifi> hifi;

    public Telecommande() {
        this.lampes = new ArrayList<>();
        this.hifi = new ArrayList<>();
    }


    public void ajouterLampe(Lampe l){
        lampes.add(l);
    }

    public void ajouterHifi(Hifi h){
        hifi.add(h);
    }

    public void activerLampe(int indiceLampe ){
        if(indiceLampe >= 0 && indiceLampe < lampes.size()){
            lampes.get(indiceLampe).allumer();
        }else{
            System.out.println("Lampe exists pas");
        }
    }

    public void activerHifi(int indiceHifi){
        if (indiceHifi >= 0 && indiceHifi < hifi.size()){
            hifi.get(indiceHifi).allumer();
        }else{
            System.out.println("Hifi exists pas");
        }
    }

    public void desactiverLampe(int indiceLampe){
        if(indiceLampe >= 0 && indiceLampe < lampes.size()) {
            lampes.get(indiceLampe).eteindre();
        }else{
            System.out.println("Lampe nexiste pas");
        }
    }

    public void desactiverHifi(int indiceHifi){
        if (indiceHifi >= 0 && indiceHifi < hifi.size()) {
            hifi.get(indiceHifi).eteindre();
        }else{
            System.out.println("Hifi nexiste pas");
        }
    }

    public void activerTout(){
        for (Lampe l : lampes) {
            l.allumer();
        }
        for (Hifi h : hifi) {
            h.allumer();
        }
    }

    public String toString(){
        String res = "";
        for (Lampe l : lampes) {
            res += l.toString() + "\n";
        }
        for (Hifi h : hifi) {
            res += h.toString() + "\n";
        }
        return res;
    }

}
