public class RaceCar extends Car {

    public RaceCar(String color) {
        super(color);

        System.out.println("the color of RaceCar is: "+color+"\n");
    }

    @Override
    public int drive() {

        System.out.println("And the position of RaceCar is: ");
         int drive = super.drive() + 7;
        return drive;
    }
}
