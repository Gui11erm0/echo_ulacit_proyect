package proyecto.dto;

import proyecto.model.Employee;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="account")
public class AccountDTO {
	
	private Long id;
	private String userId;
	private String password;
	
	public AccountDTO() {
		super();

	}

	public AccountDTO(Long id, String userId, String password) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AccountDTO [id=" + id + ", userId=" + userId + ", password=" + password + "]";
	}
	
	
	
	

}
