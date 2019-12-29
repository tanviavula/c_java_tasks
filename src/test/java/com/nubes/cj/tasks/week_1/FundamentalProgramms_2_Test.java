package com.nubes.cj.tasks.week_1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FundamentalProgramms_2_Test {
	@Test
	void isEvenTest() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertAll("even test ", () -> assertEquals(true, obj.isEven(10)), () -> assertEquals(false, obj.isEven(11)),
				() -> assertEquals(true, obj.isEven(-2)), () -> assertEquals(false, obj.isEven(-1)),
				() -> assertEquals(true, obj.isEven(0)));
	}

	@Test
	void biggestTest() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertAll("Biggest test", () -> assertEquals(10, obj.biggest(10, 5)),
				() -> assertEquals(-5, obj.biggest(-10, -5)), () -> assertEquals(0, obj.biggest(0, -5)));
	}

	@Test
	void biggestOfThreeTest() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertAll("Biggest of three test", () -> assertEquals(10, obj.biggest(10, 5, 2)),
				() -> assertEquals(-5, obj.biggest(-10, -5, -7)), () -> assertEquals(99, obj.biggest(10, 20, 99)),
				() -> assertEquals(12, obj.biggest(12, 12, 12)));
	}

	@Test
	void discountTest() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertAll("Discount test", () -> assertEquals(5.0, obj.getDiscountAmount(100),"Whole number "),
				() -> assertEquals(12, Math.round(obj.getDiscountAmount(120))),
				() -> assertEquals(60, Math.round(obj.getDiscountAmount(501))),
				() -> assertEquals(150, Math.round(obj.getDiscountAmount(1001))));
	}
	
	@Test
	void calElectricityBillTest() {
		FundamentalPrograms_2 obj = new FundamentalPrograms_2();
		assertAll("ELE Bill test ",() -> assertEquals(110,obj.calElectricityBill(50, 20)),
				() -> assertEquals(605,Math.round(obj.calElectricityBill(50, 111))),
				() -> assertEquals(8067,Math.round(obj.calElectricityBill(75, 999))),
				() -> assertEquals(10575,Math.round(obj.calElectricityBill(75, 1050)))
				);
	}
	
	
}
