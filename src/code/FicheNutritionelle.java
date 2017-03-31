package code;


/**
 * Write a description of class FicheNutritionelle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FicheNutritionelle
{
    // instance variables - replace the example below with your own
    private int kcal; //kcal pour 100g 
    private int anneeDecouverte;
    private Fruit fr;

    /**
     * Constructor for objects of class FicheNutritionelle
     */
    public FicheNutritionelle(int cal, int anneeD)
    {
        // initialise instance variables

        this.kcal = cal;
        this.anneeDecouverte = anneeD;
        this.fr = null;
    }
    
    public FicheNutritionelle(int cal, int anneeD, Fruit fruit)
    {
        // initialise instance variables
        this.kcal = cal;
        this.anneeDecouverte = anneeD;
        this.fr = fruit;
    }
    
    public FicheNutritionelle()
    {
        // initialise instance variables
        this.kcal = 0;
        this.anneeDecouverte = 0;
    }

    public int getAnneeD(){
        return this.anneeDecouverte;
    }
    
    public int getKcal(){
        return this.kcal;
    }
    
    public void setFruit(Fruit f){
    	//f.setFiche(this);
    	this.fr = f;
    }
    
    public Fruit getFruit(){
    	return this.fr;
    }
     
  
}
