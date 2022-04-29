package com.pinkpacket.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class DemoResource {

  @RequestMapping("/test")
  public String Test (Model model) {
    model.addAttribute("message","hahaah");
    return "test";
  }
}
