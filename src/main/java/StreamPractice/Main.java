package StreamPractice;

public class Main {
    @FunctionalInterface
    interface Mycalculator {
        int calc(int a, int b);
    }

    public static void main(String[] args) {
        // 덧셈
        Mycalculator addWithAnonymousClass = new Mycalculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };

        // lambda adder
        Mycalculator addWithLambda = (a, b) -> a + b;

        // 뺄셈
        Mycalculator subWithAnonymousClass = new Mycalculator() {
            @Override
            public int calc(int a, int b) {
                return a - b;
            }
        };
        Mycalculator subWithLambda = (a, b) -> a - b;

        // 곱셈
        Mycalculator multiplyWithAnonymousClass = new Mycalculator() {
            @Override
            public int calc(int a, int b) {
                return a * b;
            }
        };
        Mycalculator multiplyWithLambda = (a, b) -> a * b;

        // 나눗셈
        Mycalculator divideWithAnonymousClass = new Mycalculator() {
            @Override
            public int calc(int a, int b) {
                return b != 0 ? a / b : 0;
            }
        };
        Mycalculator divideWithLambda = (a, b) -> b != 0 ? a / b : 0;
    }
}
f