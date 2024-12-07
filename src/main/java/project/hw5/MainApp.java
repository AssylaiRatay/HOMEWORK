package project.hw5;

import project.hw5.animals.Animal;
import project.hw5.animals.Cat;
import project.hw5.animals.Dog;
import project.hw5.animals.Horse;

public class MainApp { public static void main(String[] args) {

    Animal cat = new Cat("Барсик ", 15, 50);
    cat.info();
    cat.run(30);
    cat.run(25);
    cat.swim(10);
    cat.info();

    Animal dog = new Dog("Шарик",20,25,50);
    dog.info();
    dog.run(20);
    dog.run(15);
    dog.swim(15);
    dog.info();


    Animal horse = new Horse ("Пушок",30,30,100);
    horse.info();
    horse.run(35);
    horse.run(25);
    horse.swim(20);
    horse.info();




 }
}

