package com.pinkpacket.domain;

import java.io.Serializable;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
public class User implements Serializable {
  private Long id;
  private String name;

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  public User(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public User() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
