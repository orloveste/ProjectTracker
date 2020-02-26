package Rusi_26_02_2020;

public class Game {
    private String publisher;
    private String name;

    public void setName(String name) {
        this.name = name;

    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Game{" +
                "publisher='" + publisher + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
