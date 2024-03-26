import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void isEmpty() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    String s = "";
    when(mq.size()).thenReturn(0);

    int result = c.countNumberOfOccurrences(s);
    assertEquals(result,-1);
  }

  @Test
  public void notContains() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    String s = "";
    when(mq.size()).thenReturn(1); //nonzero
    when(mq.contains(s)).thenReturn(false);


    int result = c.countNumberOfOccurrences(s);
    assertEquals(result,0);
  }

  @Test
  public void counterEqual() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    String s = "";
    when(mq.size()).thenReturn(10); //nonzero
    when(mq.contains(s)).thenReturn(true);
    when(mq.getAt(anyInt())).thenReturn("");

    int result = c.countNumberOfOccurrences(s);
    assertEquals(result,10);
  }

  @Test
  public void counterNotEqual() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    String s = "";
    when(mq.size()).thenReturn(10); //nonzero
    when(mq.contains(s)).thenReturn(true);
    when(mq.getAt(anyInt())).thenReturn("abc");

    int result = c.countNumberOfOccurrences(s);
    assertEquals(result,0);
  }

}