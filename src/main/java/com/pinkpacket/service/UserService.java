package com.pinkpacket.service;

import com.pinkpacket.domain.User;
import com.pinkpacket.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService (UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User save (User user) {
    return userRepository.save(user);
  }

  public List<User> findAll () {
    Iterable<User> iterable = userRepository.findAll();
    List<User> list = StreamSupport.stream(iterable.spliterator(), false)
        .collect(Collectors.toList());
    return list;
  }

  public Optional<User> findOne (Long id) {
    return userRepository.findById(id);
  }

}
