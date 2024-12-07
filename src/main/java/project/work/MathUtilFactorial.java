package project.work;

public class MathUtilFactorial {
    public static long getFactorial(byte number) {
        if (number < 0) {
            return 0;
        } else if (number == 0) {
            return 1;
        }

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
            // Проверка на переполнение: если результат стал меньше 0, значит, произошел overflow
            if (result < 0) {
                return 0;
            }
        }
        return result;
    }

    private MathUtilFactorial() {
    }

    public static void main(String[] args) {
        System.out.println("Факториал от 5 должен равняться 120 - " + MathUtilFactorial.getFactorial((byte) 5));
        System.out.println("Факториал от -5 должен равняться 0 - " + MathUtilFactorial.getFactorial((byte) -5));
        System.out.println("Факториал от 20 (выход за пределы long) должен равняться 0 - " + MathUtilFactorial.getFactorial((byte) 20));
    }
}

