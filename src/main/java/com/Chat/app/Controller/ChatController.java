package com.Chat.app.Controller;

import com.Chat.app.Model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
@MessageMapping("/sendMessage")
@SendTo("/topic/message")
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }
@GetMapping("/chat")
    public String chat(){
    return "chat";
}
}
