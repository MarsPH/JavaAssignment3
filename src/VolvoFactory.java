class CarFactory extends AbstractFactory {

    @Override
     Volvo makeVolvo() {
      return  new CarVolvo() ; //call a builder
    }

    @Override
     Mercedes makeMercedes() {
      return   new CarMercedes();
    }
}
