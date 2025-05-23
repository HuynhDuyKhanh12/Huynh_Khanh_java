package com.HuynhDuyKhanh.example05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HuynhDuyKhanh.example05.entity.Brand;

@Repository
public interface BrandRepo extends JpaRepository < Brand, Long > {

    Brand findByBrandName(String brandName);
}
