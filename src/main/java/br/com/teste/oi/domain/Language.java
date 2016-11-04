package br.com.teste.oi.domain;

public enum Language {

	JAVA("Java"),
	C("C"),
	ANDROID("Android"),
	SWIFT("Swift");
	
	private String nome;
	
	private Language(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
