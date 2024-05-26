package com.exercise.library.demo_library.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercise.library.demo_library.config.AppConfig;
import com.exercise.library.demo_library.model.User;
import com.exercise.library.demo_library.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired AppConfig appConfig;

  @Override
  public User addUser(String userName) {
    for (User user : appConfig.getUsers()) {
      if (user.getUserName().equals(userName)) {
        System.out
            .println("Rejected. UserName " + userName + " is already exist.");
        return null;
      }
    }
    User newUser = new User(userName);
    appConfig.getUsers().add(newUser);
    System.out.println("Accepted. " + newUser.toString());
    return newUser;
  }

  @Override
  public Optional<User> getUser(String userName) {
    for (User user : appConfig.getUsers()) {
      if (user.getUserName().equals(userName)) {
        return Optional.of(user);
      }
    }
    return Optional.empty();
  }
}
