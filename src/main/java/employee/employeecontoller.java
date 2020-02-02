package employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import employee.appconfig.*;
import employee.dao.EmployeeDao;
import employee.service.EmployeeService;
import employee.service.EmployeeServiceReadOnly;
import employee.model.Employee;


public class employeecontoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee Emp = new Employee();
		Emp.setEmpId("01");
		Emp.setEmpName("XYZ");		

		EmployeeService emps = ac.getBean(EmployeeService.class);
		emps.saveEmployee(Emp);		
		
		EmployeeServiceReadOnly empro = ac.getBean(EmployeeServiceReadOnly.class);
		empro.findById("01");
		
		

	}

}
