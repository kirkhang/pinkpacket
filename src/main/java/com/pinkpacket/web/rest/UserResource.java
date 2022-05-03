package com.pinkpacket.web.rest;

import com.pinkpacket.domain.User;
import com.pinkpacket.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

  @Autowired
  private UserService userService;

  @PostMapping("/user")
  public User createUser (@RequestBody User user) {
    return userService.save(user);
  }

  @GetMapping("/user")
  public List<User> findAll() {
    List<User> list = userService.findAll();
    return list;
  }

  @GetMapping("/user/{id}")
  public User findById(@PathVariable Long id) {
    return userService.findById(id);
  }

  @DeleteMapping("/user/{id}")
  public void delete(@PathVariable Long id) {
    userService.delete(id);;
  }
}
