package com.gao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void print(int index,Object object){
        System.out.println(String.format("{%d},%s",index,object.toString()));
    }

    public static void  demoControlFlow(){
        int a = 4;
        //int target = a == 2 ? 1 : 3;//三目运算符相当于if else
        //print(1,target);

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

    public static void demoList() {
        List<String> strList = new ArrayList<String>(10);
        for (int i = 0;i <4;++i){
            strList.add(String.valueOf(i*i));
        }
        print(1,strList);
        List<String> strListB = new ArrayList<String>();
        for (int i =0;i<4;++i){
            strListB.add(String.valueOf(i));
        }
        strList.addAll(strListB);
        print(2,strList);
        strList.remove(0);
        print(3,strList);
        strList.remove(String.valueOf(1));//删除值为1的
        print(4,strList);
        print(5,strList.get(1));//index=1

        Collections.reverse(strList);//倒叙
        print(6,strList);

        Collections.sort(strList);
        print(7,strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(8,strList);
        for (String obj : strList) {
            print(9,obj);
        }

        int[] array = new int[]{1,2,3};
        print(10,array[2]);
    }

    public static void demoMapTable() {
        Map<String , String> map = new HashMap<String ,String>();
        for (int i = 0;i<4;++i){
            map.put(String.valueOf(i),String .valueOf(i*i));
        }
        print(1,map);
        //C：map<int,int>::iterator it = map.begin()
        for (Map.Entry<String ,String> entry : map.entrySet()){
            print(2,entry.getKey() + "|" + entry.getValue());
        }
        print(3,map.values());
        print(4,map.keySet());
        print(5,map.get("2"));
        print(6,map.containsKey("D"));
        map.replace("2","45");
        print(7,map.get("2"));
    }

    public static void demoSet(){
        Set<String> strSet = new HashSet<String>();
        for (int i = 0; i < 5;++i){
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);
        strSet.remove(String.valueOf(1));
        print(2,strSet);
        print(3,strSet.contains(String.valueOf(1)));
        print(4,strSet.isEmpty());
        print(5,strSet.size());

        strSet.addAll(Arrays.asList(new  String[]{"e","A","c"}));
        print(6,strSet);
        for (String value : strSet) {
            print(7,value);
        }

    }

    public static void demoException() {
        try {
            int k = 2;
            //k = k / 0;
            if (k ==2) {
                throw  new  Exception("抛出异常");
            }
        }catch (Exception e) {
            print(2,e.getMessage());
        }finally {
            print(3,"finally");
            //是否异常都会走到finnally
        }
    }

    public static void demOO(){
        Animal a = new Animal("Jim",1);
        a.say();
        Animal human = new Human("Gao",24,"China");
        human.say();
    }

    public static void demoFunction() {
        Random random = new Random();
        //伪随机 是个迭代过程
        //random.setSeed(1);
        print(1, random.nextInt(1000));
        print(2,random.nextFloat());

        List<Integer> array = Arrays.asList(new Integer[]{1,2,3,4,5});
        Collections.shuffle(array);
        print(3,array);

        Date date = new Date();
        print(4,date);
        print(5,date.getTime());//距离1970年1月1日

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(6,df.format(date));

        print(7,UUID.randomUUID());
        print(8,Math.log(10));
        print(9,Math.max(10, 301));
        print(10,Math.min(0.2, 5));
        print(11,Math.ceil(10.1));
        print(12,Math.floor(10.1));
        print(13,Math.sqrt(16));
    }
    public static void main(String[] args) {
        demoFunction();
    }
}
