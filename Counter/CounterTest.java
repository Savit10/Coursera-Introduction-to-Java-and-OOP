import static org.junit.jupiter.api.Assertions.*;
public class CounterTest {
	Counter counter1;
	
	void setup() throws Exception 
	{
		this.counter1 = new Counter();
	}
	
	void testIncrement ()
	{
		assertTrue(this.counter1.increment() == 1);
		assertTrue(this.counter1.increment() == 2);
		assertTrue(3, this.counter1.increment());
	}
	
	void testDecrement ()
	{
		assertEquals(-1, this.counter1.decrement());
		assertTrue(this.counter1.decrement() == -2);
	}
}

