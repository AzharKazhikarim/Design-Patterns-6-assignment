package Ass6.appHouse;

public class DiamondHouse extends HouseBuilder{
    @Override
    void buildWalls() {
        house.setWalls(4);
    }

    @Override
    void buildDoors() {
    house.setDoors(6);
    }

    @Override
    void buildWindows() {
    house.setWindows(8);
    }

    @Override
    void buildRoofs() {
        house.setRoof(1);  //because expensive :D
    }
    @Override
    void buildGarage() {
        house.setGarage(1);
    }
}
