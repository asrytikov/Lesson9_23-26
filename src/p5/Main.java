package p5;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        String[] goods = {"TV", "Phone", "Oven", "Nout"};
        Integer[] integers = {1,2,3,4,5};
        client.<String>saleItem(goods);
        client.<Integer>saleItem(integers);
    }

}

class Client{
    public <T> void saleItem(T[] items){
        for (T item : items) {
            System.out.println(item);
        }
    }

}
