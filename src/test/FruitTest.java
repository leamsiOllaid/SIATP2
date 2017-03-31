package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import code.FicheNutritionelle;
import code.Fournisseur;
import code.Fruit;

/**
 * The test class testFruit.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FruitTest
{
    /**
     * Default constructor for test class testFruit
     */
    public FruitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testpepins()
    {
        Fruit pinklady = new Fruit();
        assertEquals(5, pinklady.addPepins(4));
    }
    
    @Test
    public void testnom()
    {
        Fruit fruit2 = new Fruit();
        assertEquals("Peche", fruit2.getNom());
    }
    
    @Test
    public void testChangenom()
    {
        Fruit fruit2 = new Fruit();
        fruit2.setNom("Poire");
        assertEquals("Poire", fruit2.getNom());
    }
    
    @Test
    public void testNomFruit()
    {
        Fruit golden = new Fruit();
        assertEquals("Peche", golden.getNom());
    }
    
    @Test
    public void testAddfruit(){
    	Fruit pink = new Fruit("PinkLady", 12);
    	FicheNutritionelle fichePomme2 = new FicheNutritionelle(54,1986);
    	fichePomme2.setFruit(pink);
    	pink.setFiche(fichePomme2);
    	testLink(pink, fichePomme2);
    }

	private void testLink(Fruit pink, FicheNutritionelle fichePomme2) {
		assertEquals(pink,fichePomme2.getFruit());
    	assertEquals(fichePomme2, pink.getFiche());
	}
	
	@Test
	public void testNbPepin(){
		Fruit pomme = new Fruit("PinkLady", 15);
		pomme.setNbpepins(54);
		assertEquals(54, pomme.getNbPepins());
	}
	
	@Test
	public void testNbPepin2(){
		Fruit pomme = new Fruit("PinkLady", 15);
		assertEquals(15, pomme.getNbpepins());
	}
	
	@Test
	public void testManger(){
		Fruit pomme = new Fruit("PinkLady", 15);
		pomme.manger();
		assertEquals(95, pomme.getQtefruit());
	}
	
	@Test
	public void testManger2(){
		Fruit pomme = new Fruit("PinkLady", 15);
		pomme.setQtefruit(2);
		pomme.manger();
		assertEquals(0, pomme.getQtefruit());
	}
	
	@Test
	public void testFiche(){
		Fruit pomme = new Fruit("PinkLady", 15);
		FicheNutritionelle fichePomme2 = new FicheNutritionelle(80,1986);
		pomme.setFiche(fichePomme2);
		assertEquals(fichePomme2, pomme.getFiche());
	}
	
	@Test
	public void testGetCal(){
		Fruit pomme = new Fruit("PinkLady", 15);
		FicheNutritionelle fichePomme2 = new FicheNutritionelle(80,1986);
		fichePomme2.setFruit(pomme);
		pomme.setFiche(fichePomme2);
		assertEquals(80,pomme.getNbCal());
	}
	
	@Test
	public void testManger3(){
		Fruit pomme = new Fruit("PinkLady", 15);
		pomme.setQtefruit(150);
		assertEquals(150, pomme.getQtefruit());
	}
	
	@Test
	public void testFicheNutrition(){
		Fruit pomme = new Fruit("PinkLady", 15);
		FicheNutritionelle fichePomme = new FicheNutritionelle(250,1682);
		pomme.setFiche(fichePomme);
		assertEquals(fichePomme, pomme.getNutrition());
	}
	
	@Test
	public void testSetFicheNutrition2(){
		Fruit pomme = new Fruit("PinkLady", 15);
		FicheNutritionelle fichePomme = new FicheNutritionelle(250,1682);
		pomme.setNutrition(fichePomme);
		assertEquals(fichePomme, pomme.getNutrition());
	}
	
	@Test
	public void testSetFicheNutrition3(){
		FicheNutritionelle fichePomme = new FicheNutritionelle(250,1682);
		
		assertEquals(1682, fichePomme.getAnneeD());
	}
	
	@Test
	public void testSetFicheNutrition4(){
		Fruit pomme = new Fruit("PinkLady", 15);
		FicheNutritionelle fichePomme = new FicheNutritionelle(250,1682,pomme);
		pomme.setFiche(fichePomme);
		assertEquals(pomme.getFiche(), fichePomme);
	}
	
	@Test
	public void testFournisseur(){
		Fournisseur fournisseur1 = new Fournisseur();
		assertEquals("Fourn1", fournisseur1.getNom());
	}
	@Test
	public void testFournisseur2(){
		Fournisseur fournisseur1 = new Fournisseur();
		fournisseur1.setNom("baptiste");
		assertEquals("baptiste", fournisseur1.getNom());
	}
	
	@Test
	public void testFournisseur3(){
		Fruit pomme = new Fruit("PinkLady", 15);
		Fruit poire = new Fruit("Golden", 14);
		List<Fruit> lst = new ArrayList<Fruit>();
		lst.add(poire);
		lst.add(pomme);
		Fournisseur fournisseur1 = new Fournisseur();
		pomme.setFourn(fournisseur1);
		fournisseur1.setFruits(lst);
		
		assertEquals(pomme, fournisseur1.getFruits().get(1));
	}
	
	@Test
	public void testFournisseur4(){
		Fruit pomme = new Fruit("PinkLady", 15);
		Fruit poire = new Fruit("Golden", 14);
		List<Fruit> lst = new ArrayList<Fruit>();
		lst.add(poire);
		lst.add(pomme);
		Fournisseur fournisseur1 = new Fournisseur();
		pomme.setFourn(fournisseur1);
		fournisseur1.setFruits(lst);
		fournisseur1.deleteFruit(pomme);
		assertEquals(poire, fournisseur1.getFruits().get(0));
	}
	
	@Test
	public void testFournisseur5(){
		Fruit pomme = new Fruit("PinkLady", 15);
		Fournisseur fournisseur1 = new Fournisseur();
		fournisseur1.addFruit(pomme);
		Fruit recup = fournisseur1.getFruits().get(0);
		assertEquals(pomme, recup);
	}
	
	@Test
	public void testFournisseur6(){
		Fruit pomme = new Fruit("PinkLady", 15);
		Fournisseur fournisseur1 = new Fournisseur();
		fournisseur1.addFruit(pomme);
		pomme.setFournisseur(fournisseur1);
		assertEquals(fournisseur1, pomme.getFourn());
	}
	
	@Test
	public void testFournisseur7(){
		Fruit pomme = new Fruit("PinkLady", 15);
		Fournisseur fournisseur1 = new Fournisseur();
		fournisseur1.addFruit(pomme);
		pomme.setFourn(fournisseur1);
		assertEquals(fournisseur1, pomme.getFourn());
	}
	
}

