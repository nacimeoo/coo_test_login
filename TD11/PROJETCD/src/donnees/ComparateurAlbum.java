package donnees;

public class ComparateurAlbum implements ComparateurCd{

    public boolean etreAvant(CD cd1, CD cd2) {
        return cd1.getTitre().compareTo(cd2.getTitre())<0;
    }
}
