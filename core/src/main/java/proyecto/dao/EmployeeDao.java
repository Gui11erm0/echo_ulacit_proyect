package proyecto.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;
import proyecto.model.Employee;

public interface EmployeeDao extends GenericDao<Employee, Long> {
	
	public List<Employee> getAll();

}
//First Change
//Second Change