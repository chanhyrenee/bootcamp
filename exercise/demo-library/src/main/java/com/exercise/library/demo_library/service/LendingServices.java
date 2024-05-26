package com.exercise.library.demo_library.service;

import com.exercise.library.demo_library.model.Book;
import com.exercise.library.demo_library.model.User;

public interface LendingServices {
  boolean borrowbooks(User user, Book book);
}
