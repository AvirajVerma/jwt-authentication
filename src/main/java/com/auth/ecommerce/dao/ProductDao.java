package com.auth.ecommerce.dao;

import com.auth.ecommerce.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {

    public List<Product> findAll(Pageable pageable);

    public List<Product> findByProductNameContainingIgnoreCaseOrProductDescriptionContainingIgnoreCase(
            String key1, String key2, Pageable pageable
    );

    public List<Product> findAllByOrderByProductDiscountedPriceAsc(Pageable pageable);

    public List<Product> findAllByOrderByProductDiscountedPriceDesc(Pageable pageable);

    public List<Product> findByProductNameContainingIgnoreCaseOrProductDescriptionContainingIgnoreCaseOrderByProductDiscountedPriceAsc(
            String key1, String key2, Pageable pageable
    );

    public List<Product> findByProductNameContainingIgnoreCaseOrProductDescriptionContainingIgnoreCaseOrderByProductDiscountedPriceDesc(
            String key1, String key2, Pageable pageable
    );
}
