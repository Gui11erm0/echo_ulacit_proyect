package proyect.service;

import org.appfuse.service.GenericManager;
import proyecto.dto.EmployeeDTO;
import proyecto.model.Employee;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

@WebService
@Path("/employee")
public interface EmployeeManager extends GenericManager<Employee, Long> {


	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	//este lo llama con DTO
	List<EmployeeDTO> getEmployees();
}