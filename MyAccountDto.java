package ibmtal.trendyol.dto;

public class MyAccountDto {
	private String name;
	private String surname;
	private String email;
    private String age;
    private String gender;
	public MyAccountDto(String name, String surname, String email, String age, String gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getEmail() {
		return email;
	}
	public String getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public MyAccountDto() {
		super();
	}
}
