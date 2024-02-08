package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.LoginForm;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginPage(Model model) {
		LoginForm loginFormObj = new LoginForm();
		model.addAttribute("loginForm", loginFormObj);
		return "index";
		
	}
	
	@PostMapping("/checkLogin")
	public String checkLogin(LoginForm formObj , Model model) {
		if (formObj.getEmail().equals("meghna@gmail.com") && formObj.getPassword().equals("meghna123")) {
			model.addAttribute("msg", "Welcome to gmail");
			return "dashboard";	
		}else {
			model.addAttribute("msg", "Invalid credentials");
			return "index";
		}	
	}
	
}
