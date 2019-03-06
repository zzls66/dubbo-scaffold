package com.zzl.user.notify;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Service;


@Service
public class UnKnowMessageListener implements MessageListener<Integer,String> {

    @Override
    public void onMessage(ConsumerRecord<Integer, String> integerStringConsumerRecord) {

    }
}
