//1

public abstract class Vehicule {

//2
    
    private String brand;
    private int kilometers;

//3
    
    public Vehicule(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

//4	
    
    public String getBrand() {
        return this.brand;
    }
    public void setName(String brand) {
        this.brand = brand;
    }
    public int getKilometers() {
        return this.kilometers;
    }
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
    
//7
    
    public abstract String doStuff();
}