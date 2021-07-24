package Classes;

import java.util.List;

import Interfaces.OperacoesGerais;

public class Equipe implements OperacoesGerais{
	
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
	
	public int retornarQtdMedalahs() {
		return 0;
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
