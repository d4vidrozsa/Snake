package snake;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameFrame extends JFrame implements ActionListener {

	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu;
	JMenu settingsMenu;
	JMenu helpMenu;
	
	JMenuItem newGame;
	public GameFrame(){
		
		this.add(new GamePanel());
		this.setTitle("Snek");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();

		this.setLocationRelativeTo(null);
		
		fileMenu = new JMenu("File");
		settingsMenu = new JMenu("Settings");
		helpMenu = new JMenu("Help");
		menuBar.add(fileMenu);
		menuBar.add(settingsMenu);
		menuBar.add(helpMenu);

		
		newGame = new JMenuItem("New Game");
		
		fileMenu.add(newGame);
		this.setJMenuBar(menuBar);
		this.setVisible(true);
		newGame.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == newGame) {
			
		}
		
	}
}
