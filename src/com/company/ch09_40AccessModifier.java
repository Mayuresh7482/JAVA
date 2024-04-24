package com.company;

class CEmpolyee {
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public  int getId(){
        return id;
    }
    public void  setId(int i){
        id = i;
    }
}

public class ch09_40AccessModifier {
    public static void main(String[] args) {
        CEmpolyee Mayu = new CEmpolyee();
        /*Mayu.id = 420;
        Mayu.name = "Mayuresh";*/

        Mayu.setName("Mayuresh");
        System.out.println(Mayu.getName());
        Mayu.setId(420);
        System.out.println(Mayu.getId());
    }
}
