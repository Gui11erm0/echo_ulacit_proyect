package proyecto.dto;

import proyecto.model.Account;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")

public class EmployeeDTO {
	
	private Long id;
	private String name;
	private String lastName;
	private int phone;
	private Account account;
	
	
	
	public EmployeeDTO() {
		super();

	}



	public EmployeeDTO(Long id, String name, String lastName, int phone, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.account = account;
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



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", lastName=" + lastName + ", phone=" + phone + ", account="
				+ account + "]";
	}
	
	
	
	

}
