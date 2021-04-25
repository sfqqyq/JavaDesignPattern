package cn.itsqq.demeterprinciple.improve;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 有一个学校，下属有各个学院和总部，现要求打印学校总部员工id和学院员工id
 */
public class Demeter {
    public static void main(String[] args) {
        System.out.println("~~~迪米特法则改进~~~");
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

/**
 * 管理学院员工的管理类
 */
class CollegeManager{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for(int i=0;i<5;i++){
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学校学院id="+i);
            list.add(emp);
        }
        return list;
    }

    public void printCollege(){
        List<CollegeEmployee> list1 = this.getAllEmployee();
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

/**
 * 学院员工的管理类
 * 分析SchoolManager类的直接朋友有哪些：Employee、CollegeManager
 * CollegeEmployee 不是直接朋友而是一个陌生类，违反了迪米特法则
 */
class SchoolManager{
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<Employee>();
        for(int i=0;i<10;i++){
            Employee emp = new Employee();
            emp.setId("学校员工id="+i);
            list.add(emp);
        }
        return list;
    }

    // 打印员工id
    public void printAllEmployee(CollegeManager sub){

        // 分析问题
        // 1、将输出学院员工的方法封装到管理学院员工的类中
        sub.printCollege();
        System.out.println("--------我是分割线--------");
        List<Employee> list2 = this.getAllEmployee();
        for(Employee e:list2){
            System.out.println(e.getId());
        }
    }

}


/**
 * 学校总部员工类
 */
@Data
class Employee{
    private String id;
}

/**
 * 学院的员工类
 */
@Data
class CollegeEmployee{
    private String id;
}