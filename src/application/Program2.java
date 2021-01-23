package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		//System.out.println("==== TEST 1: INSERTING DEPARTMENT ===");
		//Department dep = new Department(null, "Music");
		//departmentDao.insert(dep);
		//System.out.println("Department inserted!");
		//System.out.println();
		
		
		System.out.println("==== TEST 2: UPDATE DEPARTMENT ===");
		System.out.print("Insert the department's id wich you want to update: ");
		int id = sc.nextInt();
		System.out.print("Type the new department's name: ");
		String name = sc.next();
		Department dep = new Department(id, name);
		departmentDao.update(dep);
		System.out.println("Department updated!");
		System.out.println();
		
		System.out.println("==== TEST 3: DELETE DEPARTMENT ===");
		int idToDelete = 7;
		departmentDao.deleteById(idToDelete);
		System.out.println();
		
		System.out.println("==== TEST 4: findById ===");
		System.out.println(departmentDao.findById(id));
		System.out.println();
		
		System.out.println("==== TEST 5: findAll ===");
		System.out.println(departmentDao.findAll());
		
		
		
		
		sc.close();
		

	}

}
