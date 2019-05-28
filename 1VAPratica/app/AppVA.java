package app;

import controller.ControlerMenu;
import view.TelaClientes;
import view.TelaLivros;
import view.TelaMenu;
import view.MenuTela;
import view.TelaVenda;

public class AppVA {
	public static void main(String[] args) {
		TelaVenda venda = new TelaVenda();
		TelaMenu menu = new TelaMenu();
		TelaClientes cliente = new TelaClientes();
		TelaLivros livro = new TelaLivros();
		ControlerMenu controlerMenu = new ControlerMenu(menu,venda,cliente,livro);
	}
}
