package com.SamuelGaultney;

/**
 * Created by Samuel on 2/16/2017.
 */
public class Player {

    public String fullname;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("player knocked out");
            //reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
