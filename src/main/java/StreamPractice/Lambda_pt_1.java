package StreamPractice;

public class Lambda_pt_1 {
    @FunctionalInterface
    interface Mycalculator {
        int calc(int a, int b);
    }

    public static void main(String[] args) {
        // 덧셈
        Main.Mycalculator addWithAnonymousClass = new Main.Mycalculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };

        // lambda adder
        Main.Mycalculator addWithLambda = (a, b) -> a + b;

        // 뺄셈
        Main.Mycalculator subWithAnonymousClass = new Main.Mycalculator() {
            @Override
            public int calc(int a, int b) {
                return a - b;
            }
        };
        Main.Mycalculator subWithLambda = (a, b) -> a - b;

        // 곱셈
        Main.Mycalculator multiplyWithAnonymousClass = new Main.Mycalculator() {
            @Override
            public int calc(int a, int b) {
                return a * b;
            }
        };
        Main.Mycalculator multiplyWithLambda = (a, b) -> a * b;

        // 나눗셈
        Main.Mycalculator divideWithAnonymousClass = new Main.Mycalculator() {
            @Override
            public int calc(int a, int b) {
                return b != 0 ? a / b : 0;
            }
        };
        Main.Mycalculator divideWithLambda = (a, b) -> b != 0 ? a / b : 0;
    }
}
