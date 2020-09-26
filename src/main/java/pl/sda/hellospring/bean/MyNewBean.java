package pl.sda.hellospring.bean;

import org.springframework.stereotype.Component;

@Component
public class MyNewBean {


    @Override
    public String toString() {
        return "MyNewBean{}";
    }

    public MyNewBean() {

    }
}
