package Classes;

import Interfaces.OperacoesComuns;

public class Tecnico extends CredenciadoOlimpico implements OperacoesComuns{
	
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
	public String toString() {
		return "Tecnico [nome=" + nome + ", cargo=" + cargo + ", equipe=" + equipe + "]";
	}

	public boolean adicionarTecnico() {
		return false;
	}
	
	public boolean alterarTecnico() {
		return false;
	}
	
	@Override
	public boolean remover(String nome) {
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
