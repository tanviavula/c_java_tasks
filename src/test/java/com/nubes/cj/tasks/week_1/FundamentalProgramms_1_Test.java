package com.nubes.cj.tasks.week_1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class FundamentalProgramms_1_Test {
	@Test
	public void addNumbersSpec() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertAll("Add Number",
				() -> assertEquals(10, obj.addNumbers(1, 9)),
				() -> assertEquals(-2, obj.addNumbers(-1, -1)), 
				() -> assertEquals(0, obj.addNumbers(10, -10)),
				() -> assertEquals(-8, obj.addNumbers(1, -9)),
				() -> assertEquals(-10, obj.addNumbers(-1, -9))

		);
	}
}
