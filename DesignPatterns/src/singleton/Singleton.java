package singleton;

public class Singleton {

	
	/* this unique constructor cannnot be called
	 * outside Singleton, and it is the only
	 * constructor available
	 */
	private Singleton(){
		
	}
	
	//This is the unique available singleton instance
	private static Singleton singleton=new Singleton();
	
	public static Singleton getSingleton(){
		return singleton;
	}
	
	public void method01(){
		//TODO 
		//Do something
	}
	
	public void method02(){
		//TODO 
		//Do something
	}
}
