package com.ineffable.socialmediacore;

import org.springframework.boot.SpringApplication;

public class TestSocialMediaCoreApplication {

	public static void main(String[] args) {
		SpringApplication.from(SocialMediaCoreApplication::main).with(TestcontainersConfiguration.class).run(args);
	}
}