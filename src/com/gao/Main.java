package com.gao;

public class Main {

    public static void print(int index,Object object){
        System.out.println(String.format("{%d},%s",index,object.toString()));
    }

    public static void  demoControlFlow(){
        int a = 4;
        int target = a == 2 ? 1 : 3;//三目运算符相当于if else
        print(1,target);

        String grade = "B";
        switch (grade){
            case "A":
                print(3,">80");
                break;
            case "B":
                print(4,"60-80");
                //break;
            case "C":
                print(5,"<60");
                break;
            default:
                print(6,"未知");
                break;
        }

        int score = 60;
        while (score < 100) {
            print(7,score);
            score += 20;
        }
    }

    public static void main(String[] args) {
        demoControlFlow();
    }
}
