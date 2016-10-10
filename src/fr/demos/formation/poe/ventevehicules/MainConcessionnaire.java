package fr.demos.formation.poe.ventevehicules;
import java.util.HashMap;

public class MainConcessionnaire {

	public static void main(String[] args) {
		VeloElectrique v = new VeloElectrique(new Modele("solex","500sx"),1000,"noir",Etat.CORRECT,2014);
		v.setAutonomie(300);
	
		// je crée une hasmap
		HashMap<String,Voiture> listeVoitures = new HashMap<>();
		
		// je crée des modèles
		Modele mod1 = new Modele("Peugeot","106");
		Modele mod2 = new Modele("Toyota","Yaris");
		Modele mod3 = new Modele("Toyota","IQ");
	
		// je crée des voitures
		Voiture voit1 = new Voiture(mod1, 400, "Noir", Etat.EPAVE, 1998, "AA111AA");
		Voiture voit2 = new Voiture(mod1, 1200, "Jaune", Etat.CORRECT, 1998, "AA222AA");
		Voiture voit3 = new Voiture(mod2, 3000, "Gris clair", Etat.BON, 1998, "AA333AA");
		Voiture voit4 = new Voiture(mod3, 16000, "Gris foncé", Etat.BON, 1998, "AA444AA");
		
		//je mets les voitures dans une HashPam
		listeVoitures.put(voit1.getImmatriculation(), voit1);
		listeVoitures.put(voit2.getImmatriculation(), voit2);
		listeVoitures.put(voit3.getImmatriculation(), voit3);
		listeVoitures.put(voit4.getImmatriculation(), voit4);

		// je cherche une voiture par sa clé (immatriculation)
		// histoire de prouver qu'on retrouve par la clé
		// sinon on ferai un sysout de la voiture directement...
		
		Voiture jeRetrouveMaVoitureDansHashMap = listeVoitures.get("AA444AA");
		System.out.println(jeRetrouveMaVoitureDansHashMap);
		
	}

}
