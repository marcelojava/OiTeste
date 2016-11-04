package br.com.teste.oi.domain;

public class Setting {

	private Long id;
	private Language language;
	private Star star;
	private Integer forks;

	public Setting() {
	}

	public Setting(Long id, Language language, Star star, Integer forks) {
		super();
		this.id = id;
		this.language = language;
		this.star = star;
		this.forks = forks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Star getStar() {
		return star;
	}

	public void setStar(Star star) {
		this.star = star;
	}

	public Integer getForks() {
		return forks;
	}

	public void setForks(Integer forks) {
		this.forks = forks;
	}
}
