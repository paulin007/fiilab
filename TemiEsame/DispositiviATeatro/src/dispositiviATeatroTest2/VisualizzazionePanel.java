package dispositiviATeatroTest2;

import java.util.HashMap;

import messagePanel.Message;
import messagePanel.MessagePanel;
import messagePanel.MessagePanelColor;
import dispositiviATeatro.Messaggio;
import dispositiviATeatro.Messaggio.ColoreMessaggio;
import dispositiviATeatro.Visualizzatore;

public class VisualizzazionePanel extends MessagePanel implements Visualizzatore{

	private String[] personaggi;
	
	private static HashMap<ColoreMessaggio, MessagePanelColor> colorsMap=new HashMap<Messaggio.ColoreMessaggio, MessagePanelColor>();
	
	static{
		colorsMap.put(ColoreMessaggio.ROSSO, MessagePanelColor.RED);
		colorsMap.put(ColoreMessaggio.ROSA, MessagePanelColor.PINK);
		colorsMap.put(ColoreMessaggio.ARANCIONE, MessagePanelColor.ORANGE);
		colorsMap.put(ColoreMessaggio.MARRONE, MessagePanelColor.BROWN);
		colorsMap.put(ColoreMessaggio.GIALLO, MessagePanelColor.YELLOW);
		colorsMap.put(ColoreMessaggio.GRIGIO, MessagePanelColor.GRAY);
		colorsMap.put(ColoreMessaggio.VERDE, MessagePanelColor.GREEN);
		colorsMap.put(ColoreMessaggio.BLU, MessagePanelColor.BLUE);
		colorsMap.put(ColoreMessaggio.VIOLA, MessagePanelColor.PURPLE);
		colorsMap.put(ColoreMessaggio.DEFAULT, MessagePanelColor.GRAY);
	}
	
	public VisualizzazionePanel(String... personaggi) {
		super();
		this.personaggi = personaggi;
	}

	@Override
	public void addMessaggio(Messaggio messaggio) {
		Message message=new Message(colorsMap.get(messaggio.getColore()), messaggio.getTesto());
		this.addMessage(message);
	}
	
	@Override
	public String[] personaggi() {
		return personaggi;
	}
	
	@Override
	public void ripulisciMessaggi() {
		this.removeAllMessage();
	}
	
	@Override
	public void setCursore(int indice) {
		this.setMessageCursor(indice);
	}
}
