package com.techsuni.tracking.feed.reader;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class TrackingFeedReaderApplication {

	public static void main(String[] args) {
		// Launch the application
		SpringApplication.run(TrackingFeedReaderApplication.class, args);
	}

}
