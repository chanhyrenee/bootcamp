package com.exercise.library.demo_library.service;

import java.util.Optional;
import com.exercise.library.demo_library.model.User;

public interface UserService {

  public User addUser(String userName);

  public Optional<User> getUser(String userName);

}
