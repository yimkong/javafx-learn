package propertiessheet;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;


public class Person {
    int age;
    boolean isLive = true;
    String name = "Yimkong";
    SimpleStringProperty sex = new SimpleStringProperty("man");

    void addListener(ChangeListener listener){
        sex.addListener(listener);
    }

    public String getSex() {
        return sex.get();
    }

    public void setSex(String sex) {
        this.sex.set(sex);
    }

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
