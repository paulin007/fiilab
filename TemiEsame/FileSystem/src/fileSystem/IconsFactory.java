package fileSystem;

/**
 * Generates icons for specific uses
 * @author Alessandro
 */
public interface IconsFactory {

	public Icon getFolderIcon(String filename);
	
	public Icon getFatherFolderIcon(String filename);
	
	public Icon getDefaultIcon(String filename);
	
	/**
	 * Return a specific icon based upon the extension of the file,
	 * or null if there is no specific icon.
	 * @param filename
	 * @return
	 */
	public Icon getClassIcon(String filename);

}
