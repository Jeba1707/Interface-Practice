package SelfStudy.Kharap;

public class Person {
    private String name ;
    private Kharap kharap ;

    public Person(String name, Kharap  kharap) {
        this.name = name;
        this.kharap = kharap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Kharap getKharap() {
        return kharap;
    }

    public void setKharap(Kharap kharap) {
        this.kharap = kharap;
    }

    @Override
    public String toString() {
        return   name + " er " +kharap.kharap();
    }
}
