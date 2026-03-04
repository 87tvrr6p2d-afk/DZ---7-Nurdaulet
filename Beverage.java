import java.util.Scanner;

public abstract class Beverage {

    // Template method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        System.out.println("Done!\n");
    }

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // steps to customize
    protected abstract void brew();
    protected abstract void addCondiments();

    // Hook (can be overridden)
    protected boolean customerWantsCondiments() {
        return true;
    }

    // helper: validated input (y/n)
    protected boolean askYesNo(String question) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(question + " (y/n): ");
            String ans = sc.nextLine().trim().toLowerCase();
            if (ans.equals("y") || ans.equals("yes")) return true;
            if (ans.equals("n") || ans.equals("no")) return false;
            System.out.println("[Error] Please type y/n.");
        }
    }
}
