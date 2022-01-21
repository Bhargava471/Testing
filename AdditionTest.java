import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.maven.Addition;

public class AdditionTest {
	
	Addition ad = new Addition();
	@Test
	public void addTest() {
		System.out.println(ad.add(20,20));
		assertEquals(20,ad.add(10,10));
	}

}
