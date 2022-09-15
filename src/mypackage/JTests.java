package mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JTests {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testAttendant() {
		Employe p2 = new Employe("Mark", "0744555666", "mark@institution.com");
		Client p3 = new Client("Ana", "0700999999", "ana@gmail.com");
		
		Formulaire f1 = new Formulaire("11", "scop", "1");
		Formulaire f2 = new Formulaire("12", "altscop", "2");
		
		p3.createFormulaire(f1);
		p3.createFormulaire(f2);
		
		p2.setStatus(f1, "0");
		
		String resultat = "true";
		
		System.out.println("testAttendant():");
		System.out.println("Expected: " + resultat);
		System.out.println("Got: " + p2.verifStatusAttendant(f1) + "\n");
	
		assertFalse(p2.verifStatusAttendant(f1).equals(resultat));
		
		System.out.println("testAttendant():");
		System.out.println("Expected: " + resultat);
		System.out.println("Got: " + p2.verifStatusAttendant(f2) + "\n");
		
		assertTrue(p2.verifStatusAttendant(f2).equals(resultat));
	}
	
	@Test
	void testFormulaires() {
		Employe p2 = new Employe("Mark", "0744555666", "mark@institution.com");
		Client p3 = new Client("Ana", "0700999999", "ana@gmail.com");
		
		p3.createFormulaire(new Formulaire("11", "scop", "1"));
		p3.createFormulaire(new Formulaire("12", "altscop", "2"));
		p3.createFormulaire(new Formulaire("13", "celelaltscop", "3"));
		p3.createFormulaire(new Formulaire("14", "celmaiscop", "4"));
		
		int resultat = 6;
		
		System.out.println("testFormulaires():");
		System.out.println("Expected: " + resultat);
		System.out.println("Got: " + p2.getNoFormulaires());
		
		assertEquals(p2.getNoFormulaires(), resultat);
	}
}
