package Ass6.appHouse;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();


        director.setBuilder(new WoodHouse());
        House house = director.buildHouse();

        System.out.println("Wood " + house);


        director.setBuilder(new StoneHouse());
        House house1 = director.buildHouse();
        System.out.println("Stone "+house1);


        director.setBuilder(new DiamondHouse());
        House house2 = director.buildHouse();
        System.out.println("Diamond "+house2);
    }
}
