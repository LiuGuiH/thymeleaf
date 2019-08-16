package dao;

import pojo.Product;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ProductDao {

    private static final String NO_WEBSITE = null;

    public static Product loadProduct() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return new Product("Wooden wardrobe with glass doors", Integer.valueOf(850), sdf.parse("2013-02-18"), "");
        } catch (ParseException ex) {
            throw new RuntimeException("Invalid date");
        }
    }

    public static List<Product> loadAllProducts() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Product> products = new ArrayList<Product>();
        try {
            products.add(new Product("花生油", Integer.valueOf(125), sdf.parse("2018-02-18"),"CG"));
            products.add(new Product("苏打饼干", Integer.valueOf(15), sdf.parse("208-02-15"),"CG"));
            products.add(new Product("拿铁", Integer.valueOf(45), sdf.parse("2019-02-20"),"PT"));
            products.add(new Product("调和油", Integer.valueOf(20), sdf.parse("2019-02-21"),"CX"));
            products.add(new Product("大豆油", Integer.valueOf(49), sdf.parse("2019-02-15"),""));
            products.add(new Product("玉米汁", Integer.valueOf(80), sdf.parse("2019-02-17"),""));
        } catch (ParseException ex) {
            throw new RuntimeException("Invalid date");
        }
        return products;
    }



    public static Timestamp loadReleaseDate() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date = sdf.parse("2019-01-31 15:00");
            return new Timestamp(date.getTime());
        } catch (ParseException ex) {
            throw new RuntimeException("Invalid date");
        }
    }
}
