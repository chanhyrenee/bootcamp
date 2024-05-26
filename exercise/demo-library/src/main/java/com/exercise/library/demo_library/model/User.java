package com.exercise.library.demo_library.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class User {

  private static int count = 0;
  private int userId;
  private String userName;

  public User(String userName) {
    this.userId = ++count;
    this.userName = userName;
  }
}
