package p2;

public class Main {

    public static void main(String[] args) {
        Client<Integer> client = new Client(1, 50000);
        int clientId = (int)client.getId();
        System.out.println(clientId);

        Client<String> client1 = new Client("ss676nj", 50000);
        System.out.println(client1.getId());

        Client<String> client2 = new Client("1234", 50000);
        String clId = client2.getId();
        System.out.println(clId);



    }

}
