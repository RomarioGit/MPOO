package view;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class TelaCadastroLivro extends JFrame {
	JRadioButton radioLivro = new JRadioButton("Livro");
	JRadioButton radioCliente = new JRadioButton("Cliente");

	ButtonGroup grupo = new ButtonGroup();

	public TelaCadastroLivro() {
		setLayout(new FlowLayout());

		add(radioLivro);
		add(radioCliente);

		grupo.add(radioCliente);
		grupo.add(radioLivro);

		setTitle("Cadastro");
		setSize(150, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(false);

	}

	public JRadioButton getRadioLivro() {
		return radioLivro;
	}

	public JRadioButton getRadioCliente() {
		return radioCliente;
	}

}
