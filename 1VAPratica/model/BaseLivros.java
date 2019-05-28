package model;

import java.util.ArrayList;

import view.MensagemPane;

public class BaseLivros {
	static ArrayList<Livro> livros = new ArrayList();
	
	public static boolean validador(Livro livro){
		for(Livro l:livros)
			if(l.getAutor().equalsIgnoreCase(livro.getAutor()))
				if(l.getTitulo().equalsIgnoreCase(livro.getTitulo()))
					if(l.getEditora().equalsIgnoreCase(livro.getEditora()))
						return true;
		return false;
		
	}
	
	public static boolean add(Livro livro){
		if (validador(livro)){
			MensagemPane.mensagem("Livro já cadastrado!");
			return true;
		}
		MensagemPane.mensagem("Cadastrado com Sucesso");
		livros.add(livro);
		return false;
	}
	
	public static boolean remove(Livro livro){
		if (validador(livro)){
			livros.remove(livro);
			MensagemPane.mensagem(livro + " removido com sucesso!");
			return true;
		}
		return false;
	}
}
