package Ass6.appHouse;

public class WoodHouse extends HouseBuilder{
    @Override
    void buildWalls() {
        house.setWalls(4);
    }

    @Override
    void buildDoors() {
    house.setDoors(5);
    }

    @Override
    void buildWindows() {
    house.setWindows(8);
    }

    @Override
    void buildRoofs() {
    house.setRoof(2);
    }

    @Override
    void buildGarage() {
        house.setGarage(1);
    }
}
