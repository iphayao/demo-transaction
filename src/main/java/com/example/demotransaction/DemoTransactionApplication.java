package com.example.demotransaction;

import com.example.demotransaction.model.entity.Transaction;
import com.example.demotransaction.repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTransactionApplication.class, args);
	}

	@Bean
	public CommandLineRunner mockData(TransactionRepository repository) {
		return (args) -> {
			Transaction t = new Transaction();
			t.setReqId(100L);
			t.setTransRef("MockRef");
			t.setMerId(101L);
			t.setTerminalId(111L);
			t.setBankTransId(888L);
			t.setTransAmount(1000000L);
			t.setTransCurrency("Baht");

			repository.save(t);
		};
	}

}
