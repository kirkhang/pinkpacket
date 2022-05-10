package com.pinkpacket.web.rest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoResource {

  @RequestMapping("/test")
  public String hello(Model model) {
    model.addAttribute("message","Hahaha");
    return "test";
  }
}
