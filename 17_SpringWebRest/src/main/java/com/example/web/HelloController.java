package com.example.web;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/hello

//http://localhost:8080/hello/sayhello
@RestController
@RequestMapping("/hello")
public class HelloController {

	
	//Get and Post
	//GetMapping, PostMapping, PutMapping
	
	
	@GetMapping("/sayhello")
	public String sayHello() {
		
		return "Hello user, Spring Rest";
		
	}
	
	@GetMapping("/sayhello/{name}")
	public String sayHelloName(@PathVariable("name") String name) {
		
		return "Welcome " + name;
		
	}
	

	@GetMapping("/sayhello/{name}/{lname}")
	public String sayHelloNameLastName(@PathVariable("name") String name,
			@PathVariable("lname") String lname) {
		
		return "Welcome " + name + " " + lname;
		
	}
	
	@PostMapping("/sayhellopost")
	public String sahHelloPost(@RequestParam("name") String name, 
			@RequestParam("lname") String lname) {
		
		return "Welcome " + name + " " + lname;
		
	}
	
	//RensponseEntity
	
	@GetMapping("/sayhelloresp")
	public ResponseEntity<String> sayHelloResponse() {
		
		return ResponseEntity.status(HttpStatus.OK).body("Hello from Spring");
		
	}
	
	@GetMapping("/sayhelloresperr")
	public ResponseEntity<String> sayHelloResponseErr() {
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error at server side..");
		
	}
	
	
	@PostMapping("/sayhellomessage")
	public Message<String> sahHelloMessage(@RequestParam("name") String name, 
			@RequestParam("lname") String lname) {
		
	
		Message<String> msg = new Message<String>(
				LocalDateTime.now(), "OK", "name is " + name + " "+ lname);
		
		return msg;
		
	}
	
	
	@PostMapping("/saveuser")
	public Message<User> registerUser(@RequestBody User user){
		
		Message<User> msg = new Message<>();
		msg.setTime(LocalDateTime.now());
		msg.setMessage("OK");
		
		msg.setData(user);
		
		return msg;
		
	}
	
	
	
	class Message<T> {
	
		private LocalDateTime time;
		private String message;
		private T data;
		
		public Message() {
			// TODO Auto-generated constructor stub
		}

		public Message(LocalDateTime time, String message, T data) {
			super();
			this.time = time;
			this.message = message;
			this.data = data;
		}

		public LocalDateTime getTime() {
			return time;
		}

		public void setTime(LocalDateTime time) {
			this.time = time;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
