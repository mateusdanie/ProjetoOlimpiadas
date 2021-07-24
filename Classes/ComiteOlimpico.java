package Classes;

import java.util.List;

import Interfaces.OperacoesGerais;

public class ComiteOlimpico implements OperacoesGerais{
	
	private String nome;
	private List<Confederacao> confederacao;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Confederacao> getConfederacao() {
		return confederacao;
	}

	public void setConfederacao(List<Confederacao> confederacao) {
		this.confederacao = confederacao;
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
