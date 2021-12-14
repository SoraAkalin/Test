package StartProject;

import java.util.*;

public class Test {
//    @Test
//    @SuppressWarnings("all")

    public static class Person{
        String name;
        int age;
        Person(String name,int age){
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        // 创建Collection接口的实现
        Collection collection = new ArrayList<>();
        // 添加元素add()
        collection.add("嘻嘻");
        String src = "????";
        collection.add(src);
        System.out.println(collection);//List有序且允许重复元素

        // 创建Collection的实现
        Collection<String> coll = new HashSet<>();
        coll.add("?");
        coll.add("?");
        coll.add("?");
        System.out.println(coll);//Set无序且不允许重复元素
        // 添加一个集合数据
        collection.addAll(coll);
        System.out.println(collection);
        // 输出集合的长度
        System.out.println("size = " + collection.size());
        // 判断是否包含
        System.out.println("contain? = "+ collection.contains("?"));
        // 移除元素
        collection.remove("?");
        // 添加对象
        collection.add(new Person("张三", 23));
        // 当认为两个对象属性一致，相等时候，需重写hashCode 和 equals方法
        System.out.println("contain张三 = " + collection.contains(new Person("张三", 23)));

        System.out.println("-------");
        collection.add(null);

        Collection<String> collection1 = new ArrayList<>();
        collection1.add("嘻嘻");
        collection1.add("?");
        // 求两个集合的交集(只保留collection1存在的元素)
        collection.retainAll(collection1);
        System.out.println(collection);
        // 清空元素
        collection.clear();
        System.out.println(collection);
    }
}
