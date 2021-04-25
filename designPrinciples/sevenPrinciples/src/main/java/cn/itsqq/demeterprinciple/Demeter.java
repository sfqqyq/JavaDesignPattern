package cn.itsqq.demeterprinciple;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 有一个学校，下属有各个学院和总部，现要求打印学校总部员工id和学院员工id
 */
public class Demeter {
    public static void main(String[] args) {
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
        // 1、这里的CollegeEmployee不是SchoolManager的直接朋友
        // 2、CollegeEmployee是以局部变量方式出现在SchoolManager
        // 3、违反了迪米特法则

        List<CollegeEmployee> list1 = sub.getAllEmployee();
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
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