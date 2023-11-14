package personnages;

import java.util.Iterator;

public class Humain {
	protected String nom;
	private String boissonFav;
	protected int argent;
	protected int nbConnaissance=0;
	protected Humain[] memoire;
	
	private static final int NBCONNAISSANCEMAX=30;
	
	public Humain(String nom,String boissonFav,int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boissonFav=boissonFav;
		memoire = new Humain[NBCONNAISSANCEMAX];
		;
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
	@Override
	public String toString() {
		return nom;
	}	
	
	public void direBonjour() {
		System.out.println(parler() +"Bonjour ! Je m'appelle "+ nom+" et j'aime boire du "+boissonFav);
	}
	
	public void boire() {
		System.out.println(parler()+"Mmmm, un bon verre de "+boissonFav+" ! GLOUGLOU !");
	}
	
	private void memoriser(Humain humainAmemoriser) {
		if (nbConnaissance<NBCONNAISSANCEMAX) {
			memoire[nbConnaissance]=humainAmemoriser;
			nbConnaissance++;
		} else {
			for (int i = 1; i < NBCONNAISSANCEMAX; i++) {
				memoire[i-1]=memoire[i];
			}
			memoire[nbConnaissance-1]=humainAmemoriser;
		}
	}
	
	private void repondre(Humain humain) {
		humain.direBonjour();
		memoriser(humain);
	}
	public void acheter(String bien,int prix) {
		if (argent>=prix) {
			System.out.println(parler()+"J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+ bien +" a "+prix);
			argent-=prix;
		} else {
			System.out.println(parler()+"Je n'ai plus que "+argent+" sous en poche. Je ne peux meme pas m'offir "+bien+" a "+prix);
		}
	}
	public void faireConnaissanceAvec(Humain humain1) {
		this.direBonjour();
		repondre(humain1);
		humain1.memoriser(this);
	}
	
	public void listerConnaissance() {
		System.out.println(parler()+"Je connais beaucoup de monde dont :");
		for (int i = 0; i < NBCONNAISSANCEMAX ; i++) {
			if (memoire[i] != null) {
			System.out.println(memoire[i]);
			}
		}
	}
}
