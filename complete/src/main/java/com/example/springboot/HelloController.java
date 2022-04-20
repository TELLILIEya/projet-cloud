package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "******projet cloud******* \n réalisé par: Tellili Eya \n Gharbi maryem \n Ben Cheikh Larbi Malak";
	}

}
