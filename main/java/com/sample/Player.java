package com.sample;

import java.util.Scanner;
public class Player
{
private String name;
private String team;
private int jerseyNumber;
//-----------------------------------------------------------
// Prompts for and reads in the player's name, team, and
// jersey number.
//-----------------------------------------------------------
public void readPlayer()
{
Scanner scan = new Scanner(System.in);
System.out.print("Name: ");
name = scan.nextLine();
System. out. print ("Team: ");
team = scan.nextLine();
System.out.print("Jersey number: ");
jerseyNumber = scan.nextInt();
}

/*
public boolean equals(Player player) {

        boolean status = false;

        if (this == player)
        	status = true;
        //if (this.name.equals(player.name) &&  this.team.equals(player.team) && this.jerseyNumber == (player.jerseyNumber)) {

           // if (this.team.equals(player.team)) {

             //   if (this.jerseyNumber == (player.jerseyNumber)) {

                   // status = true;

               // }

            //}

        //}

        return status;

    }

*/
}