package edu.zjut.tempest.entity;
// Generated 2017-3-9 20:00:46 by Hibernate Tools 5.2.0.CR1

/**
 * SetupProject generated by hbm2java
 */
public class SetupProject implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2742532563097050998L;
	private Integer id;
	private String officalNumber;
	private String category;
	private String subcategory;
	private String name;
	private String proLevel;
	private Integer status;
	private Integer stuLevel;
	private String member1;
	private String member2;
	private String member3;
	private String member4;
	private String member5;
	private String member6;
	private String member7;
	private String member8;
	private String member9;
	private String member10;
	private String teacher;

	public SetupProject() {
	}

	public SetupProject(String officalNumber, String category, String subcategory, String name, String proLevel,
			int status,int stuLevel, String teacher) {
		this.officalNumber = officalNumber;
		this.category = category;
		this.subcategory = subcategory;
		this.name = name;
		this.proLevel = proLevel;
		this.status = status;
		this.stuLevel = stuLevel;
		this.teacher = teacher;
	}

	public SetupProject(String officalNumber, String category, String subcategory, String name, String proLevel,
			int status, int stuLevel, String member1, String member2, String member3, String member4, String member5, String member6,
			String member7, String member8, String member9, String member10, String teacher) {
		this.officalNumber = officalNumber;
		this.category = category;
		this.subcategory = subcategory;
		this.name = name;
		this.proLevel = proLevel;
		this.status = status;
		this.stuLevel = stuLevel;
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
		this.member6 = member6;
		this.member7 = member7;
		this.member8 = member8;
		this.member9 = member9;
		this.member10 = member10;
		this.teacher = teacher;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOfficalNumber() {
		return this.officalNumber;
	}

	public void setOfficalNumber(String officalNumber) {
		this.officalNumber = officalNumber;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return this.subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProLevel() {
		return this.proLevel;
	}

	public void setProLevel(String proLevel) {
		this.proLevel = proLevel;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStuLevel() {
		return stuLevel;
	}

	public void setStuLevel(Integer stuLevel) {
		this.stuLevel = stuLevel;
	}

	public String getMember1() {
		return this.member1;
	}

	public void setMember1(String member1) {
		this.member1 = member1;
	}

	public String getMember2() {
		return this.member2;
	}

	public void setMember2(String member2) {
		this.member2 = member2;
	}

	public String getMember3() {
		return this.member3;
	}

	public void setMember3(String member3) {
		this.member3 = member3;
	}

	public String getMember4() {
		return this.member4;
	}

	public void setMember4(String member4) {
		this.member4 = member4;
	}

	public String getMember5() {
		return this.member5;
	}

	public void setMember5(String member5) {
		this.member5 = member5;
	}

	public String getMember6() {
		return this.member6;
	}

	public void setMember6(String member6) {
		this.member6 = member6;
	}

	public String getMember7() {
		return this.member7;
	}

	public void setMember7(String member7) {
		this.member7 = member7;
	}

	public String getMember8() {
		return this.member8;
	}

	public void setMember8(String member8) {
		this.member8 = member8;
	}

	public String getMember9() {
		return this.member9;
	}

	public void setMember9(String member9) {
		this.member9 = member9;
	}

	public String getMember10() {
		return this.member10;
	}

	public void setMember10(String member10) {
		this.member10 = member10;
	}

	public String getTeacher() {
		return this.teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}
