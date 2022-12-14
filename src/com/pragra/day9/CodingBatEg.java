package com.pragra.day9;

public class CodingBatEg {
    public static void main(String[] args) {
        //new CodingBatEg().helloName("bob");
        //new CodingBatEg().makeTags("i", "Yay");
        //new CodingBatEg().hasBad("nba");
        //System.out.println(new CodingBatEg().lastTwo("a"));
        //System.out.println(new CodingBatEg().frontAgain("edited"));
        //System.out.println(minCat("hello","hi"));
       // System.out.println(without2("xx"));
       // System.out.println(deFront("abccd"));
        //System.out.println(startWord("hippo","i"));
        System.out.println(withoutX("xhix"));

    }

    public String helloName(String name) {
        String s1 = "Hello  ";
        s1 = s1.concat(name).concat("!");
        System.out.println(s1);
        return s1;
    }

    public String makeTags(String tag, String word) {
        //String s = "<"+tag+">"+word+"</"+tag+">";
        // System.out.println(s);
        //return s;
        return "<" + tag + ">" + word + "</" + tag + ">";
    }


    /*public boolean hasBad(String str) {

        if (str.equals("ba") || str.equals("") || str.equals("xba")) {
            return false;
        } else if ((str.substring(0, 3).equals("bad")) || (str.substring(1, 4).equals("bad")) || str.equals("bad")) {
            return true;
        } else {
            return false;
        }
    }*/
    public String lastTwo(String str) {
        String s = str.substring(str.length() - 2, str.length() - 1);
        String s2 = str.substring(str.length() - 1);
        if (str.length() > 4) {
            return str.substring(0, str.length() - 2) + s2 + s;

        } else {
            return s2 + s;
        }
    }

    public boolean frontAgain(String str) {
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        } else {
            return false;
        }
    }

    /*public static String minCat(String a, String b) {
        if (a.length() > b.length()) {
                return a.substring(b.length()+1).concat(b);
            }
        else if (a.length() < b.length()) {
                return a + b.substring(a.length()+1);
            }
        else if()
         else {
            return a.concat(b);
        }
    }
    public static String without2(String str) {

        if ((str.length() > 3) && (str.substring(0, 2).equals(str.substring(str.length() - 2)))) {
            return str.substring(2);
        } else if ((str.length() > 3) && ((str.substring(0, 2)) != (str.substring(str.length() - 2)))) {
            return str;
        } else if ((str.length() <= 3) && (str.substring(0, 1).equals(str.substring(str.length() - 1)))) {
            return str.substring(1);
        }
        else{
            return "";
        }*/

        public static String deFront(String str){
            if(str.charAt(0)!='a'&&str.charAt(1)!='b'){
                return str.substring(2);
            }
            else if(str.charAt(0)=='a'&&str.charAt(1)!='b'){
                return str.substring(0,1)+str.substring(2);
            }
            else if(str.charAt(0)!='a'&&str.charAt(1)=='b'){
                return str.substring(1);
            }
            else{
                return str;
            }


        }
    public  String startWord(String str, String word) {
        if((str.length()>=word.length())&&str.substring(0,2).equals(word)){
            return word;
        }
        else if((str.length()>=word.length())&&str.substring(1,3).equals(word.substring(1))){
            return str.substring(0,word.length());
        }
        else if((str.length()>=word.length())&&str.substring(1).equals(word.substring(1))){
            return str;
        }
        else if((str.length()>=word.length())&&str.substring(1,2).equals(word.substring(1))){
            return str.substring(0,2);
        }
        else if(word.length()==1){
            return str.substring(0);

        }


        else {
            return "";
        }
    }
    public static String withoutX(String str) {
        if((str.substring(0,1).equals('x'))&&(str.substring(str.length()-1).equals('x'))){
            return (str.substring(1,str.length()-1));
        }
        else{
            return str;
        }
    }

}


