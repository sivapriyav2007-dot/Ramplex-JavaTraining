package day18.class_Task;

import java.util.HashMap;

public class HashMapMarksGrading {
    public static void main(String[] args){
        HashMap<String,Integer> markList=new HashMap<String,Integer>();
        markList.put("sp",20);
        markList.put("Sivapriya",19);
        markList.put("vsr",30);
        markList.put("vsrs",35);
        System.out.println(markList.entrySet());
    }
}
