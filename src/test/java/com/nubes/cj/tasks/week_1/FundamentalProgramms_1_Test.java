package com.nubes.cj.tasks.week_1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FundamentalProgramms_1_Test {
	@Test
	void addtwoNumberTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertAll("Add two Number", () -> assertEquals(10, obj.addNumbers(5, 5)),
				() -> assertEquals(10, obj.addNumbers(-10, 20)), () -> assertEquals(10, obj.addNumbers(10, 0)),
				() -> assertEquals(0, obj.addNumbers(-10, 10)), () -> assertEquals(-10, obj.addNumbers(-5, -5)));
	}

	@Test
	void substractNumbersTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertAll("Sub two numbers", () -> assertEquals(0, obj.substractNumbers(10, 10)),
				() -> assertEquals(-5, obj.substractNumbers(5, 10)),
				() -> assertEquals(-10, obj.substractNumbers(-5, 5)),
				() -> assertEquals(3, obj.substractNumbers(10, 7)),
				() -> assertEquals(-3, obj.substractNumbers(7, 10)));
	}

	@Test
	void avgThreeTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertAll("Avg of Three numbers", () -> assertEquals(5, obj.average(5, 5, 5)),
				() -> assertEquals(5, obj.average(5, 5, 5))
		// ,() -> assertEquals(7.33333333333, obj.average(5, 7, 10))

		);
	}

	@Test
	void swapTest() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		assertAll("Swap Two Numbers", () -> assertEquals("10 and 20", obj.swap(20, 10)),
				() -> assertEquals("-5 and 20", obj.swap(20, -5)),
				() -> assertEquals("-99 and -10", obj.swap(-10, -99)), () -> assertEquals("10 and 0", obj.swap(0, 10)));
	}
}
