package fr.demos.formation.poe.ventevehicules;

public class VeloElectrique extends Velo implements Electrique {

	private int Autonomie;
	private int tempsCharge;
	private String TypeBatterie;
	private double bonusEcologique;

	public VeloElectrique(Modele argModele, double argPrixHT, String argCouleur, Etat argEtat, int argAnnee) {
		super(argModele, argPrixHT, argCouleur, argEtat, argAnnee);

	}

	
	
	@Override
	public String toString() {
		return "VeloElectrique [Autonomie=" + Autonomie + ", tempsCharge=" + tempsCharge + ", TypeBatterie="
				+ TypeBatterie + ", bonusEcologique=" + bonusEcologique + "]";
	}

	@Override
	public int getAutonomie() {
		// TODO Auto-generated method stub
		return Autonomie;
	}

	@Override
	public int getTempsCharge() {
		// TODO Auto-generated method stub
		return tempsCharge;
	}

	@Override
	public String getTypeBatterie() {
		// TODO Auto-generated method stub
		return TypeBatterie;
	}

	@Override
	public double getBonusEcologique() {
		// TODO Auto-generated method stub
		return bonusEcologique;
	}

	public void setAutonomie(int autonomie) {
		Autonomie = autonomie;
	}

	public void setTempsCharge(int tempsCharge) {
		this.tempsCharge = tempsCharge;
	}

	public void setTypeBatterie(String typeBatterie) {
		TypeBatterie = typeBatterie;
	}

	public void setBonusEcologique(double bonusEcologique) {
		this.bonusEcologique = bonusEcologique;
	}

}
