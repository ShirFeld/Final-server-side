package question05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Human {
    public String fullName;
    public static List<Human> humanList = new ArrayList<>();

    public Human(String fullName) {
        this.fullName = fullName;
        humanList.add(this);
    }

    @Override
    public String toString() {
        return "Human {" +
                "fullName='" + fullName + '\'' +
                '}';
   }

   public static void print(){
        if (humanList.size() >0)
            System.out.println(humanList);
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
        Human h2 = new Human("david");
        Human h3 = new Human("Michael");
        Human.print();
    }
}
