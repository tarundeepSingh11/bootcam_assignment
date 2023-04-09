package com.hibernate.hibernate.repo;
import com.hibernate.hibernate.Product.product;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<product,Integer> {
    List<product>findByName(String name);
   List<product>findByNameAndDesc(String name,String desc);

    List<product>findBypriceGreaterThan(int name);
}
