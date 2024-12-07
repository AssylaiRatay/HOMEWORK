package project.work;

public class BracketUtil {
    public static boolean isCorrectBrackets(String input, char bracketOpenSymbol, char bracketCloseSymbol) {
        int balance = 0; // Счётчик баланса скобок

        // Проходим по всем символам строки
        for (char c : input.toCharArray()) {
            // Если символ является открывающей скобкой, увеличиваем счётчик
            if (c == bracketOpenSymbol) {
                balance++;
            }
            // Если символ является закрывающей скобкой, уменьшаем счётчик
            else if (c == bracketCloseSymbol) {
                balance--;

                // Если баланс стал отрицательным, это значит, что закрывающая скобка
                // встретилась до открывающей, что делает строку некорректной
                if (balance < 0) {
                    return false;
                }
            }
        }

        // В конце, если баланс равен нулю, скобки корректно расставлены
        return balance == 0;
    }

    private BracketUtil() {
    }

    public static void main(String[] args) {
        System.out.println("Ввод равного количества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}", '{', '}')); // true
        System.out.println("Ввод неравного количества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}}", '{', '}')); // false
        System.out.println("Случай со скобками () - "
                + BracketUtil.isCorrectBrackets("(())", '(', ')')); // true
        System.out.println("Случай с неправильной последовательностью - "
                + BracketUtil.isCorrectBrackets("(()))", '(', ')')); // false
    }
}

