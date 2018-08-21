package com.myapp.MyFirstSpringBootApp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
@SpringBootApplication
public class HomeController {
	
	@RequestMapping("/home")
	 String index(){
   
        return "index";
    }
	
	 @CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping("/products")
	public @ResponseBody Product getProducts() {
		Product newProduct = new Product();
		newProduct.setName("iPhone");
		newProduct.setDescription("iPhone X Plus Silver");
		newProduct.setPrice("$1000");
		return newProduct;

	}

	 private String  user;
	 @CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="/login", method= {RequestMethod.POST,RequestMethod.GET})
	public  @ResponseBody Object LoginControl(@RequestParam("username") String username, @RequestParam("password") String password) {
		
		
		 Product newProduct = new Product();
		 newProduct.setPrice("$1000");
		 Login login=new Login();
		login.setUsername(username);
		user=login.getUsername();
		
		
		
		if((username.equals("admin")) && (password.equals("admin"))){
			return login;
		}
		
		else
		{
			return newProduct;
		}
		
		
	}

	private String  pass;
	}	
