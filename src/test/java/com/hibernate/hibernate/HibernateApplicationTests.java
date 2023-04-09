package com.hibernate.hibernate;

import com.hibernate.hibernate.Employee.employee;
import com.hibernate.hibernate.EmployeeRepo.EmployeeRepo;
import com.hibernate.hibernate.Product.product;
import com.hibernate.hibernate.repo.ProductRepo;
import net.bytebuddy.TypeCache;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.sql.SQLOutput;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class HibernateApplicationTests {
    @Autowired
	private EmployeeRepo employeeRepo;
	@Test
	void contextLoads() {
	}

	@Test
	public void testCreat(){
	employee emp =new employee();
	emp.setId(1);
	emp.setName("Tarun");
	emp.setLocation("good");
	emp.setAge(21);

	employeeRepo.save(emp);

	}
	@Test
	public void updatee(){
		employee employee=new employee();
		employee =employeeRepo.findById(1).get();
		employee.setAge(55);
		employeeRepo.save(employee);
	}
	@Test
	public void TestRead(){
		employee employee=employeeRepo.findById(1).get();
		assertNotNull(employee);

	}
	@Test
	public void deletee(){
		if(employeeRepo.existsById(1)){
			employeeRepo.deleteById(1);
		}
	}
	@Test
	public void TestCount(){
		System.out.println(employeeRepo.count());

	}

	@Test
	public void testFindByNaame(){
		List<employee> employees=employeeRepo.findByName("tarun");
		employees.forEach(p->System.out.println(p.getAge()));
	}
	@Test
	public void testFindByNaameBetween(){
		List<employee> employees=employeeRepo.findByAgeBetween(20,30);
		employees.forEach(p->System.out.println(p.getName()));
	}
	@Test
	public void testFintarunNaameLike(){
		List<employee> employees=employeeRepo.findByLocationLike("%UP%");
		employees.forEach(p->System.out.println(p.getName()));
	}
//	@Test
//	public void testFindByNaameAndDes(){
//		List<product> product =productRepo.findByNameAndDesc("tarun","Khanna");
//		product.forEach(p->System.out.println(p.getPrice()));
//	}
//	@Test
//	public void testFindByGreaterprice(){
//		List<product> product =productRepo.findBypriceGreaterThan(100);
//		product.forEach(p->System.out.println(p.getPrice()));
//	}
	@Test
	public void TestSortingByAge(){
		employeeRepo.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC,"age"))).forEach(p-> System.out.println(p.getName()));
		//employeeRepo.findAll(Sort.by(Sort.Direction.DESC,"age")).forEach(p-> System.out.println(p.getName()));
	}

	@Test
	public void TestPaginging(){
//		Pageable pageable= PageRequest.of(1,2);
//	    Page<employee> result = employeeRepo.findAll(pageable);
//		result.forEach(p-> System.out.println(p.getName()));

		Pageable pageable1=PageRequest.of(1,2, Sort.Direction.DESC,"age");
		employeeRepo.findAll(pageable1).forEach(p-> System.out.println(p.getName()));
	}

}










