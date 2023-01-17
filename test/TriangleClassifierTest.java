import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @BeforeEach
    void showBeforeEach(){
        System.out.println("Test Triangle");
    }
    @Test
    @DisplayName("2-2-2")
    void testClassifierTriangle0() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifierTriangle(2, 2, 2);
        String expected = "Tam giac deu";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("2-2-3")
    void testClassifierTriangle1() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifierTriangle(2, 2, 3);
        String expected = "Tam giac can";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("3-4-5")
    void testClassifierTriangle2() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifierTriangle(3, 4, 5);
        String expected = "Tam giac thuong";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("8-2-3")
    void testClassifierTriangle3() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifierTriangle(8, 2, 3);
        String expected = "Khong phai la tam giac";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("1-2-1")
    void testClassifierTriangle4() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifierTriangle(1, 2, 1);
        String expected = "Khong phai la tam giac";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("0-1-1")
    void testClassifierTriangle5() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifierTriangle(0, 1, 1);
        String expected = "Khong phai la tam giac";
        assertEquals(expected, result);
    }
}