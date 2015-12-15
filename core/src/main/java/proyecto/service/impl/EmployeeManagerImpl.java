package proyecto.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import proyecto.dao.EmployeeDao;
import proyecto.dto.EmployeeDTO;
import proyecto.mapper.EmployeeMapper;
import proyecto.model.Employee;
import proyect.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("employeeManager")
@WebService(serviceName = "EmployeeService", endpointInterface = "proyect.service.EmployeeManager")
public class EmployeeManagerImpl extends GenericManagerImpl<Employee, Long>implements EmployeeManager {
	EmployeeDao employeeDao;

	public EmployeeManagerImpl() {
	}

	@Autowired
	public EmployeeManagerImpl(EmployeeDao employeeDao) {
		super(employeeDao);
		this.employeeDao = employeeDao;
	}



	public List<EmployeeDTO> getEmployees() {
		List<EmployeeDTO> employeeDTOs = null;
		List<Employee> employeeList = employeeDao.getAll();

		employeeDTOs = EmployeeMapper.INSTANCE.employeeToEmployeesDTOs(employeeList);

		return employeeDTOs;
	}
}