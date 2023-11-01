package p1;

public class Main {
    public static void main(String[] args) {
        People people = new People(1,"Alex");
        People people1 = new People(123, "Alex");
        System.out.println(people.toString());
        System.out.println(people.hashCode());
        System.out.println(people.equals(people1));

        Object o1 = new Object();
        System.out.println(people.getClass());


    }
}