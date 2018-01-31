package entity;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class Controller implements ControllerInterface{
	
	@PersistenceContext
	private EntityManager em;
	
	public Controller(){
		
	}
	
	public void testCreation(){
		
		Directeur directeur = new Directeur();
		Personne personne = new Personne();
		Magasin magasin = new Magasin();
		
		em.persist(directeur);
		em.persist(personne);
		em.persist(magasin);
		
		em.close();
		
	}

}
