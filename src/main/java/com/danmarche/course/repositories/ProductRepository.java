package com.danmarche.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danmarche.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
