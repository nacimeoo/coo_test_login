import java.util.ArrayList;

public class Telecommande {
    private final ArrayList<Peripherique> peripherique;

    public Telecommande() {
        this.peripherique = new ArrayList<>();
    }


    public void ajouter(Peripherique p){
        peripherique.add(p);
    }


    public void activer(int indicePeripherique ){
        if(indicePeripherique >= 0 && indicePeripherique < peripherique.size()){
            peripherique.get(indicePeripherique).allumer();
        }else{
            System.out.println("peripherique exists pas");
        }
    }



    public void desactiverPeripherique(int indicePeripherique){
        if(indicePeripherique >= 0 && indicePeripherique < peripherique.size()) {
            peripherique.get(indicePeripherique).eteindre();
        }else{
            System.out.println("peripherique nexiste pas");
        }
    }



    public void activerTout(){
        for (Peripherique p : peripherique) {
            p.allumer();
        }

    }

    public String toString(){
        String res = "";
        for (Peripherique p : peripherique) {
            res += p.toString() + "\n";
        }
        return res;
    }

}
