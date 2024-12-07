package project.hw7;

public class MainApp {
    public static void main(String[] args) {
        Human human = new Human("Алексей");

        Transport car = new Car(50);
        Transport horse = new Horse(30);
        Transport bicycle = new Bicycle(0);
        Transport atv = new  Allterrainvehicle(40);

        human.move(Terrain.fromString("равнина"), 10); // Пешком
        human.sitOnTransport(car);
        human.move(Terrain.fromString("равнина"), 20); // Машина
        human.move(Terrain.fromString("густой лес"), 10); // Машина, запрет
        human.getOffTransport();

        human.sitOnTransport(horse);
        human.move(Terrain.fromString("равнина"), 15); // Лошадь
        human.move(Terrain.fromString("болото"), 10); // Лошадь, запрет
        human.getOffTransport();

        human.sitOnTransport(bicycle);
        human.move(Terrain.fromString("равнина"), 10); // Велосипед
        human.getOffTransport();

        human.sitOnTransport(atv);
        human.move(Terrain.fromString("густой лес"), 10); // Вездеход
        human.move(Terrain.fromString("болото"), 20); // Вездеход
    }
}
