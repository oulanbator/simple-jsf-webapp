package com.example.testjsfv1;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class Hello implements Serializable {
    private String name;

    public Hello(String name) {
        this.name = name;
    }

    public Hello() {
    }

    @PostConstruct
    public void init() {
        this.name = "Tor";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
