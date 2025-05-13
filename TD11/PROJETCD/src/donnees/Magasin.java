package donnees;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * 
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 * 
 */
public class Magasin {

	/**
	 * la liste des CDs disponibles en magasin
	 */
	private ArrayList<CD> listeCds;

	/**
	 * construit un magasin par defaut qui ne contient pas de CD
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouterCD(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	/**
	 * affiche le contenu du magasin
	 */
	public String toString() {
		String chaineResultat = "";
		for (int i = 0; i < listeCds.size(); i++) {
			chaineResultat += listeCds.get(i);
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	/**
	 * @return le nombre de Cds du magasin
	 */
	public int getNombreCds() {
		return listeCds.size();
	}
	
	/**
	 * permet d'acceder � un CD
	 * 
	 * @return le cd a l'indice i ou null si indice est non valide
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}

	public void trierAriste() {
		ArrayList<CD> newtri = new ArrayList();
		ArrayList<CD> temp = new ArrayList(listeCds);

		while(temp.size()>0) {
			int indicemin = 0;
			for (int i = 0; i < temp.size(); i++) {
				if(temp.get(i).comparerArtiste(temp.get(indicemin)) <0){
					indicemin = i;
				}
			}
			newtri.add(temp.remove(indicemin));
		}
		listeCds = newtri;
	}



	public void trierTitre(){
		ArrayList<CD> newtri = new ArrayList();
		ArrayList<CD> temp = new ArrayList(listeCds);

		while(temp.size()>0) {
			int indicemin = 0;
			for (int i = 0; i < temp.size(); i++) {
				if(temp.get(i).comparerTitre(temp.get(indicemin)) <0){
					indicemin = i;
				}
			}
			newtri.add(temp.remove(indicemin));
		}
		listeCds = newtri;
	}


}
