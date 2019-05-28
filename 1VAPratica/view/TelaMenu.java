package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaMenu extends JFrame {
	JButton menuCadastrar, menuVenda, menuConsulta, menuSair;

	public TelaMenu() {
		setTitle("Menu");

		menuCadastrar = new JButton("Realizar Cadastro");
		menuVenda = new JButton("Realizar Venda");
		menuConsulta = new JButton("Consultar");
		menuSair = new JButton("Sair");

		setSize(450, 75);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		add(menuCadastrar);
		add(menuVenda);
		add(menuConsulta);
		add(menuSair);
		setVisible(true);

	}

	public JButton getMenuCadastrar() {
		return menuCadastrar;
	}

	public JButton getMenuVenda() {
		return menuVenda;
	}

	public JButton getMenuConsulta() {
		return menuConsulta;
	}

	public JButton getMenuSair() {
		return menuSair;
	}

}
