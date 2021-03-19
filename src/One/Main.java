package One;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Person,List<Pet>> club = new HashMap<>();

        List<Pet> pets1 = new ArrayList<>();

        List<Pet> pets2 = new ArrayList<>();
        pets2.add(new Pet("Anny"));
        pets2.add(new Pet("Def"));
        pets2.add(new Pet("Sange"));

        List<Pet> pets3 = new ArrayList<>();
        pets3.add(new Pet("Rex"));
        pets3.add(new Pet("Djina"));
        pets3.add(new Pet("Leyla"));

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person3.setName("Den");

        club.put(person3,pets3);
        int k=4;
        if(k==1){
            person1.setName("Alex");
            pets1.add(new Pet("Jujik"));
            club.put(person1,pets1);

        }else if(k==2){
            pets3.add(new Pet("Bobik"));
            club.put(person3,pets3);
        }else if(k==3){
           // club.replace(person3, new Pet(pets3.remove(1)); ???????
        }else if(k==4){
            club.remove(person3);
        }else if(k==5){
            pets3.remove(1);
        }else if(k==6){
            System.out.println(club);
        }

    }
}
