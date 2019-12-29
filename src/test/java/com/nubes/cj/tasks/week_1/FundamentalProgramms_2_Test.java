package com.nubes.cj.tasks.week_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FundamentalProgramms_2_Test {
	@Test
	public void addNumbersSpec() {
		FundamentalPrograms_1 obj = new FundamentalPrograms_1();
		Assertions.assertEquals(10, obj.addNumbers(10, 0));
	}
}
