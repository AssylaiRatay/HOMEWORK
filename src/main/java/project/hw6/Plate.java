package project.hw6;

class Plate {

    private int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(int amount) {
        if (currentFood + amount > maxFood) {
            currentFood = maxFood;
            System.out.println("Еда добавлена, но тарелка переполнилась. Текущее количество еды установлено на максимум: " + maxFood);
        }
        else {
            currentFood += amount;
            System.out.println("Еда успешно добавлена. Текущее количество еды: " + currentFood);
        }
    }

    public boolean decreaseFood(int amount) {
        if (amount > 0) {
            if (currentFood >= amount) {
                currentFood -= amount;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "currentFood=" + currentFood +
                ", maxFood=" + maxFood +
                '}';
    }


}





