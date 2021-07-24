package Classes;

import java.util.List;

public class ComiteOlimpico{
	
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

}
