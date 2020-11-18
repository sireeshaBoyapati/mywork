package Control;

import org.springframework.web.bind.annotation.RequestMapping;

public class SpringController 
{
 @RequestMapping("/welcome")
 public String sendResponse()
 {
	 return "welcome";
 }
 
}
