package srp.sbagliato;

public class GeometriaComputazionale {

	public static void main(String[] args) {
		
		Rettangolo rett1=new Rettangolo(20,20,40,40);
		
		Rettangolo rett2=new Rettangolo(100,10,30,50);
		
		if(rett1.getArea()<rett2.getArea()){
			System.out.println("Il primo rettangolo � pi� piccolo del secondo");
		}else{
			System.out.println("Il primo rettangolo � pi� grande del secondo");
		}
	}
}
