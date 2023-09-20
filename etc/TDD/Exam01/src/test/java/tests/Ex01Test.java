package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ex01Test {
    @Test
    @DisplayName("테스트에 대한 설명..")
    void test1() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        assertEquals(30,result);

    }
}
