package br.com.teste.oi.domain;

public class Star {

	private Long id;
	private Integer min;
	private Integer max;
	
	public Star() {
	}
	
	public Star(Long id, Integer min, Integer max) {
		super();
		this.id = id;
		this.min = min;
		this.max = max;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
}
