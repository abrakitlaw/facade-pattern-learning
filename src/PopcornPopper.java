public class PopcornPopper implements Stateable {

    @Override
    public void on() {
        System.out.println("Popcorn popper is ON");
    }

    @Override
    public void off() {
        System.out.println("Popcorn popper is OFF");
    }

    public void pop() {
        System.out.println("Popcorn popper is POP");
    }
}
