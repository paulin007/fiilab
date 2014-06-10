package fileSystem.factoryWithPrototypes;

import fileSystem.Icon;
import fileSystem.icons.BufferedImageDrawableIcon;

public class IconPrototype extends Icon{

	@Override
	public IconPrototype clone() {
		IconPrototype prototype=new IconPrototype();
		prototype.setDrawableIcon(new BufferedImageDrawableIcon(
				((BufferedImageDrawableIcon)this.getDrawableIcon()).getImage()));
		return prototype;
	}
}
