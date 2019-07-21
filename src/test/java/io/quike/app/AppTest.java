package io.quike.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

  @Test
  public void testApp() {
    App.main(new String[0]);
    assertTrue(App.getCounter() == 1);
  }
}
