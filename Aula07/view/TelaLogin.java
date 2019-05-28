package view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaLogin extends JFrame {

	JLabel loginLb, senhaLb;
	JTextField loginField, senhaField;
	JButton sairButton;
	JButton entrarButton;
	

	public TelaLogin() {
		super("Título");
		loginLb = new JLabel("Login: ");
		senhaLb = new JLabel("Senha: ");
		loginField = new JTextField(10);
		senhaField = new JTextField(10);
		entrarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");

		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		add(loginLb);
		add(loginField);
		add(senhaLb);
		add(senhaField);
		add(entrarButton);
		add(sairButton);

		setVisible(false);

	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

}
