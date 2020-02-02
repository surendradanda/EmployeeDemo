package employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employee.model.Employee;
import employee.dao.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empdao;
	

	@Override
	public boolean saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empdao.saveEmployee(emp);
	}

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
		return empdao.findAll();
	}

	@Override
	public boolean deleteById(String empId) {
		// TODO Auto-generated method stub
		return false;
	}

}
