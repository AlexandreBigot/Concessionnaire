package fr.demos.formation.poe.ventevehicules;

public class Velo extends Vehicule {

	public Velo(Modele argModele, double argPrixHT, String argCouleur, Etat argEtat, int argAnnee) {
		super(argModele, argPrixHT, argCouleur, argEtat, argAnnee);
	}

	@Override
	public String toString() {
		return this.getModele().getMarque() + " " + this.getModele().getReference();

	}
	
}
