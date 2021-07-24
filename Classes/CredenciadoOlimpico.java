package Classes;

import java.util.List;

public abstract class CredenciadoOlimpico {
	
	private String nome;
	private String id;
	
	public abstract boolean verificarCredenciais(String id);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void adicionar(String nome, String nacionalidade, List<Medalha> medalhas, Equipe equipe) {
		// TODO Auto-generated method stub
		
	}
}
