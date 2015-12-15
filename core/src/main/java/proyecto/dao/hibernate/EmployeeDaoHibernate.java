package proyecto.dao.hibernate;

import java.util.List;
import org.appfuse.dao.GenericDao;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import proyecto.dao.EmployeeDao;
import proyecto.model.Employee;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoHibernate extends GenericDaoHibernate<Employee, Long > implements EmployeeDao {

	public EmployeeDaoHibernate()
	{
		super(Employee.class);
	}
}