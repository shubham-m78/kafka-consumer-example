package kafka_consumer_example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "topic-three", groupId = "consumer-group")
    public void consumerOne(String message) {
        log.info("Consumer 1 has consumed the message: {}", message);
    }

    @KafkaListener(topics = "topic-three", groupId = "consumer-group")
    public void consumerTwo(String message) {
        log.info("Consumer 2 has consumed the message: {}", message);
    }

    @KafkaListener(topics = "topic-three", groupId = "consumer-group")
    public void consumerThree(String message) {
        log.info("Consumer 3 has consumed the message: {}", message);
    }

    @KafkaListener(topics = "topic-three", groupId = "consumer-group")
    public void consumerFour(String message) {
        log.info("Consumer 4 has consumed the message: {}", message);
    }
}
