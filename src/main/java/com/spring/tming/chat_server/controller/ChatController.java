package com.spring.tming.chat_server.controller;

import com.spring.tming.chat_server.dto.ChatMessageDTO;
import com.spring.tming.chat_server.entity.ChatMessage;
import com.spring.tming.chat_server.service.ChatMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/chat")
public class ChatController {
/*    private final SimpMessagingTemplate messagingTemplate;
    private final ChatMessageService chatMessageService;

    @MessageMapping("/sendMessage")
    public void sendMessage(@Payload ChatMessageDTO chatMessageDTO) {
        // ChatMessageDTO를 ChatMessage로 변환
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setContent(chatMessageDTO.getContent());
        // 나머지 필드 설정

        // 이후 로직은 그대로 유지
        chatMessageService.saveMessage(chatMessage);
        messagingTemplate.convertAndSendToUser(
                chatMessage.getReceiver().getUsername(), "/queue/private", chatMessage);
    }

    @MessageMapping("/createRoom")
    public void createRoom(@Payload ChatMessageDTO chatMessageDTO) {
        ChatRoom room = new ChatRoom();
        room.setRoomId(chatMessageDTO.getRoomId());
        room.setSender(chatMessageDTO.getSender());
        room.setReceiver(chatMessageDTO.getReceiver());
        // (실제로는 채팅 방 생성 및 저장이 필요함)
        messagingTemplate.convertAndSend("/topic/public", room);
    }

    @MessageMapping("/getRooms")
    public void getRooms(@Payload ChatMessageDTO chatMessageDTO, SimpMessageHeaderAccessor headerAccessor) {
        // (실제로는 사용자가 속한 채팅 방 목록을 가져오는 로직이 필요함)
        messagingTemplate.convertAndSendToUser(
                chatMessageDTO.getSender().getUsername(), "/queue/rooms", "Room List Placeholder");
    }

    @PostMapping("/sendMessage")
    public ResponseEntity<ChatMessageResponseDTO> sendMessageHttp(@RequestBody ChatMessageDTO chatMessageDTO) {
        // ChatMessageDTO를 ChatMessage로 변환
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setContent(chatMessageDTO.getContent());
        // 나머지 필드 설정

        // 이후 로직은 그대로 유지
        chatMessageService.saveMessage(chatMessage);
        messagingTemplate.convertAndSendToUser(
                chatMessage.getReceiver().getUsername(), "/queue/private", chatMessage);

        // 응답으로 사용할 DTO 생성
        ChatMessageResponseDTO responseDTO = new ChatMessageResponseDTO("Message sent successfully!");
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }*/
}
