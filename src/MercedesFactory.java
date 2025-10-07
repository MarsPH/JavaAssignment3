class TruckFactory extends AbstractFactory{
     @Override
     Volvo makeVolvo() {
         return new TruckVolvo();   // swapped
     }

     @Override
     Mercedes makeMercedes() {
         return new TruckMercedes(); // swapped
     }
}
