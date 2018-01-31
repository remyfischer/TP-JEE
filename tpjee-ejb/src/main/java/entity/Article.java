package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Article {
	
	@Id
	private String codebarre;
	private int prix;
	
	public Article(){
		
		codebarre = "0000000";
		prix = 1;
		
	}

	public String getCodebarre() {
		return codebarre;
	}

	public void setCodebarre(String codebarre) {
		this.codebarre = codebarre;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	
	

}
