package fr.demos.formation.poe.ventevehicules;

public class Voiture extends Vehicule{

	private int kilometrage;
	private String immatriculation;
	
	public Voiture(Modele argModele, double argPrixHT, String argCouleur, Etat argEtat, int argAnnee, String argImmatriculation) {
		super(argModele, argPrixHT, argCouleur, argEtat, argAnnee);
		this.immatriculation = argImmatriculation;
	}
		
	@Override
	public String toString() {
		return "Voiture [immatriculation=" + immatriculation + ", " + this.getModele() + ", Prix" + this.getPrix() + "]";
	}

	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	
	
	
}
