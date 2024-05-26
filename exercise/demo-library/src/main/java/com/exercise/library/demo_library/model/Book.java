package com.exercise.library.demo_library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book {
  private int ISBN;
  private String bookName;
}
