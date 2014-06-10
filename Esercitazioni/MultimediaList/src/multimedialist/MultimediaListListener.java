package multimedialist;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MultimediaListListener implements KeyListener{

	private MultimediaList list;
	private Placer placer;
	
	public MultimediaListListener(MultimediaList list) {
		super();
		this.list = list;
	}
	
	public void setPlacer(Placer placer) {
		this.placer = placer;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP){
			list.up();
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN){
			list.down();
		}else if(e.getKeyCode()==KeyEvent.VK_A){
			placer.setPositioning(Placer.VERTICAL);
			list.update();
		}else if(e.getKeyCode()==KeyEvent.VK_B){
			placer.setPositioning(Placer.DIAGONAL);
			list.update();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
