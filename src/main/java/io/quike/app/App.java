package io.quike.app;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.Objects;

@Log4j2
public class App {

  private static int counter;

  public static void main(String[] args) {
    if (Objects.isNull(args)) throw new IllegalArgumentException("No null args are allowed.");
    counter = 0;
    log.info("args={}", Arrays.toString(args));
    counter = args.length;
  }

  public static int getCounter() {
    return counter;
  }
}
