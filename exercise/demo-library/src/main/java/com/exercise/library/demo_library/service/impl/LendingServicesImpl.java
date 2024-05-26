package com.exercise.library.demo_library.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.exercise.library.demo_library.model.Book;
import com.exercise.library.demo_library.model.User;
import com.exercise.library.demo_library.service.LendingServices;

@Service
public class LendingServicesImpl implements LendingServices {
  private static Map<User, List<Book>> borrowList = new HashMap<>();

  public static Map<User, List<Book>> getBorrowList() {
    return borrowList;
  }

  @Override
  public boolean borrowbooks(User user, Book book) {
    if (borrowList.values().stream().flatMap(List::stream)
        .anyMatch(e -> e.equals(book))) {
      return false;
    }
    if (borrowList.containsKey(user)) {
      borrowList.get(user).add(book);
    } else {
      borrowList.put(user, new ArrayList<>(List.of(book)));
    }
    return true;
  }
}
