package com.example.Spring.question4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.Spring.Application;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;



interface Areas{
    double area(double side);
}
class Rectangles implements Areas {
    public double area(double side){
        double result = side*side;
        return side;
    }
}
@Component
class Circles implements Areas {
    public double area(double side){
        double result=3.14*side*side;
        return result;
    }
}
@Component
class UseAreas{
    @Autowired
    private Areas area;

    public UseAreas(Areas area) {
        this.area = area;
    }
    public double areaPlus4(int side){
        double ans=area.area(side);
        return ans+4;
    }
}

@SpringBootApplication
public class Question4 {

    private  static  Logger LOGGER=  LoggerFactory.getLogger(Question4.class);
    public static void main(String args[])
    {

        // also added  logging.level.org.springframework = debug  this in resource-> application for debug
        ApplicationContext applicationContext =SpringApplication.run(Application.class, args);
        UseAreas useArea=applicationContext.getBean(UseAreas.class);
        UseAreas useArea1=applicationContext.getBean(UseAreas.class);
        System.out.println(useArea);
        System.out.println(useArea1);
        LOGGER.info("{}",useArea.areaPlus4(6));
        LOGGER.info("{}",useArea1.areaPlus4(6));
        double ans=useArea.areaPlus4(5);
        System.out.println(ans);



    }
}

