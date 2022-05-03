package com.pinkpacket.service;

import com.pinkpacket.domain.User;
import com.pinkpacket.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public User save (User user) {
    return userRepository.save(user);
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User findById(Long id) {
    return userRepository.findById(id);
  }

  public void delete(Long id) {
    userRepository.delete(id);
  }
}
