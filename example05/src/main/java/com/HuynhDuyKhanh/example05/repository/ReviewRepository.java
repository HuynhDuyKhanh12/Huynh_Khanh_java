package com.HuynhDuyKhanh.example05.repository;

import com.HuynhDuyKhanh.example05.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByProduct_ProductId(Long productId);
    List<Review> findByUser_UserId(Long userId);
    List<Review> findByUserEmail(String email);
}
