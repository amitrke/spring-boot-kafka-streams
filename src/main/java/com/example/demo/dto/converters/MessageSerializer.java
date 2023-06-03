package com.example.demo.dto.converters;

import org.apache.kafka.common.serialization.Serializer;

import com.example.demo.dto.Message;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MessageSerializer implements Serializer<Message>{

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public byte[] serialize(String topic, Message data) {
        try {
            return objectMapper.writeValueAsBytes(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
