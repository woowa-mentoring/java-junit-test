package com.jojoldu.study.javajunittest.chap2;

/**
 * Created by jojoldu@gmail.com on 15/01/2020
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Store(String name) {
        this.name = name;
    }

    public void changeName (String name) {
        if(!StringUtils.isEmpty(name)) {
            this.name = name;
        }
    }
}
