package HomeWork2;

/**
 * Java Home Work 2
 *
 * @author Denisov Alexey
 *
 * @version dated Nov 25, 2018
 *
 */

public class TestExeption {
    public static void main(String[] args) throws MyArrayDataException {
        Object[][] arr;
        int summ = 0;
        try {
            arr = testArray(4, 2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    summ += (int) arr[i][j];
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("ячейка [" + i + "] , [" + j + "] содержит неверный тип данных");
                }
            }
        System.out.println("сумма чисел в массиве =" + summ);
    }

    public static Object [][] testArray(int x, int y) throws MyArraySizeException {
        if (x != 4 || y != 4) {
            throw new MyArraySizeException("Массив не соответствует заданному размеру (4х4)");

        }
        return new Object[][]{{12, 22, 58, 76}, {1, "54", 3, 8}};
    }
}