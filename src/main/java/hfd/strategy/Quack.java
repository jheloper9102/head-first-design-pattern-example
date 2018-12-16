package hfd.strategy;

public class Quack implements Quackable {

    public static final String QUACK = "quack!!!";

    @Override
    public String quack() {
        return QUACK;
    }
}
