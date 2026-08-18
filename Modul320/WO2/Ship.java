package Modul320.WO2;

public class Ship {
    private int nr;
    private String name;
    private int time;

    public int getNr() {
        return nr;
    }

    public Ship(int nr, String name) {
        this.name = name;
        this.nr = nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void race() {

    }
}
