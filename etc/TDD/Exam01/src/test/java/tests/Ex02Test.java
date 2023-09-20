package tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Ex02Test {


    @TempDir
    File dir;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach!");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach!");
    }

    @Test
    @DisplayName("테스트1")
    void test1() {
        System.out.println("테스트1");
        System.out.println(dir.getAbsolutePath());
    }

    @Test
    @DisplayName("테스트2")
    @Disabled
    void test2() {
        System.out.println("테스트2");
    }

    @Test
    @Timeout(value=2000, unit= TimeUnit.MILLISECONDS)
    void test3() throws InterruptedException {
        Thread.sleep(1000);
    }

}
