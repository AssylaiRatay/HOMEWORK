package project.hw7;

enum Terrain {
    DENSE_FOREST("густой лес"),
    PLAINS("равнина"),
    SWAMP("болото");

    private final String name;

    Terrain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Метод для поиска по значению name
    public static Terrain fromString(String name) {
        for (Terrain terrain : Terrain.values()) {
            if (terrain.name.equalsIgnoreCase(name)) {
                return terrain;
            }
        }
        throw new IllegalArgumentException("Нет такого типа местности: " + name);
    }

    @Override
    public String toString() {
        return name;
    }


}




