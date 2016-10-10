package fr.demos.formation.poe.ventevehicules;

public class MainGarage {

	public static void main(String[] args) {
	VeloElectrique ve1 = new VeloElectrique(new Modele("solex", "500sx"), 1000, "noir", Etat.CORRECT, 2014);
	ve1.setAutonomie(300);
	

	Modele mod1 = new Modele("Peugeot","VTTDeLaMortQuiTue");
	Velo v1 = new Velo (mod1, 300, "Rouge", Etat.NEUF, 2016);

	Garage<Velo> garage = new Garage<>("Vente vélos la défense");
	garage.ajouter(v1);
	garage.ajouter(ve1);
	for(Velo v : garage){
		System.out.println(v);
	}
	
	}//main
}//class
