package br.com.teste.oi.domain;

import java.io.Serializable;

public class Repository implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6574865503352267064L;
	
	private Long id;
	private String name;
	private String fullName;
	private String description;
	private String url;
	private Integer openIssues;
	private Integer stars;
	private Integer forks;
	private Owner owner;
	
	
	public Repository() {
	}
	
	public Repository(Long id, String name, String fullName, String description, String url, Integer openIssues,
			Integer stars, Integer forks, Owner owner) {
		super();
		this.id = id;
		this.name = name;
		this.fullName = fullName;
		this.description = description;
		this.url = url;
		this.openIssues = openIssues;
		this.stars = stars;
		this.forks = forks;
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getOpenIssues() {
		return openIssues;
	}

	public void setOpenIssues(Integer openIssues) {
		this.openIssues = openIssues;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public Integer getForks() {
		return forks;
	}

	public void setForks(Integer forks) {
		this.forks = forks;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
}
