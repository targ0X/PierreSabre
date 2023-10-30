package personnages;

public class Humain {
	protected String nom;
	private String boissonFav;
	protected int argent;
	
	public Humain(String nom,String boissonFav,int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boissonFav=boissonFav;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	protected String parler() {
		return ("("+nom+") - ");
	}
	
	public void direBonjour() {
		System.out.println(parler() +"Bonjour ! Je m'appelle "+ nom+" et j'aime boire du "+boissonFav);
	}
	
	public void boire() {
		System.out.println(parler()+"Mmmm, un bon verre de "+boissonFav+" ! GLOUGLOU !");
	}
	
	public void acheter(String bien,int prix) {
		if (argent>=prix) {
			System.out.println(parler()+"J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+ bien +" � "+prix);
			argent-=prix;
		} else {
			System.out.println(parler()+"Je n'ai plus que "+argent+" sous en poche. Je ne peux meme pas m'offir "+bien+" � "+prix);
		}
		
	}
}
