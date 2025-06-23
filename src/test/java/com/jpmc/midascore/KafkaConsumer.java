    package com.jpmc.midascore;

    import com.jpmc.midascore.foundation.Transaction;
    import org.springframework.kafka.annotation.KafkaListener;
    import org.springframework.stereotype.Service;

    @Service
    public class KafkaConsumer {

        @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-consumer-group")
        public void listen(Transaction transaction) {
            System.out.println("✅ Received transaction: " + transaction.toString());
            // You can also add a breakpoint here and inspect in debugger
        }
    }
