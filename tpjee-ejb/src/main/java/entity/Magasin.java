package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Magasin {
	
	@Id
	private int id;
	private String adresse;
	
	@OneToMany(mappedBy="magasin")
	private List<Personne> employes;
	
	@OneToMany(mappedBy="magasin")
	private List<Article> articles;

	public Magasin(){
		
		id = 0;
		adresse = "cours gambetta";
		
	}
	

;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	

}
