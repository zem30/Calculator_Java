package Calculator;

import java.util.Scanner;

public class MainChislo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение, которое необходимо посчитать.");
        String scan = scanner.nextLine();

//проверяем факт того, что написаны 2 переменные и 1 оператор
        String value = scan.replaceAll("[-+/*]", " $0 ").replace("  ", " ").trim(); //добавили пробелы, если этого не сделал пользователь
        String[] MyExample = value.split(" ");
        if (MyExample.length != 3) {
            throw new IllegalArgumentException("Выражение должно иметь две переменные от 1 до 10 и одну операцию(+,-,*,/) над ними." +
                    " Пожалуйста, повторите попытку");
        }
//        System.out.println(Arrays.toString(MyExample));

        Calculator calc = new Calculator();

//        String number1 = MyExample[0];//1 перменная
//        String operation = MyExample[1];//мат.операция
//        String number2 = MyExample[2];//2 переменная

        try {
            int a = Integer.parseInt(MyExample[0]);
            int b = Integer.parseInt(MyExample[2]);
            if (a > 0 & a <= 10 && b > 0 & b <= 10) {
                System.out.println(calc.work(a, b, MyExample[1]));
            } else {
                throw new IllegalArgumentException("Переменные должны быть от 1 до 10");
            }
        } catch (NumberFormatException e) {
            int a = Converter.transArab(MyExample[0]);
            int b = Converter.transArab(MyExample[2]);
            if (a > 0 & a <= 10 && b > 0 & b <= 10) {
                System.out.println(Converter.transRim(calc.work(a, b, MyExample[1])));
            }
        }
    }
}



