package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Vendeur extends Personne {
	
	@OneToMany
	private List<Article> articles;
	public Vendeur(){
		
		super();
		this.articles = new ArrayList<Article>();
		
		
		
	}
	
	public void ajouterArticle(Article _article){
		
		this.articles.add(_article);
		
	}
	
	public List<Article> getArticles(){
		
		return this.articles;
		
	}
	
	public int getTotalArticleVendu(){
		
		int nbArticleVendu = 0;
		for(Article article : this.getArticles()){
			
			nbArticleVendu++;
			
		}
		
		return nbArticleVendu;
		
	}

	

}
