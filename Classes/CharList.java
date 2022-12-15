package Classes;
import Enums.*;
import java.util.ArrayList;
import java.util.Random;


public class CharList {
    ArrayList<Character> HeroList;
    ArrayList<Character> PersList;
    static Random rand = new Random();

    public CharList(){
        this.HeroList = setCharacters();
        this.PersList = getPeople();
    }

    public void reset(){
        this.HeroList.clear();
        this.HeroList = setCharacters();
    }

    public ArrayList<Character> setCharacters(){
        ArrayList<Character> hero = new ArrayList<Character>();
        for(dps dps : dps.values()){
            hero.add(new Character(dps.toString(), "Dps"));
        }
        for(support sup : support.values()){
            hero.add(new Character(sup.toString(), "Support"));
        }
        for(tanks tank : tanks.values()){
            hero.add(new Character(tank.toString(), "Tank"));
        }
        return hero;
    }

    public ArrayList<Character> getPeople(){
        ArrayList<Character> peoples = new ArrayList<Character>();
        for(people name : people.values()){
            peoples.add(new Character(name.toString()));
        }
        return peoples;
    }

    public Character getHero(){
        return HeroList.get(rand.nextInt(HeroList.size()));
    }

    public Character getPers(){
        return PersList.get(rand.nextInt(PersList.size()));
    }

    public String Roll(){
        if(HeroList.size() > PersList.size()){
            String buildString = "";
            for (Character character : PersList) {
                buildString += character.printChar();
                Character Hero = getHero();
                buildString += Hero.printChar();
                buildString += "\n";
                HeroList.remove(Hero);
            }
            return(buildString);
        }
        else{
            return "Reset Characters";
        }
    }
    
}
