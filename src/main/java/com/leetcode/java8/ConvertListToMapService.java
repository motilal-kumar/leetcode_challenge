package com.leetcode.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMapService {

    public Map<Long, Employee>  convertListBeforeJava8(List<Employee> list){

        Map<Long, Employee> map = new HashMap<>();

        for(Employee animal : list){

            map.put(animal.getId(), animal);

        }

        return map;
    }


    public Map<Long, Employee>  convertListAfterJava8(List<Employee> list){

        Map<Long, Employee>  map = list.stream().collect(Collectors.toMap(Employee :: getId, animal -> animal));

        return map;
    }

    public static void main(String[] args) {

        ConvertListToMapService convertListToMapService = new ConvertListToMapService();
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100L, "Ramesh"));
        list.add(new Employee(101L, "Tom"));
        list.add(new Employee(102L, "Tony"));

        Map < Long, Employee > map = convertListToMapService.convertListBeforeJava8(list);
        System.out.println(map);

        Map < Long, Employee > map1 = convertListToMapService.convertListAfterJava8(list);
        System.out.println(map1);

    }


     static class Employee {
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

}
