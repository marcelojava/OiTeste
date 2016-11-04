package br.com.teste.oi.domain;

import java.io.Serializable;

public class Owner implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2597556566509642284L;
	
	private Long id;
	private String name;
	private String login;
	private String profile;
	private String repository;
	private String avatar;
	
	public Owner() {
	}

	public Owner(Long id, String name, String login, String profile, String repository, String avatar) {
		super();
		this.id = id;
		this.name = name;
		this.login = login;
		this.profile = profile;
		this.repository = repository;
		this.avatar = avatar;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getRepository() {
		return repository;
	}

	public void setRepository(String repository) {
		this.repository = repository;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
}
