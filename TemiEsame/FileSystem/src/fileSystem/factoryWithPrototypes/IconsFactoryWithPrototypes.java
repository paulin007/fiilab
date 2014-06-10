package fileSystem.factoryWithPrototypes;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

import fileSystem.Icon;
import fileSystem.IconsFactory;
import fileSystem.icons.BufferedImageDrawableIcon;

public class IconsFactoryWithPrototypes implements IconsFactory{

	private HashMap<String, IconPrototype> classes=new HashMap<String, IconPrototype>();
	
	private String iconsFolder;
	private IconPrototype parentFolderPrototype=new IconPrototype();
	private IconPrototype folderPrototype=new IconPrototype();
	private IconPrototype defaultIconPrototype=new IconPrototype();
	
	public IconsFactoryWithPrototypes(String iconsFolder,
			String parentFolderIconName, String folderIconName,
			String defaultIconName) {
		super();
		
		this.iconsFolder=iconsFolder;
		try {
			parentFolderPrototype.setDrawableIcon(new BufferedImageDrawableIcon(
						ImageIO.read(new File(iconsFolder+"/"+parentFolderIconName))));
			folderPrototype.setDrawableIcon(new BufferedImageDrawableIcon(
					ImageIO.read(new File(iconsFolder+"/"+folderIconName))));
			defaultIconPrototype.setDrawableIcon(new BufferedImageDrawableIcon(
					ImageIO.read(new File(iconsFolder+"/"+defaultIconName))));
		} catch (IOException e) {
			throw new NullPointerException(e.getMessage()+"[Icona Non Trovata!!]");
		}
	}

	public void putClass(String extension,String iconName){
		try {
			IconPrototype classPrototype=new IconPrototype();
			classPrototype.setDrawableIcon(new BufferedImageDrawableIcon(
					ImageIO.read(new File(iconsFolder+"/"+iconName))));
			classes.put(extension, classPrototype);
		} catch (IOException e) {
			throw new NullPointerException(e.getMessage()+"[Icona Non Trovata!!]");
		}
	}

	public Icon getIcon(String filename,IconPrototype prototype){
		Icon icon=prototype.clone();
		((BufferedImageDrawableIcon)icon.getDrawableIcon()).setName(filename);
		return icon;
	}
	
	@Override
	public Icon getDefaultIcon(String filename) {
		return getIcon(filename,defaultIconPrototype);
		
	}

	@Override
	public Icon getFatherFolderIcon(String filename) {
		return getIcon(filename,parentFolderPrototype);
	}
	
	@Override
	public Icon getFolderIcon(String filename) {
		return getIcon(filename,folderPrototype);
	}
	
	@Override
	public Icon getClassIcon(String filename) {
		int lastIndexOf=filename.lastIndexOf('.');
		if(lastIndexOf>0){
			String extension=filename.substring(lastIndexOf+1);
			IconPrototype iconPrototype=classes.get(extension);
			if(iconPrototype!=null){
				return getIcon(filename, iconPrototype);
			}
		}
		return null;//No alternative icons for now :(
	}
}

