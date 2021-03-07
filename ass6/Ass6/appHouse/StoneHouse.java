package Ass6.appHouse;

public class StoneHouse extends HouseBuilder{
    @Override
    void buildWalls() {
        house.setWalls(4);
    }

    @Override
    void buildDoors() {
    house.setDoors(15);
    }

    @Override
    void buildWindows() {
    house.setWindows(20);
    }

    @Override
    void buildRoofs() {
    house.setRoof(4);
    }

    @Override
    void buildGarage() {
        house.setGarage(1);
    }

}
