package fileSystem.factoryWithFlyweight;

import java.io.IOException;
import java.util.HashMap;

import fileSystem.Icon;
import fileSystem.IconsFactory;
import fileSystem.icons.BufferedImageDrawableIcon;

public class IconsFactoryWithFlyweight implements IconsFactory{

	private String iconsFolder;
	private String parentFolderIconName;
	private String folderIconName;
	private String defaultIconName;
	
	private HashMap<String, String> classes=new HashMap<String, String>();
	
	private BufferedImageFlyweight flyWeight=new BufferedImageFlyweight();
	
	public IconsFactoryWithFlyweight(String iconsFolder,
			String parentFolderIconName, String folderIconName,
			String defaultIconName) {
		super();
		this.iconsFolder = iconsFolder;
		this.parentFolderIconName = parentFolderIconName;
		this.folderIconName = folderIconName;
		this.defaultIconName = defaultIconName;
	}

	public void putClass(String extension,String iconName){
		classes.put(extension, iconName);
	}
	
	@Override
	public Icon getDefaultIcon(String filename) {
		return getIcon(filename, iconsFolder+"/"+defaultIconName);
	}

	@Override
	public Icon getFatherFolderIcon(String filename) {
		return getIcon(filename, iconsFolder+"/"+parentFolderIconName);
	}
	
	@Override
	public Icon getFolderIcon(String filename) {
		return getIcon(filename, iconsFolder+"/"+folderIconName);
	}
	
	@Override
	public Icon getClassIcon(String filename) {
		int lastIndexOf=filename.lastIndexOf('.');
		if(lastIndexOf>0){
			String extension=filename.substring(lastIndexOf+1);
			String iconName=classes.get(extension);
			if(iconName!=null){
				return getIcon(filename, iconsFolder+"/"+iconName);
			}
		}
		return null;//No alternative icons for now :(
	}

	private Icon getIcon(String filename, String iconFile) {
		try {
			BufferedImageDrawableIcon drawableIcon=new BufferedImageDrawableIcon(flyWeight.getIcon(iconFile));
			drawableIcon.setName(filename);
			Icon icon=new Icon();
			icon.setDrawableIcon(drawableIcon);
			return icon;
		} catch (IOException e) {
			throw new NullPointerException(e.getMessage()+"[Icona Non Trovata!!]");
		}
	}
	
	
}

