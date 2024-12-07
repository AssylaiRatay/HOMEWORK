package project.work;
import java.math.BigInteger;

    public class FibonacciUtils {

        public static String getFibonacciSum(byte limit) {
            if (limit < 0) {
                return "0";
            }

            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;
            BigInteger sum = a;

            for (int i = 1; i < limit; i++) {
                sum = sum.add(b);
                BigInteger temp = a.add(b);
                a = b;
                b = temp;
            }

            return sum.toString();
        }

        private FibonacciUtils() {
            // Приватный конструктор, чтобы предотвратить создание экземпляров
        }

        public static void main(String[] args) {
            System.out.println("Сумма чисел Фибоначчи до 5 должна равняться 7 - " + FibonacciUtils.getFibonacciSum((byte) 5));
        }
    }


