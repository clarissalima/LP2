
public class Pessoa {
	private String nome;
	private int ano_nascimento;

	public String getNome() {
		return this.nome;
	}
	
	public Pessoa(String nome, int ano_nascimento){
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return this.ano_nascimento;
	}

	public void setAnoNascimennto(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nAno Nascimento: " + this.ano_nascimento;
	}
}
