package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Personne {
	
	@Id
	private String nom;
	private int salaire;
	
	@ManyToOne
	private Magasin magasin;
	
	
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
