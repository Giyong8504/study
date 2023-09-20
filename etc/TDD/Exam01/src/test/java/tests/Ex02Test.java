package tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Ex02Test {
    @TempDir
    File dir;


    @BeforeAll // 처음 실행
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterAll // 마지막에 실행
    static void afterAll() {
        System.out.println("AfterAll");
    }

    @BeforeEach // 메서드 전에 실행
    void beforeEach() {
        System.out.println("BeforeEach!");
    }

    @AfterEach // 메서드 후에 실행
    void afterEach() {
        System.out.println("AfterEach!");
    }

    @Test
    @DisplayName("테스트1")
    void test1() {
        System.out.println("테스트1");
        System.out.println(dir.getAbsoluteFile());
    }

    @Test
    @DisplayName("테스트2")
    @Disabled // 테스트 배제.
    void test2() {
        System.out.println("테스트2");
    }

    @Test
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
    void test3() throws InterruptedException{
        Thread.sleep(4000);
    }
}
