package com.syntax.reviewclass07;

public class Demo1 {
    public static void main(String[] args) {
        char[] arr={'a', 'b', 'c'};
        String str=new String(arr);
        System.out.println(str);

        int[] arr2={65,66,67,68,69};
        String str2=new String(arr2,0,3);
        System.out.println(str2);
    }
}
