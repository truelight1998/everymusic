package com.github.everymusic.user.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
	
	private int id;
	private String email;
	private String name;
	private String password;
	private String role;
	private LocalDateTime createdAt;
}
