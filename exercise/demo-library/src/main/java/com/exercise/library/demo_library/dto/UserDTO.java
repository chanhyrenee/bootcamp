package com.exercise.library.demo_library.dto;

import java.util.List;
import com.exercise.library.demo_library.model.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDTO {
  private int userID;
  private String userName;
  private List<Book> records;
}
