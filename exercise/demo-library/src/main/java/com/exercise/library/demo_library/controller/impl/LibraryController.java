package com.exercise.library.demo_library.controller.impl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.exercise.library.demo_library.config.AppConfig;
import com.exercise.library.demo_library.controller.LibraryOperation;
import com.exercise.library.demo_library.dto.UserDTO;
import com.exercise.library.demo_library.model.Book;
import com.exercise.library.demo_library.model.User;
import com.exercise.library.demo_library.service.BookService;
import com.exercise.library.demo_library.service.LendingServices;
import com.exercise.library.demo_library.service.UserService;
import com.exercise.library.demo_library.service.impl.LendingServicesImpl;

@RestController
public class LibraryController implements LibraryOperation {

  @Autowired
  private AppConfig appConfig;

  @Autowired
  private UserService userService;

  @Autowired
  private BookService bookService;

  @Autowired
  private LendingServices lendingServices;

  @Override
  public User addUser(String userName) {
    return userService.addUser(userName);
  }

  @Override
  public User getUser(String userName) {
    return userService.getUser(userName)
        .orElseThrow(() -> new RuntimeException("user is not exist"));
  }

  @Override
  public Set<User> getUserALL(){
    return appConfig.getUsers();
  }

  @Override
  public Book addBook(int ISBN, String bookName) {
    return bookService.addBook(ISBN, bookName);
  }

  @Override
  public Book getBook(int ISBN) {
    return bookService.getBook(ISBN)
        .orElseThrow(() -> new RuntimeException("book is not exist"));
  }

  @Override
  public List<Book> searchbook(String bookName) {
    List<Book> result = bookService.searchBook(bookName);
    if (result.isEmpty()) {
      throw new RuntimeException("No result found.");
    }
    return result;
  }

  @Override
  public List<Book> getBookList() {
    return appConfig.getBooks();
  }

  @Override
  public boolean borrowbooks(String userName, int ISBN) {
    try {
      return lendingServices.borrowbooks(getUser(userName), getBook(ISBN));
    } catch (RuntimeException e) {
      return false;
    }
  }

  @Override
  public UserDTO userBorrowRecord(String userName) {
    int userId = getUser(userName).getUserId();
    List<Book> bookList =
        LendingServicesImpl.getBorrowList().get(getUser(userName));
    return new UserDTO(userId, userName, bookList);
  }

  @Override
  public List<UserDTO> getBorrowList() {
    return LendingServicesImpl.getBorrowList().entrySet().stream()//
        .map(e -> new UserDTO(e.getKey().getUserId(), e.getKey().getUserName(),
            e.getValue()))//
        .collect(Collectors.toList());
  }
}
