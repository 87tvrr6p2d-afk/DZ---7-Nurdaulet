public class HotChocolate extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Mixing cocoa powder with hot water");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding marshmallows");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return askYesNo("Do you want marshmallows?");
    }
}
