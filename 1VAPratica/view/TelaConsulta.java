package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class TelaConsulta extends JFrame {
	
	public TelaConsulta(){
		
		setTitle("Consulta");
		setSize(150,150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		setVisible(false);
	}
}
