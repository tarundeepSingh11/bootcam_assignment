package com.example.Spring.question2;

import com.example.Spring.Application;
import org.springframework.boot.SpringApplication;

interface Area{
    double area(double side);
}
class Rectangle implements Area{
    public double area(double side){
        double result = side*side;
        return side;
    }
}
class Circle implements Area{
    public double area(double side){
        double result=3.14*side*side;
        return result;
    }
}
class UseArea{
    private Area area;

    public UseArea(Area area) {
        this.area = area;
    }
    public double areaPlus4(int side){
        double ans=area.area(side);
        return ans+4;
    }
}

public class Question2 {
    public static void main(String args[])
    {
        UseArea useArea=new UseArea(new Circle());
        double ans=useArea.areaPlus4(5);
        System.out.println(ans);

        SpringApplication.run(Application.class, args);

    }
}
