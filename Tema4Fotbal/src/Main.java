
public class Main {

	public static void main(String[] args) {
	    Joc joc1=new Joc ("Echipa Barcelona","Echipa RealMadrid");
	    Joc joc2=new Joc("Echipa Inter","Echipa Chelsea");
	    
	    joc1.simulare();
	    joc2.simulare();
	    
	    System.out.println(joc1);
	    System.out.println(joc2);

	}

}
