package fileSystem;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FileSystemController extends MouseAdapter{

	private FileSystem fileSystem;

	public FileSystemController(FileSystem fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		for (int i = 0; i < fileSystem.getAllIcons().size(); i++) {
			Icon icon=fileSystem.getAllIcons().get(i);
			boolean click=icon.click(x, y);
			if(click)
				return;
		}
	}
	
}
