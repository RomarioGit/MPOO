package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaVenda extends JFrame {
	JLabel lbTitulo,lbAutor,lbCPF;
	JTextField tituloField,autorField,cpfField;
	JButton confirmaButton;
	public TelaVenda(){
		setTitle("Venda");
		
		lbTitulo = new JLabel("Título");
		tituloField = new JTextField(10);
		lbAutor = new JLabel("Autor");
		autorField = new JTextField(10);
		lbCPF = new JLabel("CPF");
		cpfField = new JTextField(10);
		confirmaButton = new JButton("Confirmar");
		
		setSize(180,150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(lbTitulo);
		add(tituloField);
		add(lbAutor);
		add(autorField);
		add(lbCPF);
		add(cpfField);
		add(confirmaButton);
		
		
		setVisible(false);
	}
	public JButton getConfirmaButton() {
		return confirmaButton;
	}
	
	
}
