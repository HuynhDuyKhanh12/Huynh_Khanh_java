package com.HuynhDuyKhanh.example05.repository;

import com.HuynhDuyKhanh.example05.entity.Chat;
import com.HuynhDuyKhanh.example05.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ChatRepository extends JpaRepository<Chat, Long> {
    List<Chat> findBySender_UserIdOrReceiver_UserId(Long senderId, Long receiverId);

}