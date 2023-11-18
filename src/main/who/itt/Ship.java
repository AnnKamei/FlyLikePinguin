package main.who.itt;

import main.who.moves.Sinking;
import main.who.moves.Swimming;

public class Ship implements Sinking, Swimming {
    @Override
    public void sink() {
        System.out.println("Корабль тонет навсегда.");
    }

    @Override
    public void swim() {
        System.out.println("Корабль ходит по морям, а не плавает в воде.");
    }
}
