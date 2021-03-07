package cz.pavlikj3.kursovnilistek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KursovniListekController 
{
	
	@Autowired
	private KursovniListekRepository kursovniListekController;
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello world";
	}
	
	@RequestMapping("/kurs")
	public List<KursovniListek> kurs()
	{
		return kursovniListekController.findAll();
	}
}
