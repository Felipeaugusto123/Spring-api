package com.felipeAugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeAugusto.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
