package p1;

import java.util.Objects;

public class People {

    private String name;
    private int id;

    public People(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 5 + name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id == people.id && Objects.equals(name, people.name);
    }
}
