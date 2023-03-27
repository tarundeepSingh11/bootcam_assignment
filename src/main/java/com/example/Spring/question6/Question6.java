package com.example.Spring.question6;

import com.example.Spring.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface Animals{
    String characteristics();
}

class dogs implements Animals {

    @Override
    public String characteristics() {
        return "barkkk";
    }
}
@Component

class  cats  implements Animals {

    @Override
    public String characteristics() {
        return "meaoooo";
    }
}
@Component
class UsAnimals{
    @Autowired
    private Animals animal;

    public UsAnimals(Animals animal) {    //contructor reference
        this.animal = animal;             //contructor reference
    }                                     //contructor reference
    public String areaPlus4(int legs){
        //double ans=area.area(side);
        String ans=animal.characteristics();
        return ans+" "+legs;
    }
}
public class Question6 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        UsAnimals usAnimal=applicationContext.getBean(UsAnimals.class);
        String ans=usAnimal.areaPlus4(5);
        System.out.println(ans);
        System.out.println("run");
    }
}


