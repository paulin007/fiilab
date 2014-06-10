package fileSystem;

public class IconsFactoryKeeper {

	//As Singleton
	private static IconsFactoryKeeper iconsKeeper=new IconsFactoryKeeper();

	private IconsFactoryKeeper(){
		
	}
	
	public static IconsFactoryKeeper getIconsKeeper() {
		return iconsKeeper;
	}
	
	//As keeper
	private IconsFactory iconsFactory;

	public IconsFactory getIconsFactory() {
		return iconsFactory;
	}

	public void setIconsFactory(IconsFactory iconsFactory) {
		this.iconsFactory = iconsFactory;
	}
	
}
