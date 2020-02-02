package employee.service;
import java.util.List;
import employee.model.Employee;

public interface EmployeeServiceReadOnly {
	Employee findById(String empId);
	List<Employee> findByName(String empName);
	List<Employee> findAll();

}
