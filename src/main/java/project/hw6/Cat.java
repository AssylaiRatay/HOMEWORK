package project.hw6;

public class Cat {

    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public void eat(Plate plate) {
        if (isFull) { // Если кот уже сыт
            System.out.println(name + " уже сыт и не ест.");
            return;
        }

        if (plate.decreaseFood(appetite)) { // Если еды в тарелке достаточно
            isFull = true; // Кот становится сытым
            System.out.println(name + " поел и теперь сыт.");
        } else { // Если еды недостаточно
            System.out.println(name + " не смог поесть. Еды недостаточно.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isFull=" + isFull +
                '}';
    }

}
