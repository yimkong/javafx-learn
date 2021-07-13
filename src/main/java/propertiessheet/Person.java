package propertiessheet;

import java.util.List;

public class Person {
    int age;
    boolean isLive = true;
    String name = "Yimkong";
    String graduatedFrom;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLive(boolean live) {
        isLive = live;
    }


}
