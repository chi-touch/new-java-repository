import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddPositionTest{

	@Test
	public void testOddElements() {
		int[] odd = {10,20,30,40,50,60,70,80, 90};
		int[] expected = {10, 30, 50, 70, 90};

		int[] actual = OddPosition.oddElements(odd);

		assertArrayEquals(expected, actual);
	}


}
