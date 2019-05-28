package model;

import java.util.ArrayList;

import view.MensagemPane;

public class BaseCliente {
	public static ArrayList<Cliente> clientes = new ArrayList();

	public static boolean validador(Cliente cliente) {
		for (Cliente c : clientes)
			if (c.getCpf().equalsIgnoreCase(cliente.getCpf()))
				if (c.getNome().equalsIgnoreCase(cliente.getNome()))
					return true;
		return false;

	}
	public static boolean add(Cliente cliente){
		if(validador(cliente)){
			MensagemPane.mensagem("Usuário já cadastrado");
			return false;
		}
		MensagemPane.mensagem("Cadastrado com Sucesso");
		clientes.add(cliente);
		return true;
		
	}
}
