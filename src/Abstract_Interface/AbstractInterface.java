package Abstract_Interface;


abstract class animal{
    abstract void eat();
}

interface pet{
    void play();
}

class dog extends animal implements pet{
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
    public void play() {
        System.out.println("Dog is playing");
    }
}
public class AbstractInterface {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.play();

    }

}
