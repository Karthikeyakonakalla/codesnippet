package com.karthik.ecomm.Repository;

import com.karthik.ecomm.entity.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    Optional<Product> findByName(String name);

}
