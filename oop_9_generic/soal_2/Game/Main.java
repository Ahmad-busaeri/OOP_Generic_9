package oop_9_generic.soal_2.Game;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Tank tigril=new Tank("Tigril");
        Tank franco=new Tank("Franco",2700,120,25);
        Tank akai=new Tank("Akai",2800,110,20);

        Marksman clint=new Marksman("Clint");
        Marksman lesley=new Marksman("Lesley",2400,150,14);
        Marksman bruno=new Marksman("Bruno",2500,140,17);

        ArrayDeque<Marksman> heroMarksman=new ArrayDeque<Marksman>();
        ArrayDeque<Tank> heroTank=new ArrayDeque<Tank>();

        heroTank.add(tigril);
        heroTank.addFirst(franco);
        heroTank.add(akai);

        heroMarksman.add(clint);
        heroMarksman.add(lesley);
        heroMarksman.addFirst(bruno);

        System.out.println("Hero-hero Tank : ");
        for(Tank tank: heroTank){
            tank.infoHero();
        }
        System.out.println("");
        System.out.println("Hero-hero Marksman :");
        for(Marksman mm: heroMarksman){
            mm.infoHero();
        }
    }
}
