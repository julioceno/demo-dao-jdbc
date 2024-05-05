import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 'SellerDao' sellerDao = DaoFactory.createSellerDao();

         Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n===  Test2: Seller findByDeparment ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDeparment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n===  Test3: Seller findAll ====");
        list = sellerDao.findall();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n===  Test4: Seller insert ====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n===  Test5: Seller insert ====");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n===  Test6: seller delete ====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");
        */

        DepartmentDao departmentDao = DaoFactory.createDeparmentDao();

        System.out.println("Test findById");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("Test findAll");
        List<Department> list = departmentDao.findall();

        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("Test insert");
        Department newDepartment = new Department(null, "Test");
        departmentDao.insert(newDepartment);
        System.out.println(newDepartment);


        System.out.println("Test update");
        Department updateDepartment = new Department(5, "Test2");
        departmentDao.update(updateDepartment);

        System.out.println("Test delete");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}