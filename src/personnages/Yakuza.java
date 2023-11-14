package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	private static String boissonfav="whisky";
	
	public Yakuza(String nom,int argent,String clan) {
		super(nom,boissonfav,argent);
		this.clan=clan;
	}
	public void extorquer(Commercant victime) {
		System.out.println(super.parler()+"Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		System.out.println(super.parler()+victime.getNom()+", si tu tiens a la vie donne moi ta bourse !");
		int money=argent+victime.getArgent();
		victime.seFaireExtorquer();
		System.out.println(super.parler()+" J'ai pique les "+(money-argent)+" sous de "+victime.getNom()+", ce qui me fait "+money+" sous dans ma poche. Hi ! Hi !");
		reputation++;
		argent=money;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		System.out.println(super.parler()+"Mon clan est celui de "+ clan);
	}
	
	public int getReputation() {
		return reputation;
	}
	public void perdre() {
		System.out.println(super.parler()+"J'ai perdu mon duel et mes "+argent+" sous, snif... J'ai deshonore le clan de "+clan);
		argent=0;
		reputation--;
	}
	public void gagner(int gain) {
		System.out.println(super.parler()+"Ce ronin pensait vraiment battre "+nom+" du clan de "+clan+" ? je l'ai depouille de ses "+gain+" sous.");
		argent+=gain;
		reputation++;
	}
}
