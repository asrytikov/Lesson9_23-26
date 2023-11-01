package p6;

public class Main {

    public static void main(String[] args) {
        Client<String, Double> client = new Client("1234", 50000.99);
        String id = client.getId();
        Double sum = client.getSum();
        System.out.println(id + " " + sum);
    }
}
