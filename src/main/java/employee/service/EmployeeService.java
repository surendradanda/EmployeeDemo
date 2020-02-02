/**
 * 
 */
package employee.service;
import java.util.List;

/**
 * @author surendra
 *
 */
import employee.model.Employee;

public interface EmployeeService {
	boolean saveEmployee(Employee emp);
	Employee findById(String empId);
	List<Employee> findByName(String empName);
	List<Employee> findAll();
	boolean deleteById(String empId);

}
