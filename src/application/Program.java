package application;



import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
	
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		
		System.out.println("=== TEST 2: findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> sellerList = sellerDao.findByDepartment(department);
		for (Seller obj : sellerList) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("=== TEST 3: findAll ===");
		List<Seller> allSellers = sellerDao.findAll();
		for (Seller obj : allSellers) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("=== TEST 3: Seller Insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@email.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new seller! ID = " + newSeller.getId());
	
		
	
	}

}
