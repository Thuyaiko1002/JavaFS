package news.spring.demo.controller.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Annotation @RequestMapping được sử dụng để map request với class hoặc method xử lý request đó
@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "homePage";
	}
}

