package Ass6.appHouse;

public class Director {
    HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    House buildHouse() {
        builder.houseCreate();
        builder.buildWalls();
        builder.buildDoors();
        builder.buildWindows();
        builder.buildRoofs();
        builder.buildGarage();


        House house = builder.getHouse();
        return house;
    }

}
