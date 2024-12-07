package project.hw7;

class Allterrainvehicle implements Transport {
    private int petrol;

    public Allterrainvehicle(int petrol){
        this.petrol=petrol;
    }

    @Override
    public boolean canMove(Terrain terrain) {
        return true;
    }

    @Override
    public boolean move (Terrain terrain, int distance) {
        if (petrol >= distance * 2) {
            petrol -= distance * 2;
            System.out.println("Вездеход проехал " + distance + " км по " + terrain.getName() + ". Осталось топлива: " + petrol + " л");
            return true;
        }
        else {
            System.out.println("Вездеход не может проехать, недостаточно бензина");
            return false;
        }
    }

        @Override
        public String getType() {
            return "Вездеход";
        }
}



