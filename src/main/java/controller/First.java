package controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
@RequestMapping("/")
public String Greeting() {
	return "Hello World!!";
}
}
