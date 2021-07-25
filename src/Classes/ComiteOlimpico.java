package Classes;

import java.util.List;

import Interfaces.OperacoesComuns;

public class ComiteOlimpico implements OperacoesComuns {

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
		return "ComiteOlimpico [nome=" + nome + ", equipes=" + equipes + "]";
	}

	public boolean adicionarComite(String nome, List<Equipe> equipes) {
		return false;
	}

	public boolean alterarComite() {
		return false;
	}

	@Override
	public boolean remover(String nome) {
		if(nome.equals(this.getNome())) {
			
			this.setNome(null);
			this.equipes.clear();
			System.out.println("Dados Excluídos Com Sucesso!!!");
			return true;
		}else {
			System.out.println("Comite Inexistente!!!");
			return false;
		}
	}

	@Override
	public String buscar(String nome) {
		if(nome.equals(this.getNome())) {
			this.listarDados();
			return nome + "encontrado, dados acima";
		}else {
			return "Os dados de " + nome + " não foram encontrados!!!";
		}
		
	}

	@Override
	public void listarDados() {
		System.out.println(this.toString());

	}

}
