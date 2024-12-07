package project.hw7;

class Bicycle implements Transport {
    private int riderStamina; // Сила водителя

    public Bicycle(int riderStamina) {
        this.riderStamina = riderStamina;
    }
    @Override
    public boolean canMove(Terrain terrain) {
        if (terrain != Terrain.SWAMP) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean move( Terrain terrain, int distance) {
        // Усталость: 1 единица силы на каждые 2 км
        if (canMove(terrain) && riderStamina >= distance / 2) {
            riderStamina -= distance / 2;
            System.out.println("Велосипед проехал " + distance + " км по " +  terrain.getName() + ". Осталось сил водителя: " + riderStamina + ".");
            return true;
        }
        else {
            System.out.println("Велосипед не может двигаться по местности: " + terrain.getName() + " или Водитель устал.");
            return false;
        }
    }

    @Override
    public String getType() {
        return "Велосипед";
    }
}
