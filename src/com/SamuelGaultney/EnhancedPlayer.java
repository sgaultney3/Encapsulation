package com.SamuelGaultney;

/**
 * Created by Samuel on 2/16/2017.
 */
public class EnhancedPlayer {

    private String name;   //by making it private, we are encapsulating to prevent these fields from being
    //accessed externally
    private int hitpoints = 100; //changed this from health to hitpoints using right click -> refactor-> change name
    //this does not effect how the code is called so long as the getter isnt changed
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.hitpoints = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitpoints = this.hitpoints - damage;
        if(this.hitpoints <= 0) {
            System.out.println("player knocked out");
            //reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitpoints;
    }
}
