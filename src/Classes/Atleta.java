package Classes;

import java.util.List;

import Interfaces.OperacoesComuns;

public class Atleta extends CredenciadoOlimpico implements OperacoesComuns{

	private String nome;
	private String nacionalidade;
	private List<Medalha> medalhas;
	private Equipe equipe;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public List<Medalha> getMedalhas() {
		return medalhas;
	}

	public void setMedalhas(List<Medalha> medalhas) {
		this.medalhas = medalhas;
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
		return "Atleta [nome=" + nome + ", nacionalidade=" + nacionalidade + ", medalhas=" + medalhas + ", equipe="
				+ equipe + "]";
	}

	public boolean adicionarAtleta(String nome, String id, String nacionalidade,  List<Medalha> medalhas, Equipe equipe) {
		
		return false;
	}
	
	public boolean alterarAtleta() {
		return false;
	}
	
	@Override
	public boolean remover(String nome) {
		if(nome.equals(this.getNome())) {
			
			this.setNome(null);
			this.setId(null);
			this.medalhas.clear();
			this.equipe.remover(nome);
			System.out.println("Dados Excluídos Com Sucesso!!!");
			return true;
		}else {
			System.out.println("Atleta Inserido Não Foi Encontrados!!!");
			return false;
		}	
	}

	@Override
	public String buscar(String nome) {
		if(nome.equals(this.getNome())){
			this.listarDados();
			return nome + "encontrado, dados acima";
		}else {
			return "Os dados de " + nome + " não foram encontrado!!!";
		}
	}

	@Override
	public void listarDados() {
		System.out.println(this.toString());
	}

	
}
