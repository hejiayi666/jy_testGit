package com.jy;

public class testGit {

    public static void main(String[] args) {
        System.out.println("噶一测试版本第一次");
        hejiayi he = new hejiayi("贺甲一",18);
        System.out.println("名字："+he.getName()+",年龄:"+he.getAge());
        System.out.println("噶一测试版本第二次 再次");
        he.setName("噶一");
        System.out.println("名字："+he.getName());

    }
}
