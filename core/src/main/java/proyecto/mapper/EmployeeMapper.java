package proyecto.mapper;

import java.util.List;

import proyecto.dto.EmployeeDTO;
import proyecto.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
	List<EmployeeDTO> employeeToEmployeesDTOs(List<Employee> candidates);
	
	@Mappings({ 
		@Mapping(source = "id", target = "id"),
		@Mapping(source = "account", target = "account"),		
		@Mapping(source = "name", target = "name"), 
		@Mapping(source = "lastName", target = "lastName"),
		@Mapping(source = "phone", target = "phone")
		
		})
	
	EmployeeDTO employeeToEmployeesDTO(Employee employee);
}