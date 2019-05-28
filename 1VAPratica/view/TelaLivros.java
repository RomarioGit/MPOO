package view;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaLivros extends JFrame {
	JRadioButton radioLivro, radioCliente;
	JLabel labelISBN, labelAutor, labelEditora, labelTitulo;
	JTextField isbnField, autorField, editoraField, tituloField;
	JButton addButton;

	ButtonGroup grupo = new ButtonGroup();

	public TelaLivros() {
		radioLivro = new JRadioButton("Livro",true);
		radioCliente = new JRadioButton("Cliente");

		labelISBN = new JLabel("ISBN");
		labelAutor = new JLabel("Autor");
		labelEditora = new JLabel("Editora");
		labelTitulo = new JLabel("Título");
		isbnField = new JTextField(10);
		autorField = new JTextField(10);
		editoraField = new JTextField(10);
		tituloField = new JTextField(10);
		addButton = new JButton("Add");

		

		setTitle("Cadastro Livros");
		setSize(150, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		add(radioLivro);
		add(radioCliente);

		add(labelISBN);
		add(isbnField);
		add(labelTitulo);
		add(tituloField);
		add(labelEditora);
		add(editoraField);
		add(labelAutor);
		add(autorField);
		add(addButton);
		
		grupo.add(radioCliente);
		grupo.add(radioLivro);

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

	public JTextField getIsbnField() {
		return isbnField;
	}

	public JTextField getAutorField() {
		return autorField;
	}

	public JTextField getEditoraField() {
		return editoraField;
	}

	public JTextField getTituloField() {
		return tituloField;
	}
	
}
