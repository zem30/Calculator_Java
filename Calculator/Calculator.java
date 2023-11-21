package Calculator;

public class Calculator {
    //работа с числами и с операциями
    public int work(int a, int b, String oper) {
        int result;
        switch (oper) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException("Деление на 0 невозможно");
                } else {
                    result = a / b;
                }
                break;
            default:
                throw new IllegalArgumentException("Не правильно прописана математическая операция. Выберите одну из " +
                        "операций: +,-,*,/ и повторите попытку");
        }
        return result;
    }
}
