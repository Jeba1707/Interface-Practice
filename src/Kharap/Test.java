package Kharap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        List<Kharap> list = Arrays.asList(vaggo,future,grades,jibon,mon,mood,shorir,skin);
        System.out.println(skin.toString());
    Person p1 = new Person("Jeba",vaggo);
        System.out.println(p1.printKharap());
    Person p2 = new Person("Tasnim",grades,mon,jibon);
        System.out.println(p2.printKharap());
        Person p3 = new Person("Sanjida",mood,mon,skin,vaggo,grades);
        p3.addKharap(future);
        System.out.println(p3.printKharap());

        Person p = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");
        String name = sc.nextLine();
        p.setName(name);
        System.out.print(name+" er Ki ki Kharap ? among these (vaggo,future,grades,jibon,mon,mood,shorir,skin) \nEnter with space:");
        String k = sc.nextLine();
        String[] ss = k.split(" ");
        for (Kharap kk :list) {
for(String s :ss){
            if (s.equalsIgnoreCase(kk.toString())){
p.addKharap(kk);
            }
        }}
        System.out.println(p.printKharap());
    }

}
