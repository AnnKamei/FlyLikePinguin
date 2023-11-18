package main.who.itt;

import main.who.moves.Sinking;
import main.who.moves.Swimming;

public class Fish implements Sinking, Swimming {
    @Override
    public void sink(){
        hiding();
        System.out.println("Хорошо что рыбка воде утонуть не может.");
        }
    private void hiding() {
        System.out.println("Рыбка любит затаиться на дне под водой.");
    }
    @Override
    public void swim(){
        System.out.println("Все рыбы хорошо плавают в воде");
    }
    }

