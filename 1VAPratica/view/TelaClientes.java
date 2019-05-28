package view;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaClientes extends JFrame {
	JRadioButton radioLivro,radioCliente;
	JLabel labelNome,labelCPF;
	JTextField nomeField,cpfField;
	JButton addButton;
	
	ButtonGroup grupos = new ButtonGroup();
	public TelaClientes(){ 
		radioLivro = new JRadioButton("Livro");
		radioCliente = new JRadioButton("Cliente",true);
		
		
		labelNome = new JLabel("Nome");
		labelCPF = new JLabel("CPF");
		nomeField = new JTextField(10);
		cpfField = new JTextField(10);
		addButton = new JButton("Add");
		
		
		setTitle("Cadastro de Clientes");
		setSize(150, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(radioLivro);
		add(radioCliente);
		
		add(labelNome);
		add(nomeField);
		add(labelCPF);
		add(cpfField);
		add(addButton);
		
		grupos.add(radioCliente);
		grupos.add(radioLivro);
		
		setVisible(false);
	}
	public JRadioButton getRadioLivro() {
		return radioLivro;
	}
	public JRadioButton getRadioCliente() {
		return radioCliente;
	}
	public JButton getAddButton() {
		return addButton;
	}
	public JTextField getNomeField() {
		return nomeField;
	}
	public JTextField getCpfField() {
		return cpfField;
	}
	
}
