package dispositiviATeatroTest;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import dispositiviATeatro.BattuteMediator;


/**
 * Un test per il programma
 * 
 * @author Alessandro Martinelli
 */
public class MainTest {

	public static void main(String[] args) {

		// Inizializzazione di un frame
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setTitle("Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// preparo i Dati per una scena in Dati Test
		DatiTest.preparaDati();
		// Inizializzo il Mediator, che è la parte principale del programma
		final BattuteMediator mediator = new BattuteMediator();

		// Creo un pannello dove vengono inseriti i pulsanti di controllo e lo
		// posiziono in alto nel frame
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		generateControlPanel(mediator, panel);
		frame.getContentPane().add(panel, BorderLayout.NORTH);

		// Genero un pannello dove saranno inseriti 4 visualizzatori: il Gobbo e
		// 3 Tablet, quello dell'AquilaReale
		// del Coccodrillo e dell'OrangoTango
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 2));

		preparaVisualizzatore(mediator, panel1, new GobboPanel(
				DatiTest.testScena));
		preparaVisualizzatore(mediator, panel1, new TabletPanel("AquilaReale"));
		preparaVisualizzatore(mediator, panel1, new TabletPanel("Coccodrillo"));
		preparaVisualizzatore(mediator, panel1, new TabletPanel("OrangoTango"));

		// aggiungo il pannello al frame
		frame.getContentPane().add(panel1);

		// Imposto i dati mancanti sul mediator e carico il copione
		mediator.setCast(DatiTest.cast);
		mediator.caricaCopione(DatiTest.testScena);

		// Visualizzo il frame
		frame.setVisible(true);
	}

	private static void preparaVisualizzatore(final BattuteMediator mediator,
			JPanel panel1, VisualizzazionePanel visualizzatore) {
		// carico il visualizzatore sul mediator
		mediator.addVisualizzatore(visualizzatore);
		// aggiungo il visualizzatore al pannello
		panel1.add(visualizzatore);
		// Metto un bordo al pannelli (Nota, non lo abbiamo visto a lezione)
		visualizzatore.setBorder(BorderFactory.createEtchedBorder());
	}

	private static void generateControlPanel(final BattuteMediator mediator,
			JPanel panel) {
		JButton pulsante1 = new JButton("Avanti");
		JButton pulsante2 = new JButton("Indietro");
		pulsante1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int posizione = DatiTest.getPosizione();
				if (posizione < DatiTest.battute.size()) {
					posizione++;
				}
				DatiTest.setPosizione(posizione);
				mediator.setCursore(posizione);
			}
		});
		pulsante2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int posizione = DatiTest.getPosizione();
				if (posizione > 0) {
					posizione--;
				}
				DatiTest.setPosizione(posizione);
				mediator.setCursore(posizione);
			}
		});
		panel.add(pulsante2);
		panel.add(pulsante1);
	}
}
