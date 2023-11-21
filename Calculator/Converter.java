package Calculator;

public class Converter {

    //Перевод римских чисел в арабские
    public static int transArab(String chislo) {
        if ("I".equals(chislo)) return 1;
        else if ("II".equals(chislo)) return 2;
        else if ("III".equals(chislo)) return 3;
        else if ("IV".equals(chislo)) return 4;
        else if ("V".equals(chislo)) return 5;
        else if ("VI".equals(chislo)) return 6;
        else if ("VII".equals(chislo)) return 7;
        else if ("VIII".equals(chislo)) return 8;
        else if ("IX".equals(chislo)) return 9;
        else if ("X".equals(chislo)) return 10;
        else
            throw new IllegalArgumentException("Не правильно введены переменные. Числа должны быть целыми в формате от I до X, " +
                    "либо от 1 до 10. Повторите попытку");
    }

    //перевод из арабских чисел в римские
    public static String transRim(int number) {
        if (number < 1 || number > 1000) {
            return "Ошибка: число не может быть представлено римскими цифрами.";
        }

        String result = "";

        while (number >= 100) {
            result += "C";
            number -= 100;
        }

        if (number >= 90) {
            result += "XC";
            number -= 90;
        }

        if (number >= 50) {
            result += "L";
            number -= 50;
        }

        if (number >= 40) {
            result += "XL";
            number -= 40;
        }

        while (number >= 10) {
            result += "X";
            number -= 10;
        }

        if (number >= 9) {
            result += "IX";
            number -= 9;
        }

        if (number >= 5) {
            result += "V";
            number -= 5;
        }

        if (number >= 4) {
            result += "IV";
            number -= 4;
        }

        while (number >= 1) {
            result += "I";
            number -= 1;
        }

        return result;
    }
}

