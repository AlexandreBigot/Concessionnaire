package fr.demos.formation.poe.ventevehicules;
import java.util.ArrayList;
import java.util.Iterator;

// "commentaire important pour test GIT"

public class Garage <T> implements Iterable<T> { 	// on utilise certaines lettres en fonction d'une convention T, E...
							// je devrai préciser plus tard ce que je mets dans "T"

	private String nom;
	private ArrayList<T> contenu = new ArrayList();
	public Garage(String nom) {
		super();
		this.nom = nom;
	}
	
	public void ajouter(T t){
		contenu.add(t);
	}
	
	public Iterator<T> iterator(){
		return contenu.iterator();
	}
	
}
