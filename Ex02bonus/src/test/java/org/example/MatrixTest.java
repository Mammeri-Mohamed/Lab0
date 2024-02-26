package org.example;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MatrixTest {

    @Test
    public void testAdd() {
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix matrix2 = new Matrix(2);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        matrix1.add(matrix2);

        assertEquals(6, matrix1.get(0, 0));
        assertEquals(8, matrix1.get(0, 1));
        assertEquals(10, matrix1.get(1, 0));
        assertEquals(12, matrix1.get(1, 1));
    }

    @Test
    public void testAddNullMatrix() {
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        assertThrows(NullPointerException.class, () -> {
            matrix1.add(null);
        });
    }

    @Test
    public void testAddDifferentSizeMatrix() {
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix matrix2 = new Matrix(3);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(0, 2, 7);
        matrix2.set(1, 0, 8);
        matrix2.set(1, 1, 9);
        matrix2.set(1, 2, 10);
        matrix2.set(2, 0, 11);
        matrix2.set(2, 1, 12);
        matrix2.set(2, 2, 13);

        assertThrows(IllegalArgumentException.class, () -> {
            matrix1.add(matrix2);
        });
    }

    @Test
    public void testMultiply() {
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix matrix2 = new Matrix(2);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        matrix1.multiply(matrix2);
        // ************voir ici normalment expected 32 mais le resulat 19  *************************
        assertEquals(32, matrix1.get(0, 0));
        assertEquals(34, matrix1.get(0, 1));
        assertEquals(40, matrix1.get(1, 0));
        assertEquals(42, matrix1.get(1, 1));
    }

    @Test
    public void testMultiplyNullMatrix() {
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1,2);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        assertThrows(NullPointerException.class, () -> {
            matrix1.multiply(null);
        });
    }

    @Test
    public void testMultiplyDifferentSizeMatrix() {
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix matrix2 = new Matrix(3);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(0, 2, 7);
        matrix2.set(1, 0, 8);
        matrix2.set(1, 1, 9);
        matrix2.set(1, 2, 10);
        matrix2.set(2, 0, 11);
        matrix2.set(2, 1, 12);
        matrix2.set(2, 2, 13);

        assertThrows(IllegalArgumentException.class, () -> {
            matrix1.multiply(matrix2);
        });
    }

    @Test
    public void testTranspose() {
        Matrix matrix = new Matrix(2);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        matrix.transpose();

        assertEquals(1, matrix.get(0, 0));
        assertEquals(3, matrix.get(0, 1));
        assertEquals(2, matrix.get(1, 0));
        assertEquals(4, matrix.get(1, 1));
    }

    @Test
    public void testToString() {
        Matrix matrix = new Matrix(2);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        String expected = "[1, 2]\n[3, 4]\n";
        assertEquals(expected, matrix.toString());
    }
}