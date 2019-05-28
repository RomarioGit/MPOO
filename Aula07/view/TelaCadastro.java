package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame {
	JLabel loginJL,senhaJL;
	JTextField loginC,senhaC;
	JButton cadastrar,cancelarC;
	
	public TelaCadastro(){
		setLayout(new FlowLayout());
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		loginJL = new JLabel("Login: ");
		loginC = new JTextField(10);
		senhaJL = new JLabel("Senha: ");
		senhaC = new JTextField(10);
		cadastrar = new JButton("Cadastrar");
		cancelarC = new JButton("Cancelar");
		
		add(loginJL);
		add(loginC);
		add(senhaJL);
		add(senhaC);
		add(cadastrar);
		add(cancelarC);
		
		setVisible(false);
	}
	public JLabel getLoginJL() {
		return loginJL;
	}
	public JLabel getSenhaJL() {
		return senhaJL;
	}
	public JTextField getLoginC() {
		return loginC;
	}
	public JTextField getSenhaC() {
		return senhaC;
	}
	public JButton getCadastrar() {
		return cadastrar;
	}
	public JButton getCancelarC() {
		return cancelarC;
	}
	
	
	
}
