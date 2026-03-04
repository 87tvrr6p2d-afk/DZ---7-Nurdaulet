public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    // hook override: user can refuse condiments
    @Override
    protected boolean customerWantsCondiments() {
        return askYesNo("Do you want sugar and milk?");
    }
}
