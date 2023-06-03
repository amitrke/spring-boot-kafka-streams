package com.example.demo.dto.converters;

import org.apache.kafka.common.serialization.Deserializer;

import com.example.demo.dto.Message;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MessageDeSerializer implements Deserializer<Message>{

    private final ObjectMapper objectMapper = new ObjectMapper();
    
    @Override
    public Message deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(data, Message.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
