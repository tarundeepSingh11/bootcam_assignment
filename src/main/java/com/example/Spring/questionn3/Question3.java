package com.example.Spring.questionn3;

import com.example.Spring.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


interface Area{
    double area(double side);
}
class Rectangle implements Area {
    public double area(double side){
        double result = side*side;
        return side;
    }
}
@Component
class Circle implements Area {

    public double area(double side){
        double result=3.14*side*side;
        return result;
    }
}
@Component
class UseArea{
   @Autowired
    private Area area;

    public UseArea(Area area) {
        this.area = area;
    }
    public double areaPlus4(int side){
        double ans=area.area(side);
        return ans+4;
    }
}
public class Question3 {
    public static void main(String[] args)
    {
        //UseArea useArea=new UseArea(new Circle());
        ApplicationContext applicationContext =SpringApplication.run(Application.class, args);
        UseArea useArea=applicationContext.getBean(UseArea.class);
        double ans=useArea.areaPlus4(5);
        System.out.println(ans);
        System.out.println("run");


    }
}
