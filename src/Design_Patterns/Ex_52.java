// Decorator Pattern

/* The Decorator pattern allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class. */
package Design_Patterns;

public class Ex_52 {

    public interface Car { void assemble(); }

    public static class BasicCar implements Car
    { public void assemble() { System.out.println("Basic Car."); } }

    public static class CarDecorator implements Car
    {
        protected Car decoratedCar;

        public CarDecorator(Car c) { this.decoratedCar = c; }
        public void assemble() { this.decoratedCar.assemble(); }
    }

    public static class SportsCar extends CarDecorator
    {
        public SportsCar(Car c) { super(c); }
        public void assemble() {
            super.assemble();
            System.out.println("Adding features of Sports Car.");
        }
    }

    public static class LuxuryCar extends CarDecorator
    {
        public LuxuryCar(Car c){ super(c); }
        public void assemble(){
            super.assemble();
            System.out.println(" + Luxury Features");
        }
    }

    public static void main(String[] args) {
        Car sportCar = new SportsCar(new BasicCar());
        sportCar.assemble();
        System.out.println();

        Car fullOption = new LuxuryCar(new SportsCar(new BasicCar()));
        fullOption.assemble();
    }
}
