package Kharap;


import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name ;
    private List<Kharap> kharapList;

    public Person(String name, Kharap ... kharap) {
        this.name = name;

       setKharap(kharap);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Kharap> getKharap() {
//        for(Kharap k : kharapList) {
//            return k;
     //  }
        return kharapList;
    }

    public void setKharap(Kharap ... kharap) {
        this.kharapList =new ArrayList<>();
        for (Kharap k :kharap)
       kharapList.add(k);
    }
    public String kharap(List<Kharap> kharapList){
        String a = "";
        for(Kharap k : kharapList){
            a = a+" "+k.kharap() ;
        }
return a;
    }

    @Override
    public String toString() {
        return   name + " er" +kharap(kharapList);

    }
}
