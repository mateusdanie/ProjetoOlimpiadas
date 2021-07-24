package Classes;

import Interfaces.OperacoesGerais;

public class Tecnico extends CredenciadoOlimpico implements OperacoesGerais{
	
	private String nome;
	private String cargo;
	private Equipe equipe;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	@Override
	public boolean verificarCredenciais(String id) {
		if(id.equals(this.getId())){
			return true;
		}else{
			return false;
		}
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
