package code;

import java.util.ArrayList;
import java.util.List;

public class Fournisseur {
	private String nom;
	private List<Fruit> fruits;
	
	
	public Fournisseur(){
		this.nom = "Fourn1";
		this.fruits = new ArrayList<Fruit>();
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void setNom(String n){
		this.nom = n;
	}
	
	public void addFruit(Fruit f){
		//f.setFournisseur(this);
		this.fruits.add(f);
	}
	
	public void deleteFruit(Fruit f){
		//f.setFournisseur(null);
		this.fruits.remove(f);
	}

	public List<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}
	
}
