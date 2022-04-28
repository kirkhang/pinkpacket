package com.pinkpacket.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class DemoResource {

  @RequestMapping("/test")
  public String Test (Model model) {
    model.addAttribute("message","hahaah");
    return "test";
  }
}
