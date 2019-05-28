package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import view.Mensagem;


public class BaseDados {
	public static ArrayList<Usuario> users = new ArrayList<Usuario>();
	
	public static boolean addUsuario(Usuario usuario){
		if (isUsuario(usuario)){
			JOptionPane.showConfirmDialog(null,"Usu�rio j� cadastrado");
			return false;
		}
		users.add(usuario);
		JOptionPane.showConfirmDialog(null, "Usu�rio Cadastrdo com sucesso!");
		return true;
			
	}
	
	public static boolean updateUsuario(Usuario usuario){
		for (Usuario user:users)
			if(user.getLogin().equalsIgnoreCase(usuario.getLogin())){
				Mensagem.exibirMensagem("Usu�rio encontrado...!");
				return true;
			}
		Mensagem.exibirMensagem("Usu�rio n�o encontrado...!");
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
