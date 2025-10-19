package com.example.product_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class ProductServiceApplicationTests {

	@Test
void thisTestWillIntentionallyFail() {
    // This 'fail()' method from JUnit will
    // automatically fail the test.
    fail("Deliberate failure to test the CI pipeline!");
}

}
