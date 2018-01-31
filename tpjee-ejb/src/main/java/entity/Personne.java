package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personne {
	
	@Id
	private String nom;
	private int salaire;
	
	public Personne(){
		
		nom = "Bill";
		salaire = 1000;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}	
	

}
