package tp11;

class Point{
	private String nom=".";
	private int abs,ord;
	
	Point(int a,int o){
		abs=a;
		ord=o;
	}
	
	Point(String nom){
		this.nom=nom;
		}
	
	Point(String nom,int a,int o){
		this.nom=nom;
		abs=a;
		ord=o;
	}
	
	void TranslHoriz(int a) {
		abs+=a;
	}
	
	void TranslVert(int a) {
		ord+=a;
	}
	
	void Translation(int a,int b) {
		abs+=a;
		ord+=b;
	}
	
	void setNom(String ch) {
		nom=ch;
	}
	
	void setAbscisse(int a) {
		abs=a;
	}
	
	void setOrdonnée(int a) {
		ord=a;
	}
	
	String getNom(){
		return nom;
	}
	
	int getAbscisse() {
		return abs;
	}
	
	int getOrdonnée() {
		 return ord;
	}
	
	void Affiche() {
		System.out.println(nom+" ( "+abs+" , "+ord+" )");
	}
}

public class Test_Point {
	public static void main(String[]args) {
		
		
		Point p1;
		p1= new Point(3,5);
		Point p2 = new Point ("a");
		Point p3 = new Point ("b", 3,5);
		System.out.println("\n ---------------------------\n");
		System.out.println("les points créés sont :");
		
		
		p1.Affiche();
		p2.Affiche();
		p3.Affiche();
		
		
		System.out.println("\n ---------------------------\n");
		System.out.println("translation des point ");
		p1.TranslHoriz (4);
		p2.TranslVert (3);
		p3.Translation (5,2);
		p1.Affiche ();
		p2.Affiche ();
		p3.Affiche ();
		
		
		System.out.println("\n ---------------------------\n");
		System.out.println("modification des attributs des points") ;
		p1.setNom("SRI21");
		p2.setAbscisse(25);
		p3.setOrdonnée(50);
		p1.Affiche ();
		p2.Affiche ();
		p3.Affiche ();
		
		
		System.out.println("\n ---------------------------\n");
		System.out.println("utilisation des méthodes get");
		String x=p1.getNom();
		int y=p1.getAbscisse();
		int z=p1.getOrdonnée();
		System.out.println(" le nom du point p1 est : " + x);
		System.out.println(" son abscisse est : " + y);
		System.out.println(" son ordonnée est : " + z);
	
	
		//p3.nom="Test";
		//p3.Abscisse=2 ;
		//p3.Ordonnée=4 ; les attributs sont privés
	}
}
