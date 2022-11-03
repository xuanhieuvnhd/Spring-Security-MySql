package com.service;

import com.model.Message;

import java.util.List;

public interface MessageService {

    List<Message> findAll();

    Message findById(Long id);

    void save(Message customer);

    void remove(Long id);
}
