package Ass6.appHouse;

public class House {
    private int doors;
    private  int walls;
    private int  windows;
    private int roof;
    private int garage;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setRoof(int roof) {
        this.roof = roof;
    }

    public void setGarage(int garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "doors=" + doors +
                ", walls=" + walls +
                ", windows=" + windows +
                ", roof=" + roof +
                ", garage=" + garage +
                '}';
    }


}
