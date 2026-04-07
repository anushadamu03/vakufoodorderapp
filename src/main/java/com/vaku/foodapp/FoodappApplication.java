package com.vaku.foodapp;

import com.vaku.foodapp.email_notification.dtos.NotificationDTO;
import com.vaku.foodapp.email_notification.services.NotificationService;
import com.vaku.foodapp.enums.NotificationType;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class FoodappApplication {



	public static void main(String[] args) {
		SpringApplication.run(FoodappApplication.class, args);
	}



}
