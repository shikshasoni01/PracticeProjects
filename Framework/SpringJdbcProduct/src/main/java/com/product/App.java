package com.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.product.config.AppConfig;
import com.product.dao.ProductDao;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        
        ProductDao product=context.getBean(ProductDao.class);
        
//        product.createTable();
//        product.insertData("kurkure", "better taste",20);
//        product.insertData("Haldiram Bhujia", "nice",20);
//        product.insertData("Dairy Milk", "kuch mitha ho jaye",100);
//        product.updateData(500,1);
        
//        product.updateData(50, 2);
        product.deleteData("kurkure");
        context.close();
        
    }
}
