package com.exercise.library.demo_library.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.context.annotation.Configuration;
import com.exercise.library.demo_library.model.Book;
import com.exercise.library.demo_library.model.User;
import jakarta.annotation.PostConstruct;
import lombok.Getter;

@Getter
@Configuration
public class AppConfig {
  private final Set<User> users = new HashSet<>();
  private final List<Book> books = new ArrayList<>();

@PostConstruct
public void bookShelf(){
  books.add(new Book(9871, "Harry Porter v1"));
  books.add(new Book(9672, "Harry Porter v2"));
  books.add(new Book(9673, "Easy CPU"));
  books.add(new Book(9674, "Cake Recipe"));
  books.add(new Book(9675, "Hello Kitty"));
}
}
