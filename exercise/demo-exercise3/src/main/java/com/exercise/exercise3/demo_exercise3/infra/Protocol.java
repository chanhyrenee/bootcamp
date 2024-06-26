package com.exercise.exercise3.demo_exercise3.infra;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Protocol {
  HTTPS("https"), //
  HTTP("http"), //
  SSH("ssh"),;

  private String protocal;

}
