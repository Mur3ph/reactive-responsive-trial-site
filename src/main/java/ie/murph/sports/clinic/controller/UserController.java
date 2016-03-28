package ie.murph.sports.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserController 
{
	@RequestMapping(value="", method=RequestMethod.GET)
	public String user()
	{
		return "users/list";
	}
}
