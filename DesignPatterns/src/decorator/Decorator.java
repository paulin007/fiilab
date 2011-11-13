package decorator;

/* Nota: c'� una certa somiglianza con il pattern Proxy,
 * la differenza � che non mi importa che il metodo 
 * set, ma mi importa che la 'operation' faccia qualcosa 
 * in pi� (per l'appunto, aggiunga una Decorazione) rispetto
 * al comportamento orginale del 'Component' che 
 * passiamo al cotruttore  
 */
public class Decorator implements IComponent{

	private IComponent component;

	public Decorator(IComponent component) {
		super();
		this.component = component;
	}
	
	@Override
	public void operation() {
		component.operation();
		addictionalOperation();
	}
	
	public void addictionalOperation(){
		System.out.println("I am doing something more!");
	}
}
