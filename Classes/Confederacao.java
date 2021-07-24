package Classes;

import java.util.List;

import Interfaces.OperacoesGerais;

public class Confederacao implements OperacoesGerais{
	
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
	public void adicionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remover() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean buscar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void listarDados() {
		// TODO Auto-generated method stub
		
	}

}
