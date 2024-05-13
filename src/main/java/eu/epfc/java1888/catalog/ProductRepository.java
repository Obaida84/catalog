package eu.epfc.java1888.catalog;

import org.springframework.data.jpa.repository.JpaRepository;

public
    interface ProductRepository extends JpaRepository<Product, Long>{

    }

