import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.maven.JunitTesting;

public class squareTest {

	@Test
	public void test() {
			JunitTesting test = new JunitTesting();
			int output = test.square(5);
			assertEquals(25, output);
				
	}

}
