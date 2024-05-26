package com.exercise.library.demo_library.controller;

import java.util.List;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.exercise.library.demo_library.dto.UserDTO;
import com.exercise.library.demo_library.model.Book;
import com.exercise.library.demo_library.model.User;

public interface LibraryOperation {

  @GetMapping(value = "/user/adduser/{username}")
  User addUser(@PathVariable(value = "username") String userName);

  @GetMapping(value = "user/getuser/{username}")
  User getUser(@PathVariable(value = "username") String userName);

  @GetMapping(value = "user/getuser/all")
  Set<User> getUserALL();

  @GetMapping(value = "book/addbook")
  Book addBook(@RequestParam int ISBN, @RequestParam String bookName);

  @GetMapping(value = "book/getbook")
  Book getBook(@RequestParam int ISBN);

  @GetMapping(value = "book/searchbook")
  List<Book> searchbook(@RequestParam String bookName);

  @GetMapping(value = "book/getbooklist")
  List<Book> getBookList();

  @GetMapping(value = "borrowbooks/username/{username}")
  boolean borrowbooks(@PathVariable(value = "username") String userName,
      @RequestParam int ISBN);

  @GetMapping(value = "user/borrowlist/{username}")
  UserDTO userBorrowRecord(@PathVariable(value = "username") String userName);

  @GetMapping(value = "user/borrowlist/all")
  List<UserDTO> getBorrowList();
}
