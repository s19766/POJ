/**
 * @author Rafał Sochacki s20047
 * @author Damian Egert s19766
 */
public class DemoTurners2 {
    public static void main(String[] args) {
        //DemoTurner
        Page page = new Page();
        Pancake pancake = new Pancake();
        Leaf leaf = new Leaf();

        //DemoTurner2
        Sun sun = new Sun();
        Grass grass = new Grass();

        //DemoTurner
        page.turn();
        pancake.turn();
        leaf.turn();

        //DemoTurner2
        sun.turn();
        grass.turn();
    }
}
