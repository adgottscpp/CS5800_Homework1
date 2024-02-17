import Aggregation.AggregationDriver;
import Composition.CompositionDriver;
import Inheritance.InheritanceDriver;
import Polymorphism.PolymorphismDriver;

public class Main {
    public static void main(String[] args) {
        System.out.printf("\n1) Inheritance\n");
        InheritanceDriver driver1 = new InheritanceDriver();
        System.out.printf("\n");

        System.out.printf("2) Polymorphism\n");
        PolymorphismDriver driver2 = new PolymorphismDriver();
        System.out.printf("\n");

        System.out.printf("3) Aggregation\n");
        AggregationDriver driver3 = new AggregationDriver();
        System.out.printf("\n");

        System.out.printf("4) Composition\n");
        CompositionDriver driver4 = new CompositionDriver();
    }
}