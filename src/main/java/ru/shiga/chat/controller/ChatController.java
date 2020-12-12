package ru.shiga.chat.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.shiga.chat.dto.Message;

import java.util.Collections;
import java.util.List;

@RestController
public class ChatController {


    @PostMapping(value = "/messages")
    public void receiveMessage(@RequestParam String text, @RequestParam String username) {
    }

    @GetMapping(value = "/messages")
    public ResponseEntity<List<Message>> getMessage(@RequestParam Integer size) {


        return ResponseEntity.ok(Collections.emptyList());
    }
}
