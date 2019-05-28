package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import view.Mensagem;


public class BaseDados {
	public static ArrayList<Usuario> users = new ArrayList<Usuario>();
	
	public static boolean addUsuario(Usuario usuario){
		if (isUsuario(usuario)){
			JOptionPane.showConfirmDialog(null,"Usuário já cadastrado");
			return false;
		}
		users.add(usuario);
		JOptionPane.showConfirmDialog(null, "Usuário Cadastrdo com sucesso!");
		return true;
			
	}
	
	public static boolean updateUsuario(Usuario usuario){
		for (Usuario user:users)
			if(user.getLogin().equalsIgnoreCase(usuario.getLogin())){
				Mensagem.exibirMensagem("Usuário encontrado...!");
				return true;
			}
		Mensagem.exibirMensagem("Usuário não encontrado...!");
		return false;
	}
	
	public static boolean isUsuario(Usuario usuario){
		for (Usuario user:users)
			if(user.getLogin().equalsIgnoreCase(usuario.getLogin()))
				if (user.getSenha().equalsIgnoreCase(usuario.getSenha()))
					return true;
		return false;

		}	
}	
