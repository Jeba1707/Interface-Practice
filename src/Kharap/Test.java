package SelfStudy.Kharap;

public class Test {

    public static void main(String[] args) {
        Vaggo vaggo = new Vaggo();
        Future future = new Future();
        Grades grades = new Grades();
        Jibon jibon = new Jibon();
        Mon mon = new Mon();
        Mood mood = new Mood();
        Shorir shorir = new Shorir();
        Skin skin = new Skin();

    Person p1 = new Person("Jeba",vaggo);
        System.out.println(p1.toString());
    Person p2 = new Person("Tasnim",grades);
        System.out.println(p2.toString());

    }

}