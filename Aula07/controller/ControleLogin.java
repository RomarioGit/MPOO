package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.Usuario;
import view.Mensagem;
import view.TelaBusca;
import view.TelaCadastro;
import view.TelaInicio;
import view.TelaLogin;

// com classe interna anonima e tratamento na própria classe <- IMPORTANTE
public class ControleLogin implements ActionListener {
	private TelaLogin telaLogin;
	private TelaInicio telainicio;
	private TelaCadastro telaCadastro;
	private TelaBusca telaBusca;

	public ControleLogin(TelaLogin telaLogin, TelaInicio telainicio, TelaCadastro telaCadastro,TelaBusca telaBusca) {
		this.telainicio = telainicio;
		this.telaLogin = telaLogin;
		this.telaCadastro = telaCadastro;
		this.telaBusca = telaBusca;
		controll();

	}

	public void controll() {
		telainicio.getAcessarButton().addActionListener(this);
		telainicio.getCadastrarButton().addActionListener(this);
		telainicio.getCancelarButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}

		});
		telainicio.getBuscarButton().addActionListener(this);
		
		telaLogin.getEntrarButton().addActionListener(this);
		telaLogin.getSairButton().addActionListener(this);

		telaCadastro.getCadastrar().addActionListener(this);
		telaCadastro.getCancelarC().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == telainicio.getAcessarButton()) {
			telaLogin.setVisible(true);
			telainicio.setVisible(false);
			telaCadastro.setVisible(false);

		} else if (e.getSource() == telainicio.getCancelarButton()) {
			System.exit(0);
		}
		if (e.getSource() == telainicio.getCadastrarButton()) {
			telaCadastro.setVisible(true);
			telaLogin.setVisible(false);
		}
		
		if (e.getSource() == telainicio.getBuscarButton()){
			telaBusca.setVisible(true);
			telainicio.setVisible(false);
		}

		else if (e.getSource() == telaLogin.getEntrarButton()) {
			telaLogin.setVisible(true);

		} else if (e.getSource() == telaLogin.getSairButton()) {
			telaLogin.setVisible(false);
			telainicio.setVisible(true);

		}

		else if (e.getSource() == telaCadastro.getCadastrar()) {
			Usuario usuario = new Usuario(telaCadastro.getLoginC().getText(), telaCadastro.getSenhaC().getText());
			BaseDados.addUsuario(usuario);
			telaCadastro.setVisible(false);
			telainicio.setVisible(true);

		} else if (e.getSource() == telaCadastro.getCancelarC()) {
			telaCadastro.setVisible(false);
			telainicio.setVisible(true);
		}
		
		if (e.getSource() == telaBusca.getBusButton()){
			Usuario usuario = new Usuario(telaCadastro.getLoginC().getText(), telaCadastro.getSenhaC().getText());
			BaseDados.updateUsuario(usuario);
		}
	}

}
