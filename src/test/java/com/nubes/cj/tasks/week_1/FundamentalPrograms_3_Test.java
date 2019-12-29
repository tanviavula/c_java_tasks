/**
 * 
 */
package com.nubes.cj.tasks.week_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author M RAJESH 
 *
 */
class FundamentalPrograms_3_Test {

	@Test
	void revTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertAll("Reverse Number", () -> assertEquals(1234, obj.reverseOfNumber(4321)),
				() -> assertEquals(121, obj.reverseOfNumber(121)), 
				() -> assertEquals(4321, obj.reverseOfNumber(01234)),
				() -> assertEquals(0, obj.reverseOfNumber(0)), 
				() -> assertEquals(14507, obj.reverseOfNumber(70541))
				);
	}

	@Test
	void sumOfDigitstest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertAll("Sum of Digits", () -> assertEquals(15, obj.sumOfDigits(12345)),
				() -> assertEquals(3, obj.sumOfDigits(12)), 
				() -> assertEquals(9, obj.sumOfDigits(90)),
				() -> assertEquals(2, obj.sumOfDigits(1001))
				);
	}

	@Test
	void isPrimeTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertAll("Prime Number test", () -> assertEquals(true, obj.isPrime(2)),
				() -> assertEquals(true, obj.isPrime(3)), 
				() -> assertEquals(true, obj.isPrime(5)),
				() -> assertEquals(false, obj.isPrime(1)), 
				() -> assertEquals(false, obj.isPrime(0)),
				() -> assertEquals(false, obj.isPrime(-2), "-ve number can not be a prime number"),
				() -> assertEquals(true, obj.isPrime(127)), 
				() -> assertEquals(true, obj.isPrime(199))
				);
	}

	@Test
	void nthFibnacciNumberTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertAll("nth Fibnacci Number Test ", () -> assertEquals(0, obj.nthFibnacciNumber(0)),
				() -> assertEquals(3, obj.nthFibnacciNumber(4)), 
				() -> assertEquals(34, obj.nthFibnacciNumber(9)),
				() -> assertEquals(144, obj.nthFibnacciNumber(12))
				);
	}
	
	@Test
	void isPalindromeTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertAll("Palindrome test", () -> assertEquals(true, obj.isPalindrome(1)),
				() -> assertEquals(true, obj.isPalindrome(-1)),
				() -> assertEquals(true, obj.isPalindrome(11)),
				() -> assertEquals(true, obj.isPalindrome(121)),
				() -> assertEquals(true, obj.isPalindrome(-121)),
				() -> assertEquals(false, obj.isPalindrome(101)),
				() -> assertEquals(false, obj.isPalindrome(123)),
				() -> assertEquals(false, obj.isPalindrome(100011))
				);
	}
	

	
	@Test
	void countPrimesTest() {
		FundamentalPrograms_3 obj = new FundamentalPrograms_3();
		assertAll("prime count test",() -> assertEquals(4, obj.countPrimes(1, 10)),
				() -> assertEquals(11, obj.countPrimes(10, 50)),
				() -> assertEquals(0, obj.countPrimes(11, 10)),
				() -> assertEquals(10, obj.countPrimes(51, 100)),
				() -> assertEquals(0, obj.countPrimes(-10, -5))
				);		
	}
	
}
