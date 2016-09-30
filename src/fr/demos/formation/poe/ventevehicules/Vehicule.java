package fr.demos.formation.poe.ventevehicules;

public abstract class Vehicule {

	private Modele modele;
	private double prixHT;
	private String couleur;
	private String options;
	private Etat etat;
	private int annee;
	
	public Vehicule(Modele argModele, double argPrixHT, String argCouleur, Etat argEtat, int argAnnee) {
		super();
		this.modele = argModele;
		this.prixHT = argPrixHT;
		this.couleur = argCouleur;
		this.etat = argEtat;
		this.annee = argAnnee;
	}

	// pour ajouter une option au String sans tout ressaisir
	public void addOption(String autreOption){
		//je suppose que mon séparateur est un ";"
		if (this.options !=null){
		this.options = this.options + ";" + autreOption;
		} else {
			this.options = autreOption;
		}
	}
	
	
	public double getPrix() {
		return prixHT;
	}

	public void setPrix(double prix) {
		this.prixHT = prix;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public Modele getModele() {
		return modele;
	}

	public int getAnnee() {
		return annee;
	}

	public String getEtat() {
		return etat.name();
	}
		
}
