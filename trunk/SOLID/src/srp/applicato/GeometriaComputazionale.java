package srp.applicato;

public class GeometriaComputazionale {

	public static void main(String[] args) {
		
		Rettangolo rett1=new Rettangolo(40,40);
		
		Rettangolo rett2=new Rettangolo(30,50);
		
		if(rett1.getArea()<rett2.getArea()){
			System.out.println("Il primo rettangolo è più piccolo del secondo");
		}else{
			System.out.println("Il primo rettangolo è più grande del secondo");
		}
	}
}
