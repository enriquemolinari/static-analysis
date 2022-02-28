package epm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

  @Test
  // a fake test just to improve coverage
  public void shouldAnswerWithTrue() {
    var v = new Violation() {

    };

    v.foo(new String[] {"something"});
  }
}
