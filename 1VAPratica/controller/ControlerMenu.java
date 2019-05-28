package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseCliente;
import model.BaseLivros;
import model.Cliente;
import model.Livro;
import view.TelaClientes;
import view.TelaLivros;
import view.TelaMenu;
import view.TelaVenda;

public class ControlerMenu implements ActionListener {
	private TelaMenu telaMenu;
	private TelaVenda telaVenda;
	private TelaClientes telaCliente;
	private TelaLivros telaLivro;
	

	public ControlerMenu(TelaMenu telaMenu, TelaVenda telaVenda,TelaClientes telaCliente,
			TelaLivros telaLivro) {
		this.telaMenu = telaMenu;
		telaMenu.getMenuCadastrar().addActionListener(this);
		telaMenu.getMenuVenda().addActionListener(this);
		telaMenu.getMenuConsulta().addActionListener(this);
		telaMenu.getMenuSair().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}

		});

		this.telaVenda = telaVenda;
		telaVenda.getConfirmaButton().addActionListener(this);

		this.telaCliente = telaCliente;
		telaCliente.getRadioCliente().addActionListener(this);
		telaCliente.getRadioLivro().addActionListener(this);
		telaCliente.getAddButton().addActionListener(this);
		
		this.telaLivro = telaLivro;
		telaLivro.getRadioCliente().addActionListener(this);
		telaLivro.getRadioLivro().addActionListener(this);
		telaLivro.getAddButton().addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telaMenu.getMenuCadastrar()) {
			telaMenu.setVisible(false);
			telaLivro.setVisible(true);
			
		}
		if (e.getSource() == telaMenu.getMenuVenda()) {
			telaMenu.setVisible(false);
			telaVenda.setVisible(true);

		}
		if (e.getSource() == telaMenu.getMenuConsulta()) {
			telaMenu.setVisible(false);
		}
		if (e.getSource() == telaVenda.getConfirmaButton()) {
			Livro livro = new Livro(telaLivro.getAutorField().getText(),
					telaLivro.getTituloField().getText(),telaLivro.getEditoraField().getText(),
					telaLivro.getIsbnField().getText());
			BaseLivros.remove(livro);
			JOptionPane.showMessageDialog(null,"Vendido com Sucesso!");
			telaVenda.setVisible(false);
			telaMenu.setVisible(true);
		}
		
		
		if (e.getSource() == telaCliente.getRadioCliente()){
			telaCliente.setVisible(true);
			telaLivro.setVisible(false);
			telaCliente.getRadioCliente().setVisible(true);
		}
		if (e.getSource() == telaCliente.getRadioLivro()){
			telaLivro.setVisible(true);
			telaCliente.setVisible(false);
		}
		if (e.getSource() == telaCliente.getAddButton()){
			Cliente cliente = new Cliente(telaCliente.getNomeField().getText(),
					telaCliente.getCpfField().getText());
			BaseCliente.add(cliente);
			telaMenu.setVisible(true);
			telaCliente.setVisible(false);
			
		}
		
		
		if (e.getSource() == telaLivro.getAddButton()){
			Livro livro = new Livro(telaLivro.getAutorField().getText(),
					telaLivro.getTituloField().getText(),telaLivro.getEditoraField().getText(),
					telaLivro.getIsbnField().getText());
			telaMenu.setVisible(true);
			
		}
		if(e.getSource() == telaLivro.getRadioCliente()){
			telaCliente.setVisible(true);
			telaLivro.setVisible(false);
			
		}
		if (e.getSource() == telaLivro.getRadioLivro()){
			telaLivro.setVisible(true);
			telaCliente.setVisible(false);
		}

	}

}
