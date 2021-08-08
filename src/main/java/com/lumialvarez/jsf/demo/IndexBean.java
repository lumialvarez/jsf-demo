/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lumialvarez.jsf.demo;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author luigu
 */
@Named
@ViewScoped
@Getter
@Setter
public class IndexBean implements Serializable {

    private List<String> list;
    private String name;

    @PostConstruct
    public void init() {
        list = new ArrayList<>();
    }

    public void add() {
        list.add(name);
    }

    public void remove(String e) {
        list.removeIf(x -> x.equals(e));
    }
}
