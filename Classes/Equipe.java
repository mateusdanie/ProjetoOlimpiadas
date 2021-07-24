package Classes;

import java.util.List;

import Interfaces.OperacoesComuns;

public class Equipe implements OperacoesComuns{
	
	private String nome;
	private String modalidade;
	private List<Medalha> medalhas;
	private List<Atleta> atletas;
	private List<Tecnico> comissaoTecnica;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public List<Medalha> getMedalhas() {
		return medalhas;
	}

	public void setMedalhas(List<Medalha> medalhas) {
		this.medalhas = medalhas;
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}

	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}

	public List<Tecnico> getComissaoTecnica() {
		return comissaoTecnica;
	}

	public void setComissaoTecnica(List<Tecnico> comissaoTecnica) {
		this.comissaoTecnica = comissaoTecnica;
	}
	
	public int retornarQtdMedalhas(String op) {
		// indice 0 -  Bronze, 1 - Prata, 2 - Ouro
		if(op.equals("Bronze") || op.equals("bronze")) {
			return medalhas.get(0).getQuantidade();
		}else if(op.equals("Prata") || op.equals("prata")) {
			return medalhas.get(1).getQuantidade();
		}else if(op.equals("Ouro") || op.equals("ouro")) {
			return medalhas.get(2).getQuantidade();
		}else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "Equipe [nome=" + nome + ", modalidade=" + modalidade + ", medalhas=" + medalhas + ", atletas=" + atletas
				+ ", comissaoTecnica=" + comissaoTecnica + "]";
	}

	public boolean adicionarEquipe(String nome, String modalidade, List<Medalha> medalhas, List<Atleta> atletas, List<Tecnico> comissaoTecnica) {
		return false;
	}
	
	public boolean alterarEquipe() {
		return false;
	}
	
	@Override
	public boolean remover(String nome) {
		if(nome.equals(this.getNome())) {
			medalhas.clear();
			atletas.clear();
			comissaoTecnica.clear();
			this.setModalidade(null);
			this.setNome(null);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String buscar(String nome) {
		if(nome.equals(this.getNome())) {
			listarDados();
			return nome + " foi encontrado!!!";
		}else {
			return "Não foi encontrado!!!";
		}
		
	}

	@Override
	public void listarDados() {
		System.out.println(this.toString());
	}
}
