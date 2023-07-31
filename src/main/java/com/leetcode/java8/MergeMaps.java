package com.leetcode.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeMaps {


    private static   Map<String, Employee> map1 = new HashMap<>();
    private static Map<String, Employee> map2 = new HashMap<>();

    public static void main(String[] args){

        initialize();
        mergeFunction();
        streamConcat();
        streamOf();
        streamMerge();



    }

    public static void mergeFunction(){

        Map<String, Employee>  map3  = new HashMap<>(map1);
        map2.forEach(
                (k,v) -> map3.merge(k,v, (v1, v2)  -> new Employee(v1.getId(), v2.getName()))
        );
        map3.entrySet().forEach(System.out::println);
    }


    public static void streamConcat(){

        Map<String, Employee>  result  = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream()).collect(Collectors.toMap(
                Map.Entry:: getKey,
                Map.Entry::getValue,
                (v1, v2)  -> new Employee(v2.getId(), v1.getName())
        ));

        result.entrySet().forEach(System.out::println);
    }


    public static void streamOf(){

        Map<String, Employee>  map3  = Stream.of(map1, map2)
                .flatMap(m -> m.entrySet().stream()).collect(Collectors.toMap(

                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1,v2)  -> new Employee(v1.getId(), v2.getName())

                )
                );

        map3.entrySet().forEach((System.out::println));

    }

    public static void streamMerge(){


        Map<String, Employee>  map3 = map2.entrySet().stream()
                .collect(Collectors.toMap(

                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2)   -> new Employee(v1.getId(), v2.getName())
                ));
        map3.entrySet().forEach(System.out::println);

    }

    private static void initialize() {
        Employee employee1 = new Employee(1L, "Motilal");
        map1.put(employee1.getName(), employee1);

        System.out.println("employee1: "+employee1.toString());

        Employee employee2 = new Employee(22L, "Rajeev");
        map1.put(employee2.getName(), employee2);
        Employee employee3 = new Employee(8L, "John");
        map1.put(employee3.getName(), employee3);

        Employee employee4 = new Employee(2L, "Shyam");
        map2.put(employee4.getName(), employee4);
        Employee employee5 = new Employee(3L, "Kavi");
        map2.put(employee5.getName(), employee5);
    }


}



     class Employee{

    private Long id;
    private String name;

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
