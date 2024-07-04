package com.anand.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        for(int i = 0; i< 10;i++){
            personList.add(new Person((int)(Math.random() * 16 + 1), i));
        }
        Iterator<Person> iterator = personList.iterator();

        /*while(iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person);
            if(person.id == 4){
                personList.remove(person);
            }
        }*/
        LinkedList<Person> personList2 = new LinkedList<>(personList);
        //Queue or a Stack
        //Queue is like a lineup so First In First Out  (FIFO)
        //Stack lke a deck of cards Last In First Out (LIFO)

        System.out.println(personList2.peekFirst());
        System.out.println(personList2.peekLast());
        Person p = personList2.pollFirst();
        System.out.println(p);
        System.out.println(personList2.peekFirst());
        System.out.println(personList2.pollLast());
        System.out.println(personList2.peekLast());

    }
}