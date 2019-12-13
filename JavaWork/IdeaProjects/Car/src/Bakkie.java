public class Bakkie extends Car {

    public Bakkie(String color) {
        super(color);
        System.out.println("The color of Bakkie is: "+color);
    }


    @Override
    public int drive() {

        System.out.println("The position of Bakkie it is: ");
        int driv =  3;
        return driv;
    }
}
