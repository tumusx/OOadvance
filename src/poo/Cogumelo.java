package poo;

public class Cogumelo {
	private String nome;
	int numberCode = 2;
	int numberNotaFiscal = 2;
	int resultado;

	public Cogumelo(String nome, int numberCode, int numberNotaFiscal) {
		this.nome = nome;
		this.numberCode = numberCode;
		this.numberNotaFiscal = numberNotaFiscal;
		this.resultado = numberNotaFiscal * numberCode;
	}

@Override 
public int hashCode() {
	return numberCode = 37 * numberCode + numberNotaFiscal;
	
}
	int getNumberCode() {
		return numberCode;
	}
	
	void setNumberCode(int numberCode) {
		this.numberCode =numberCode;
}

	int getNome() {
		return numberNotaFiscal;
	}
	
	void setNome(String nome) {
		this.nome = nome;
}

	int getNumberNotaFiscal() {
		return numberNotaFiscal;
	}
	
	void setNumberNotaFiscal(int numberNotaFiscal) {
		this.numberNotaFiscal = numberNotaFiscal;
}
	
	
	@Override //todo usar equals é melhor do que usar ==, pois 
	// == aplica para endereço da memoria, ja o equals é indicado a objetos e deve ser 
	// a unica forma para isso. nao se aplica a tipos primitivos de dados
	
	public boolean equals(Object obj) {
		if (obj instanceof Cogumelo) {
			Cogumelo cogumeloType = (Cogumelo) obj;
			return this.nome.equals(cogumeloType.getNome());
		}
		return false;
	}
	@Override public String toString() {
		return "result" + this.resultado;
	}
	
	public static void main(String[] args) {
		Cogumelo obj = new Cogumelo("jogo", 19, 20);
		System.out.println(obj.resultado);
	
	}
}
