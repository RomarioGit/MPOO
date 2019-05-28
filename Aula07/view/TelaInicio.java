package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaInicio extends JFrame {

	JButton acessarButton, cancelarButton, cadastrarButton, buscarButton;

	public TelaInicio() {

		acessarButton = new JButton("Acessar");
		cancelarButton = new JButton("Cancelar");
		cadastrarButton = new JButton("Cadastrar");
		buscarButton = new JButton("Buscar");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		add(acessarButton);
		add(cancelarButton);
		add(cadastrarButton);
		add(buscarButton);
		setVisible(true);
	}

	public JButton getAcessarButton() {
		return acessarButton;
	}

	public JButton getCancelarButton() {
		return cancelarButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getBuscarButton() {
		return buscarButton;
	}

}
