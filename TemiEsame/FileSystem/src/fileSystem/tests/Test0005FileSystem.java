package fileSystem.tests;

import java.io.File;

import javax.swing.JFrame;

import fileSystem.FileSystem;
import fileSystem.FileSystemGraphics;
import fileSystem.IconsFactoryKeeper;
import fileSystem.RegularGrid;
import fileSystem.factoryWithFlyweight.IconsFactoryWithFlyweight;
import fileSystem.factoryWithPrototypes.IconsFactoryWithPrototypes;

public class Test0005FileSystem {

	public static void main(String[] args) {

		FileSystem system=new FileSystem();
		
		FileSystemGraphics graphics=new FileSystemGraphics(system);
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setTitle("File System");
		frame.getContentPane().add(graphics.getPanel());
		frame.setVisible(true);
		
		//setFactory1();
		setFactory2();
		
		graphics.setGrid(new RegularGrid(10, 10, 100, 100));
	
		system.setActualFolder((new File("src")));
	}

	public static void setFactory1() {
		IconsFactoryWithFlyweight factory=new IconsFactoryWithFlyweight(
				"icons","folderback.png","folder.png","File.png");
		factory.putClass("java", "Text.png");
		IconsFactoryKeeper.getIconsKeeper().setIconsFactory(factory);
	}

	public static void setFactory2() {
		IconsFactoryWithPrototypes factory=new IconsFactoryWithPrototypes(
				"icons","folderback.png","folder.png","File.png");
		factory.putClass("java", "Text.png");
		IconsFactoryKeeper.getIconsKeeper().setIconsFactory(factory);
	}
}
