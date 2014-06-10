package javaio;

import java.io.File;

public class Esempio01Files {

	public static void main(String[] args) {
	
		File root=new File("src");
		
		File[] files=root.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			System.out.println("Package Directory: "+files[i].getName());
			
			File[] files2=files[i].listFiles();
			
			for (int j = 0; j < files2.length; j++) {
				System.out.println("Class File:  "+files2[j].getName());
			}
		}
		
	}
	
}
