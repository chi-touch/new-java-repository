import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenNumTest{


	@Test 
	public void evenTest(){
		int [] even = {10,20,30,40,50,60,70,80,90};
		int [] expect = {20,40,60,80};

	int [] actual = EvenNum.evenPosition(even);

		assertArrayEquals(expect, actual);


	}




}