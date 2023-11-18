package main.who;

public class Main {
    public static void main(String[] args) {

      Fish dory = new Fish();
      Ship titanic = new Ship();
      SinkTo sinkTo = new SinkTo();
      SwimTo swimTo = new SwimTo();

      sinkTo.makeSink(dory);
      swimTo.MakeSwim(titanic);
      sinkTo.makeSink(titanic);
      }
}