import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

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
    }
}