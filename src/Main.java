public class Main {
    public static void main(String[] args) {



       AbstractFactory factory =AbstractFactory.factory(Type.Truck);
       Mercedes truck = factory.makeMercedes();
       Volvo car =factory.makeVolvo();
       truck.display();
       car.display();

        factory =AbstractFactory.factory(Type.Car);
        truck = factory.makeMercedes();
        car =factory.makeVolvo();
        truck.display();
        car.display();

    }
}
