package edu.zjut.tempest.entity;
// Generated 2017-3-9 20:00:46 by Hibernate Tools 5.2.0.CR1

/**
 * Competitiontype generated by hbm2java
 */
public class CompetitionType implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8685317083154084898L;
	private Integer id;
	private String name;
	private Integer category;

	public CompetitionType() {
	}

	public CompetitionType(String name, int category) {
		this.name = name;
		this.category = category;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCategory() {
		return this.category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

}
