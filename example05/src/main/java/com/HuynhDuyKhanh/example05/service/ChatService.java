package com.HuynhDuyKhanh.example05.service;

import com.HuynhDuyKhanh.example05.entity.Chat;
import com.HuynhDuyKhanh.example05.entity.User;
import com.HuynhDuyKhanh.example05.payloads.ChatDTO;

import java.util.List;

public interface ChatService {
    ChatDTO saveChat(ChatDTO chatDTO);
    List<ChatDTO> getChatsByUser(Long userId);
}