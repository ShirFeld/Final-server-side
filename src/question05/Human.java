package question05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Human {
    public String fullName;
    public List<Human> descendants = new ArrayList<>();

    public Human(String fullName) {
        this.fullName = fullName;
    }

    public Human(String fullName, Human ancestor) {
        this(fullName);
        ancestor.descendants.add(this); //the parent add the child to his list.

    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", descendants=" + descendants +
                '}';
    }



    public static void main(String[] args) {
        final List<String> names= Arrays.asList("Alex","Bob","Charlie");
        final List<Integer> numbers= Arrays.asList(100,200,300);


        for (Integer i:numbers.stream().filter(x -> x>200 && x<=250).collect(Collectors.toList())) {
            System.out.println(i);
        }

        List<Integer> numbers2= Arrays.asList(100,200,300);
        System.out.println("Before change = "+numbers2);
        numbers2 = numbers2.stream().map(num -> num*10).collect(Collectors.toList());
        System.out.println("After change = "+numbers2);

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        int index = 0;
        for(String name : names) {
            System.out.print( "( " + (index++) +" , " +  name + " ) ");
        }
        System.out.println();
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        Human h1 = new Human("shir");
        Human h2 = new Human("david" , h1);
        System.out.println(h1);
        System.out.println(h2);
    }
}
