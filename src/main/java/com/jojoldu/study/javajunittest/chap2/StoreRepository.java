package com.jojoldu.study.javajunittest.chap2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by jojoldu@gmail.com on 15/01/2020
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public interface StoreRepository extends JpaRepository <Store, Long> {

    List<Store> findAllByName (String name);
}
