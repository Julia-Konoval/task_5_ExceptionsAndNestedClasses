package homeWorkExceptions;

public class ArithmeticExceptionTask {
    public static void main(String[] args) {
        int n = 0;
        if (n == 0 && n == 1) {
            throw new ArithmeticException();
        }
        if (n % 1 == n && n % n == 1) {
            System.out.println(n);
        } else {
            throw new ArithmeticException();
        }

    }
}

