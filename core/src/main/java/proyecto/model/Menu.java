
package proyecto.model;

public class Menu {
	private Long id;
	private String lunchName;
	private int calories;
	private String lunchType;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLunchName() {
		return lunchName;
	}
	public void setLunchName(String lunchName) {
		this.lunchName = lunchName;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public String getLunchType() {
		return lunchType;
	}
	public void setLunchType(String lunchType) {
		this.lunchType = lunchType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lunchName == null) ? 0 : lunchName.hashCode());
		result = prime * result + ((lunchType == null) ? 0 : lunchType.hashCode());
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
		Menu other = (Menu) obj;
		if (calories != other.calories)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lunchName == null) {
			if (other.lunchName != null)
				return false;
		} else if (!lunchName.equals(other.lunchName))
			return false;
		if (lunchType == null) {
			if (other.lunchType != null)
				return false;
		} else if (!lunchType.equals(other.lunchType))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Menu [id=" + id + ", lunchName=" + lunchName + ", calories=" + calories + ", lunchType=" + lunchType
				+ "]";
	}
	
	

}
