package test;

import org.springframework.stereotype.Component;

@Component
public class Wheel {
    public Wheel() {
        System.out.println("初始化轮子");
    }

    public  String GetBand(){
        System.out.println("我是三菱的轮胎！");
    }
}
