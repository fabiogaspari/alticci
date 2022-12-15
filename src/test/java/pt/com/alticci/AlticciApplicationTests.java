package pt.com.alticci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pt.com.alticci.http.service.AlticciService;

@SpringBootTest
class AlticciApplicationTests {

	@Autowired
	AlticciService service;

	@Test
	void checkSomeAlticciValues() {
		Long zero = service.call(0);
		assertEquals(zero, 0L);

		Long one = service.call(1);
		assertEquals(one, 1L);

		Long two = service.call(2);
		assertEquals(two, 1L);

		Long three = service.call(3);
		assertEquals(three, 1L);

		Long four = service.call(4);
		assertEquals(four, 2L);

		Long five = service.call(5);
		assertEquals(five, 2L);

		Long six = service.call(6);
		assertEquals(six, 3L);

		Long seven = service.call(7);
		assertEquals(seven, 4L);

		Long eight = service.call(8);
		assertEquals(eight, 5L);
	}

}
