package employee.service;

import java.util.List;


import employee.model.Employee;
import employee.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class EmployeeServiceReadOnlyImpl implements EmployeeServiceReadOnly {
	
	@Autowired
	private EmployeeDao empdao;

	@Override
	public Employee findById(String empId) {
		// TODO Auto-generated method stub
		return empdao.findById(empId);
	}

	@Override
	public List<Employee> findByName(String empName) {
		// TODO Auto-generated method stub
		return empdao.findByName(empName);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		System.out.println("Find All Employees");
		return empdao.findAll();
	}

}
