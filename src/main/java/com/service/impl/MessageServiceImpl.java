package com.service.impl;

import com.model.Message;
import com.repository.MessageRepository;
import com.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public Message findById(Long id) {
        return messageRepository.findById(id);
    }

    @Override
    public void save(Message customer) {
        messageRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        messageRepository.remove(id);
    }
}
