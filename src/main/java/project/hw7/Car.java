package project.hw7;

public class Car implements Transport {
    private int petrol;

    public Car(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean canMove(Terrain terrain) {
        if (terrain != Terrain.DENSE_FOREST) {
            if (terrain != Terrain.SWAMP) {
                return true;
            } else {
                return false; // Местность - болото
            }
        } else {
            return false; // Местность - густой лес
        }
    }

    @Override
    public boolean move(Terrain terrain, int distance) { // Изменен тип на void
        if (canMove(terrain) && petrol >= distance) {
            petrol -= distance;
            System.out.println("Машина проехала " + distance + " км по " + terrain.getName() + ". Осталось топлива: " + petrol + " л");
            return true;
        } else {
            System.out.println("Машина не может двигаться по местности: " + terrain.getName() + " или недостаточно топлива.");
            return false;
        }
    }

    @Override
    public String getType() {
        return "Машина";
    }
}
