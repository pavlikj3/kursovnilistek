package cz.pavlikj3.kursovnilistek;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KursovniListekController 
{
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello world";
	}
	
}
