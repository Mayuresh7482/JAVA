package com.company;

import java.util.Locale;

public class Strings_Methods {
    public static void main(String[] args) {
        String name = "Mayuresh";
        System.out.println(name);
//.length
        /*int value = name.length();
        System.out.println(value);
//lowercase
        String lstring = name.toLowerCase();
        System.out.println(lstring);
//uppercase
        String ustring = name.toUpperCase();
        System.out.println(ustring);*/
//Trim
        String nontrimStr = "    Mayur    ";
        /*System.out.println(nontrimStr);
        System.out.println(nontrimStr.trim());
        //.substring (uresh)
        System.out.println(name.substring(3));
        //int start end (yure)
        System.out.println(name.substring(2,6));
        //replace
        System.out.println(name.replace('e','i'));
        System.out.println(name.replace("esh","i"));
        //startwith
        System.out.println(name.startsWith("ma")); //false
        System.out.println(name.startsWith("Ma")); //true
        //endswith
        System.out.println(name.endsWith("esh")); //true
        System.out.println(name.endsWith("ish")); //false
        //charAt
        System.out.println(name.charAt(0)); //M
        System.out.println(name.charAt(5)); //e
        //indexof
        System.out.println(name.indexOf("s")); //6
        System.out.println(name.indexOf("y")); //2*/

        //indexof     0123456789101112
        String str = "HariHariHari";
        System.out.println(str);
        System.out.println(str.length()); //12
        System.out.println(str.indexOf("ri")); //2
        System.out.println(str.indexOf("ri",3)); //6
        //Last of index
        System.out.println(str.lastIndexOf("a")); // 9
        System.out.println(str.lastIndexOf("r",2)); // 2
        //equals
        //upper or lowercase both not ok
        System.out.println(name.equals("Mayuresh"));    //true
        System.out.println(name.equals("mayuresh"));    //false
        //upper or lowercase both ok
        System.out.println(name.equalsIgnoreCase("mayuresh")); //true

        System.out.println(str.equals("Hari"));         //false
        System.out.println(str.equals("HariHariHari")); //true
        //escape sequence
        System.out.println("this is an escape sequence \n double quote");
    }
}
