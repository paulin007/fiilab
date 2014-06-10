package fileSystem;

import java.io.File;
import java.util.ArrayList;
import java.util.Observable;

public class FileSystem extends Observable{

	private File actualFolder;

	private ArrayList<Icon> allIcons=new ArrayList<Icon>();

	private class SetFolderAction implements Action{
		private File folder;
		
		public SetFolderAction(File folder) {
			super();
			this.folder = folder;
		}

		@Override
		public void execute() {
			setActualFolder(folder);
		}
	}
	
	public void setActualFolder(File cartellaAttuale) {
		this.actualFolder = cartellaAttuale;
		updateIcons();
		setChanged();
		notifyObservers();
	}
	
	public ArrayList<Icon> getAllIcons() {
		return allIcons;
	}
	
	private void updateIcons(){
	
		allIcons.clear();
		
		File parentFolder = (new File(actualFolder.getAbsolutePath())).getParentFile();
		if(parentFolder!=null){
			Icon fatherFolderIcon=IconsFactoryKeeper.getIconsKeeper().getIconsFactory().getFatherFolderIcon(parentFolder.getName());
			fatherFolderIcon.setAction(new SetFolderAction(parentFolder));
			allIcons.add(fatherFolderIcon);
		}
		
		File[] files=actualFolder.listFiles();

		//First all directories
		for (int i = 0; i < files.length; i++) {
			File file=files[i];
			if(file.isDirectory()){
				Icon folderIcon=IconsFactoryKeeper.getIconsKeeper().getIconsFactory().getFolderIcon(file.getName());
				folderIcon.setAction(new SetFolderAction(file));
				allIcons.add(folderIcon);
			}else{
				Icon fileIcon=IconsFactoryKeeper.getIconsKeeper().getIconsFactory().getClassIcon(file.getName());
				if(fileIcon==null){
					fileIcon=IconsFactoryKeeper.getIconsKeeper().getIconsFactory().getDefaultIcon(file.getName());
				}
				fileIcon.setAction(null);
				allIcons.add(fileIcon);
			}
		}
		
	}

}
