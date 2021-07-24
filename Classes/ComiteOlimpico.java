package Classes;

import java.util.List;

import Interfaces.OperacoesComuns;

public class ComiteOlimpico implements OperacoesComuns{
	
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
	public String toString() {
		return "ComiteOlimpico [nome=" + nome + ", confederacao=" + confederacao + "]";
	}
	
	public boolean adicionarComite(String nome, List<Confederacao> confederacao) {
		return false;
	}
	
	public boolean alterarComite() {
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
