package com.hibernatePart1.hibernatePart1;


import com.hibernatePart1.hibernatePart1.ComponentMapping.Emplooyee;
import com.hibernatePart1.hibernatePart1.ComponentMapping.Salary;
import com.hibernatePart1.hibernatePart1.ComponentMapping.repositary;
import com.hibernatePart1.hibernatePart1.Employee.Employees;
import com.hibernatePart1.hibernatePart1.inheritance.entity.Check;
import com.hibernatePart1.hibernatePart1.inheritance.entity.CreditCard;
import com.hibernatePart1.hibernatePart1.inheritance.entity.Paymentrepo;
import com.hibernatePart1.hibernatePart1.repo.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class HibernatePart1ApplicationTests {
	@Autowired
	private EmployeeRepo employeeRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {
		Employees employee = new Employees();
		//employee.setId(1);
		employee.setFirstName("Tarun");
		employee.setLastName("Singh");
		employee.setSalary(500);
		employee.setAge(22);
		employeeRepo.save(employee);
		Employees employee2 = new Employees();
		//employee2.setId(1);
		employee2.setFirstName("Karan");
		employee2.setLastName("Khanna");
		employee2.setSalary(700);
		employee2.setAge(24);
		employeeRepo.save(employee2);

		Employees employee3 = new Employees();
		//employee.setId(1);
		employee3.setFirstName("Jai");
		employee3.setLastName("Sanger");
		employee3.setSalary(600);
		employee3.setAge(26);
		employeeRepo.save(employee3);
		Employees employee4 = new Employees();
		//employee2.setId(1);
		employee4.setFirstName("Mohit");
		employee4.setLastName("Sharma");
		employee4.setSalary(800);
		employee4.setAge(24);
		employeeRepo.save(employee4);
	}

	@Autowired
	Paymentrepo paymentrepo;

	@Test
	public void creatPayment() {
		CreditCard cc = new CreditCard();
		cc.setId(11);
		cc.setAmount(1000);
		cc.setCardnumber("12345");
		paymentrepo.save(cc);
	}

	@Test
	public void creatCheck() {
		Check ch = new Check();
		ch.setId(12);
		ch.setAmount(1000);
		ch.setChecknumber("4444");
		paymentrepo.save(ch);
	}

	@Test
	public void TestFindEmployeeByNQ() {
		System.out.println(employeeRepo.findAllEmployeeNQ());
	}

	@Transactional
	@Rollback(value = false)
	@Test
	public void Test_UpdateEmployeeByAvgSalary() {
//	   System.out.println(employeeRepo.findAllEmployeeNQ());
		System.out.println(employeeRepo.updateByAvgSalary(employeeRepo.findAverageOfSalary(), 2000));
//	   System.out.println(average);
	}

	@Transactional
	@Rollback(value = false)
	@Test
	public void Test_DeleteEmployeeByMinSalary() {
//	   System.out.println(employeeRepo.findAllEmployeeNQ());
		//System.out.println(employeeRepo.updateByAvgSalary(employeeRepo.findAverageOfSalary()));
		System.out.println(employeeRepo.updateByMinSalary(employeeRepo.findMinumumOfSalary()));
//	   System.out.println(average);
	}
	@Test
	public void Test_DisplayEmployeeByJPQL(){
		List<Object[]> object=employeeRepo.findAllEmployeeWithJPQL(employeeRepo.findAverageOfSalary());
		for(Object[] o:object){
			System.out.println(o[0]);
			System.out.println(o[1]);
		}

	}
	@Transactional
	//@Rollback(value = false)
	@Test
	public void deleteEmpFromSalary(){
		System.out.println(employeeRepo.deleteByEmployeeByAge(33));
	}
	@Autowired
	repositary r;
	@Test
	public void test_create(){
		Emplooyee emplooyee=new Emplooyee();
		emplooyee.setAge(22);
		emplooyee.setId(1);
		emplooyee.setFirstName("Tarundeep");
		emplooyee.setLastName("Singh");
		Salary salary=new Salary();
		salary.setBasicSalary(100);
		salary.setBonusSalary(100);
		salary.setTaxSalary(100);
		salary.setSpecialAllowanceSalary(100);
		emplooyee.setSalary(salary);
		r.save(emplooyee);

	}
	@Test
	public void TestfindAllByName(){
		System.out.println(employeeRepo.finaAllByname());
	}
//}
}
