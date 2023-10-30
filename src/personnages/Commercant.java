package personnages;

public class Commercant extends Humain {
	private static String boissonfav="the";

	public Commercant(String nom,int argent) {
		super(nom,boissonfav,argent);
	}
	
	public int seFaireExtorquer() {
		argent=0;
		System.out.println(super.parler()+"J'ai tout perdu! le monde est trop injuste...");
		return argent;
	}
	public void recevoir(int money) {
		System.out.println(super.parler()+money+" sous ! Je te remercie généreux donateur!");
		argent+=money;
	}
}
