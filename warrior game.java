package com.company;

public class MyGame {

    public static void main(String[] args) {
        Warrior warrior01 = new Warrior("Fenyr", 30);
        Warrior warrior02 = new Warrior("Lykan", 45);
        Monster monster = new Monster("Centenario", 100);

        warrior01.age = monster.age;

        monster.stealstick(warrior02);

    }
}
 public class Warrior{
    String  name;
    int age;
    
    public Warrior(String name, int age){
        this.name = name;
        this.age = age;
        Havestick(true);
    }
    public Havestick(boolean stick){
        if(stick == true){
            walk();
        }
        elase{
            fail();
        }
    }
    public walk(){
        System.out.println("Warrior" + this.name + "is alive and walking");
    }
    public fail(){
        System.out.println("Warrior" + this.name + "has lost his stick and immobile");
    }
 }
 public class Monster{
    String name;
    int age;
    
    public Monster(String name, int age){
        this.name = name;
        this.age = age;
        
    }
    public stealstick(Warrior warrior){
        System.out.println("Monster" + this.name + "has stolen Warrior" + warrior.name + "'s walking stick");
        warrior.Havestick(false);
    }
 }