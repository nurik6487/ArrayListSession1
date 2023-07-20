import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        Scanner words = new Scanner(System.in);

        List<Person> human = new ArrayList<>();
        human.add(new Person(1L, "Nursultan", "Mamatkulov", 16));
        human.add(new Person(2L, "Robert", "Denz", 17));
        human.add(new Person(3L, "Alfred", "Dayle", 18));
        mainMenu();
        System.out.print("enter here: ");
        int choose = 0;
        while (choose!=6){
            choose = integer.nextInt();
            if (choose==1){
                System.out.print("first name: ");
                String name = words.nextLine();
                System.out.print("last name: ");
                String surname = words.nextLine();
                System.out.print("age: ");
                int age = integer.nextInt();
                human.add(new Person(human.size()+2L,name,surname,age));
                System.out.println("person with name: "+name+" has successfully saved!!");
            }
            if (choose==2){
                System.out.print("which id?: ");
                int randomId = integer.nextInt();
                human.removeIf(person -> person.getId() == randomId);
            }
            if (choose==5){
                human.forEach(System.out::println);
            }
            if (choose==3){
                System.out.print("which id?: ");
        int randomId = integer.nextInt();
        for (Person person:human) {
            if (person.getId()==randomId){
                System.out.println("id: "+person.getId()+" , first name: "+person.getFirst_name()+" , last name: "+person.getLast_name()+" , age: "+person.getAge());
            }
        }
    }
            if (choose == 4){
        human.clear();
        System.out.println("DROPPED");


    }
}



    }

public static void mainMenu(){
        System.out.println("1 -> add new person");
        System.out.println("2 -> delete person");
        System.out.println("3 -> get person by id");
        System.out.println("4 -> truncate");
        System.out.println("5 -> find all");
        System.out.println("6 -> stop");
    }
}