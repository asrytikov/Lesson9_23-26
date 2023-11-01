package p4;

public interface Clientable<T> {

    T getId();
    int getSum();
    void setSum(int sum);
}
