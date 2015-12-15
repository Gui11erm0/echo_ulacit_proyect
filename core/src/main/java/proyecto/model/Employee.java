package proyecto.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.appfuse.model.BaseObject;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement
@Entity
@Table(name = "employee")
public class Employee {
	private Long id;
	private String name;
	private String lastName;
	private int	phone;
	private Account account;
	
	// START SNIPPET: id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	// END SNIPET: id
	
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "name", length = 50)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "lastName", length = 50)
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "phone", length = 50)
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	@OneToOne
	@JoinColumn(name = "id", nullable = false)
	@JsonIgnore
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phone;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone != other.phone)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", phone=" + phone + "]";
	}
	
	
	
	

}
