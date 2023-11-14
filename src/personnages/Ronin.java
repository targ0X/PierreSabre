package personnages;


public class Ronin extends Humain {
	private int honneur=1;
	private static String boissonfav="shochu";
	
	public Ronin(String nom,int argent) {
		super(nom,boissonfav,argent);
	}
	
	public void donner(Commercant beneficiaire) {
		double don=argent*Math.pow(10,-1);
		int money=(int)don;
		System.out.println(super.parler()+beneficiaire.getNom()+" prend ces "+money+" sous.");
		beneficiaire.recevoir(money);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force=honneur*2;
		System.out.println(super.parler()+"Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand !");
		if (force>=adversaire.getReputation()) {
			System.out.println(super.parler()+"Je t'ai eu petit yakusa !");
			argent+=adversaire.argent;
			adversaire.perdre();
		} else {
			System.out.println(super.parler()+"J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(argent);
			argent=0;
			honneur--;
		}
	}
}
