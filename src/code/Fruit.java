package code;

/**
 * Write a description of class Fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruit
{
    // instance variables - replace the example below with your own
    private String nom;
    private int nbpepins;
    private int qtefruit = 100;
    private FicheNutritionelle nutrition;
    private Fournisseur fourn;

    /**
     * Constructor for objects of class Fruit
     */
    public Fruit()
    {
        // initialise instance variables
        this.nom = "Peche";
        this.nbpepins = 1;
        this.nutrition = new FicheNutritionelle();
        this.fourn = null;
    }
    
    public Fruit(String nom,int pepins)
    {
        // initialise instance variables
        this.nom = nom;
        this.nbpepins = pepins;
        this.nutrition = null;
    }
    
 
    public int addPepins(int p){
        return this.nbpepins+=p;
    }

    public int getNbPepins(){
        return this.nbpepins;
    }
    
    public void manger(){
    	if(this.qtefruit>=5){
    		this.qtefruit-=5;
    	}else{
    		this.qtefruit = 0;
    	}
    }
    public String getNom(){
        return this.nom;
    }
    
    public void setNom(String n){
        this.nom = n;
    }
    
    public int getNbCal(){
        return this.nutrition.getKcal();
    }
    
    public void setFiche(FicheNutritionelle n){
    	//n.setFruit(this);
        this.nutrition = n;
    }
    
    public FicheNutritionelle getFiche(){
        return this.nutrition;
    }
    
    
    public void setFournisseur(Fournisseur f){
    	/*for( int i=0; i<this.fourn.getFruits().size(); i ++ ){
    		if(this.fourn.getFruits().get(i) == this){
    			this.fourn.getFruits().remove(i);
    		}
    	}	*/
    	this.fourn = f;
    }
    

	public int getNbpepins() {
		return nbpepins;
	}

	public void setNbpepins(int nbpepins) {
		this.nbpepins = nbpepins;
	}

	public int getQtefruit() {
		return qtefruit;
	}

	public void setQtefruit(int qtefruit) {
		this.qtefruit = qtefruit;
	}

	public FicheNutritionelle getNutrition() {
		return nutrition;
	}

	public void setNutrition(FicheNutritionelle nutrition) {
		this.nutrition = nutrition;
		//this.nutrition.setFruit(this);
		//nutrition.getFruit(this);
	}

	public Fournisseur getFourn() {
		return fourn;
	}

	public void setFourn(Fournisseur fourn) {
		this.fourn = fourn;
	}

}
