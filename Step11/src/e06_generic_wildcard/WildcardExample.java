package e06_generic_wildcard;

import java.util.*;

public class WildcardExample {
    public static void printList(List<? super Person> list) {
        for (Object obj : list) {
            System.out.println(obj.getClass().getName());

        }
    }

    public static void printAnimal(List<? extends Animal> list){
//    	list.add(new Animal());
        for (Animal a : list ){
            a.eat();
        }
    }
    
    public static void printObject(List<?> list) {
    	for (Object object : list) {
			System.out.println(object);
		}
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());
        animalList.add(new Animal());
        animalList.add(new Animal());
        animalList.add(new Animal());
        animalList.add(new Animal());

        printList(animalList);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person());
        personList.add(new Person());
        personList.add(new Person());
        personList.add(new Person());
        personList.add(new Person());

        printList(personList);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());
        dogList.add(new Dog());
        dogList.add(new Dog());
        //printList(dogList);

        printAnimal(animalList);
        printAnimal(personList);
        //printAnimal(dogList);
        printObject(dogList);
    }
}
