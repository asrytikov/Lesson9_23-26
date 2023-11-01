package p3;

public class Client implements Clientable<String> {

    private String id;
    private int sum;

    public Client(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
