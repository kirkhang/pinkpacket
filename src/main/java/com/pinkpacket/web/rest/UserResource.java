package com.pinkpacket.web.rest;

import com.pinkpacket.domain.User;
import com.pinkpacket.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class UserResource {
  private final UserService userService;

  public UserResource (UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/user")
  public List<User> getAllUser () {
    return userService.findAll();
  }

  @PostMapping("/user")
  public User createUser (@RequestBody User user) {
    return userService.save(user);
  }

  @GetMapping("/user")
  public User getUser (@PathVariable Long id) {
    Optional<User> user =  userService.findOne(id);
    if (user.isPresent()) {
      return user.get();
    }
    return null;
  }
}
