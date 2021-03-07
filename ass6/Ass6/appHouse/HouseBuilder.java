package Ass6.appHouse;

public abstract class HouseBuilder {
    House house;
    void houseCreate(){
        house = new House();
    }
    abstract void buildWalls();
    abstract void buildDoors();
    abstract void  buildWindows();
    abstract void buildRoofs();
    abstract void buildGarage();

    House getHouse(){
    return house;
    }

}
