package Classes;

import java.util.List;

import Interfaces.OperacoesComuns;

public class Confederacao implements OperacoesComuns{
	
	private String nome;
	private List<Equipe> equipes;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	@Override
	public String toString() {
		return "Confederacao [nome=" + nome + ", equipes=" + equipes + "]";
	}
	
	public boolean adicionarConfederacao(String nome, List<Equipe> equipes) {
		return false;
	}
	
	public boolean alterarConfederacao() {
		return false;
	}
	
	@Override
	public boolean remover(String nome, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String buscar(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listarDados() {
		System.out.println(this.toString());
		
	}

}
