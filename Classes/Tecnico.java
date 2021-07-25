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
		if(nome.equals(this.getNome())) {
			this.setNome(null);
			this.setCargo(null);
			this.setEquipe(null);
			System.out.println("Dados Exclu�dos Com Sucesso!!!");
			return true;
		}else {
			System.out.println("T�cnico N�o Foi Encontrado!!!");
			return false;
		}
	}

	@Override
	public String buscar(String nome) {
		if(nome.equals(this.getNome())) {
			this.listarDados();
			return nome + "encontrado, dados acima";
		}else {
			return "Os dados de " + nome + " n�o foram encontrado!!!";
		}
	}
	
	@Override
	public void listarDados() {
		System.out.println(this.toString());
	}
	
}
