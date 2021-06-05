import java.util.Arrays;

//1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
//        Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//        Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
//        Вх: [ 1 2 4 4 2 3 4 ] -> вых: [ ].
//        Вх: [ 1 2 44 2 34 1 2 ] -> вых: RuntimeException.
//        Вх: [ 1 2 1 7 ] -> вых: RuntimeException.
//
//        2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false; если в нем есть что то, кроме 1 и 4, то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//        [ 1 1 1 4 4 1 4 4 ] -> true
//        [ 1 1 1 1 1 1 ] -> false
//        [ 4 4 4 4 ] -> false
//        [ 1 4 4 1 1 4 3 ] -> false

public class Task12 {

    public int[] getArray(int[] arr) throws RuntimeException{
        if (arr.length == 0) {throw new NullPointerException();}
        int lastTd4 = -1;
        for (int i =0;i < arr.length; i++)
            if (arr[i] == 4)
                lastTd4 = i + 1;
            if (lastTd4 == -1) throw new RuntimeException();
            else return Arrays.copyOfRange(arr, lastTd4, arr.length);
    }




    public boolean checkArray14(int[] arr)
    {
        int num1 = 0, num2 = 4;
        for (int a :arr )
        {
            if (a == 1) num1++;
            else if (a == 4) num2++;
            else return false;
        }
        return (num1 > 0 && num2 > 0);
    }
}
//   Надеюсь правильно.....Третье задание не делал разбор еще не смотрел
