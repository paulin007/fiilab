package fileSystem;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import drawings.DrawingsPanel;

public class FileSystemGraphics implements Observer{

	private DrawingsPanel panel;
	private FileSystem fileSystem;
	private RegularGrid grid;

	public FileSystemGraphics( FileSystem fileSystem) {
		super();
		this.panel = new DrawingsPanel();
		panel.addMouseListener(new FileSystemController(fileSystem));
		this.fileSystem = fileSystem;
		fileSystem.addObserver(this);
	}
	
	public void setGrid(RegularGrid grid) {
		this.grid = grid;
	}
	
	public DrawingsPanel getPanel() {
		return panel;
	}
	
	private void placeIcons(){
		ArrayList<Icon> icons=fileSystem.getAllIcons();
		grid.setWidth(panel.getWidth());
		grid.setHeight(panel.getHeight());
		grid.reset();
		for (Icon icon : icons) {
			icon.setRectangle(grid.nextCell());
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		panel.removeAll();
		placeIcons();
		panel.addAll(fileSystem.getAllIcons());
		panel.repaint();
	}
	
}
