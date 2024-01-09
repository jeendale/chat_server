package com.spring.tming.chat_server.repository;

import com.spring.tming.chat_server.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChatMessageRepository extends JpaRepository<ChatMessage,Long> {
}
