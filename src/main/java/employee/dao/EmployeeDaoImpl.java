package employee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import employee.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean saveEmployee(Employee emp) {
		System.out.println("Dao SaveEmployee");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee findById(String empId) {
		System.out.println("Dao FindById  : "+empId);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByName(String empName) {
		System.out.println("Dao FinByName"+empName);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		System.out.println("Dao FinAll");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(String empId) {
		System.out.println("Dao DeleteBYId  :"+empId);
		// TODO Auto-generated method stub
		return false;
	}

}
