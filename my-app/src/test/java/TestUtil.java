import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void lengthEqualsOne() {
    boolean result = c.compute(1);
    assertFalse(result);
  }

  @Test
  public void lengthMod() {
    boolean result = c.compute(1,2,3,4,5,6);
    assertFalse(result);
  }

  @Test
  public void throwsException() {
    assertThrows(RuntimeException.class, () -> {
      c.compute(0,2,3);
    });
  }

  @Test
  public void sumMod() {
    boolean result = c.compute(1,2,3);
    assertTrue(result);
  }

  @Test
  public void sumModFalse() {
    boolean result = c.compute(2,3,6);
    assertFalse(result);
  }


}