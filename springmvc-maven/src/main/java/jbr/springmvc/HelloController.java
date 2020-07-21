package jbr.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

  @RequestMapping("/hello")
  public String hello(ModelMap map) {
    map.put("message", "HELLO. Welcome to Spring MVC using MAVEN!!!");

    return "hello";
  }

  @RequestMapping("/bye")
  public String bye(ModelMap map) {
    map.put("message", "GOOD BYE. Meet you soon!!!");

    return "bye";
  }
  
  @RequestMapping(value="jagatheesh/profile")
  public String viewJagaProfile(ModelMap m) {
	  
	  m.put("destination", "Software Engineer");
	  return "jagatheeshProfile";
  }
  
  @RequestMapping(value="/addTwo")
  public String sumOfTwoNumber(@RequestParam("num1") int a, @RequestParam("num2") int b, ModelMap m) {
	  
	  int total = a+b;
	  m.put("total", total);
	  System.out.println(total);
	  return "sum";
  }
  
}
