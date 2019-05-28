package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TelaBusca extends JFrame {
	JLabel busLabel;
	JButton busButton;
	JTextField busField;
	
	public TelaBusca(){
		busLabel = new JLabel("Buscar:");
		busField = new JTextField(10);
		busButton = new JButton("Buscar");
		
		setSize(200,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(busLabel);
		add(busField);
		add(busButton);
		
		setVisible(false);
	}

	public JButton getBusButton() {
		return busButton;
	}
	
}
