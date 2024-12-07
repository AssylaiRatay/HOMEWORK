package project.hw7;

class Human {

    private String name;
    private Transport currentTransport;

    public Human(String name){
        this.name=name;

    }

    public void sitOnTransport(Transport transport){
        if (currentTransport != null) {
            System.out.println(name + " уже использует транспорт: " + currentTransport.getType());
        }
        else {
            currentTransport = transport;
            System.out.println(name + " сел на " + transport.getType());

        }
    }

    public void getOffTransport () {
        if (currentTransport != null) {
            System.out.println(name + " слез с транспорта: " + currentTransport.getType());
            currentTransport = null;
        }
        else {
            System.out.println(name + " не использует транспорт.");
        }
    }

    public boolean move(Terrain terrain, int distance) {
        if (currentTransport != null) { // Проверяем, что есть транспорт
            boolean success = currentTransport.move(terrain, distance); // Вызываем move() у currentTransport
            if (success) {
                System.out.println(name + " успешно переместился на " + currentTransport.getClass().getSimpleName() + " по местности: " + terrain);
            } else {
                System.out.println(name + " не смог переместиться на " + currentTransport.getClass().getSimpleName() + " по местности: " + terrain);
            }
            return success;
        } else {
            System.out.println(name + " идет пешком " + distance + " км по местности: " + terrain);
            return true;
        }
    }






}
