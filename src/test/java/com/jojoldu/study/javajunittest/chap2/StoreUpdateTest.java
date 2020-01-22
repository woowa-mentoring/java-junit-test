package com.jojoldu.study.javajunittest.chap2;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jojoldu@gmail.com on 15/01/2020
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreUpdateTest {

    @Autowired
    private StoreRepository storeRepository;


    @Test
    public void store의_이름은_상시변경가능하다() throws Exception {
        //given
        String targetName = "1";
        String expectedName = "2";
        storeRepository.save(new Store(targetName));

        //when
        Store store = storeRepository.findAllByName(targetName).get(0);
        store.changeName(expectedName);

        //then
        assertThat(store.getName()).isEqualTo(expectedName);
    }
}
