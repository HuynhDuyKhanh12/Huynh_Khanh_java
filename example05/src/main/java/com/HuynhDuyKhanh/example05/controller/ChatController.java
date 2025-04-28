package com.HuynhDuyKhanh.example05.controller;
import com.HuynhDuyKhanh.example05.entity.User;

import com.HuynhDuyKhanh.example05.entity.Chat;
import com.HuynhDuyKhanh.example05.payloads.ChatDTO;
import com.HuynhDuyKhanh.example05.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/chats")
public class ChatController {
    @Autowired
    private ChatService chatService;
    
    @PostMapping("/send")
    public ChatDTO sendChat(@RequestBody ChatDTO chatDTO) {
        return chatService.saveChat(chatDTO);
    }
    
    @GetMapping("/user/{userId}")
    public List<ChatDTO> getUserChats(@PathVariable Long userId) {
        return chatService.getChatsByUser(userId);
    }
}