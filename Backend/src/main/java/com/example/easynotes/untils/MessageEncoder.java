package com.example.easynotes.untils;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;


public class MessageEncoder implements Encoder.Text<String> {


    @Override
    public String encode(String message) throws EncodeException {
        return message;
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
    }

    @Override
    public void destroy() {
        // Close resources (if any used)
    }
}