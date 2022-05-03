package com.pinkpacket.repository;

import com.pinkpacket.domain.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  @Autowired
  private RedisTemplate redisTemplate;

  private static final String KEY = "USER";

  public User save(User user) {
    redisTemplate.opsForHash().put(KEY,user.getId().toString(),user);
    return user;
  }

  public List<User> findAll() {
    return redisTemplate.opsForHash().values(KEY);
  }

  public User findById(Long id) {
    return (User)redisTemplate.opsForHash().get(KEY, id.toString());
  }

  public void delete(Long id) {
    redisTemplate.opsForHash().delete(KEY,id.toString());
  }
}
