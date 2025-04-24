
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();


		Lampe l1=new Lampe("Lampe1");
		t.ajouter(l1);

		Hifi h1 = new Hifi();
		t.ajouter(h1);

		Cheminee c1 = new Cheminee();
		ChemineeAdapter c2 = new ChemineeAdapter(c1);
		t.ajouter(c2);

		TelecommandeGraphique tg=new TelecommandeGraphique(t);

	}

}
