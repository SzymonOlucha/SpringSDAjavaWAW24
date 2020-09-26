package pl.sda.hellospring.bean;

import org.springframework.stereotype.Component;

@Component
public class MyNewBean {

    AnotherBean anotherBean;


    @Override
    public String toString() {
        return "MyNewBean{}";
    }

    public MyNewBean() {

    }
}
