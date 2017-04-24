package edu.zjut.tempest.entity;
// Generated 2017-3-9 20:00:46 by Hibernate Tools 5.2.0.CR1

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4136148087499516748L;
	private Integer id;
	private String name;
	private Integer sex;
	private Integer experience;
	private Integer level;
	private String academy;
	private String major;
	private String grade;
	private String className;
	private String nation;
	private String polity;
	private String telephone;
	private String cornet;
	private String qq;
	private String email;
	private String dormitory;
	private String description;

	public Student() {
	}

	public Student(String name, int sex, int experience, int level, String academy, String major, String grade,
			String className, String nation, String polity, String telephone, String dormitory) {
		this.name = name;
		this.sex = sex;
		this.experience = experience;
		this.level = level;
		this.academy = academy;
		this.major = major;
		this.grade = grade;
		this.className = className;
		this.nation = nation;
		this.polity = polity;
		this.telephone = telephone;
		this.dormitory = dormitory;
	}

	public Student(String name, int sex, int experience, int level, String academy, String major, String grade,
			String className, String nation, String polity, String telephone, String cornet, String qq, String email,
			String dormitory, String description) {
		this.name = name;
		this.sex = sex;
		this.experience = experience;
		this.level = level;
		this.academy = academy;
		this.major = major;
		this.grade = grade;
		this.className = className;
		this.nation = nation;
		this.polity = polity;
		this.telephone = telephone;
		this.cornet = cornet;
		this.qq = qq;
		this.email = email;
		this.dormitory = dormitory;
		this.description = description;
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

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getExperience() {
		return this.experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getAcademy() {
		return this.academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getPolity() {
		return this.polity;
	}

	public void setPolity(String polity) {
		this.polity = polity;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCornet() {
		return this.cornet;
	}

	public void setCornet(String cornet) {
		this.cornet = cornet;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDormitory() {
		return this.dormitory;
	}

	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
