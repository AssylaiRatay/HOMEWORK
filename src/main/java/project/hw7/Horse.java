package project.hw7;

class Horse implements Transport {
    private int stamina;

    public Horse(int stamina){
        this.stamina = stamina;
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
    public boolean move(Terrain terrain, int distance){
        if (canMove(terrain) && stamina >= distance){
            stamina -= distance;
            System.out.println("Лошадь пробежала" + distance + "км по " + terrain.getName() + ". Осталось сил:" + stamina + ".");
            return true;
        }
        else {
            System.out.println("Лошадь не может двигаться по местности: " + terrain.getName() + " или недостаточно сил.");
            return false;
        }
    }

    @Override
    public String getType() {
        return "Лошадь";
    }

 }
