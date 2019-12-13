public class Car {

    String color;
    int position = 0;

    public Car(String color){
        this.color = color;
    }

    public int drive(){
        return position++;
    }

    public static void main(String[] args){
        Car  bakkie = new Bakkie("Red");
        Car racecar = new RaceCar("white");
        System.out.println(bakkie.drive());
        System.out.println(racecar.drive());
    }
}
