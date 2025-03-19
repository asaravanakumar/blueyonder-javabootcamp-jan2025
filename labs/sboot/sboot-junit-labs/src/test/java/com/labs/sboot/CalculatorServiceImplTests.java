package com.labs.sboot;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class CalculatorServiceImplTests {

    @Autowired
    CalculatorService   calculatorServiceImpl;

    @BeforeAll
    public static void setup() {
        log.info("Called Before All...");
    }

    @AfterAll
    public static void cleanup() {
        log.info("Called After All...");
    }

    @BeforeEach
    public void testDataSetup() {
        log.info("Called Before Each...");
    }

    @AfterEach
    public void testDataCleanup() {
        log.info("Called After Each...");
    }

    @Test
    public void testAdd() {
        // 10 + 20 = 30
        int result = calculatorServiceImpl.add(10,20);
        //Assertions.assertEquals(30, result);
        Assertions.assertThat(result).isEqualTo(30);
    }

    @Test
    public void testSubtract() {
        int result = calculatorServiceImpl.subtract(40, 20);
        Assertions.assertThat(result).isEqualTo(20);
    }
}
