package personnages;
import java.lang.Math;

public class Ronin extends Humain {
	private int honneur=1;
	private static String boissonfav="shochu";
	
	public Ronin(String nom,int argent) {
		super(nom,boissonfav,argent);
	}
	  static int powerFunction(int base, int exponent) {
	       int result = 1;
	       for (int i = 0; i < exponent; i++) {
	           result = base * result;
	       }
	       return result;
	   }
	public void Donner(Commercant beneficiaire) {
		double don=argent*Math.pow(10,-1);
		int money=(int)don;
		System.out.println(super.parler()+beneficiaire.getNom()+" prend ces "+money+" sous.");
		beneficiaire.recevoir(money);
	}
}
