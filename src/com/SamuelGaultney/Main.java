package com.SamuelGaultney;

public class Main {

    public static void main(String[] args) {

        //example of poor encapsulation

//        Player player = new Player();
//
//        //becuase the class accessed is set to public, the fields can be set from here
//        player.name = "Tim;"; //bacause player class was altered to fullname, making changes
//        //like this becomes a hastle going back and forth
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200; //problem is i can override like this and remove control from player class
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        //example of good encapsulation

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initital health is " + player.getHealth());

        //Challenge (Printer)
        Printer printer = new Printer(200, 4, false);
        printer.filltoner(30);
        printer.printPage(6);
        printer.printPage(8);

    }
}
