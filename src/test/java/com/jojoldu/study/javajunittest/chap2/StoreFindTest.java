package com.jojoldu.study.javajunittest.chap2;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jojoldu@gmail.com on 15/01/2020
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreFindTest {

    @Autowired
    private StoreRepository storeRepository;

    @After
    public void after() throws Exception {
        storeRepository.deleteAll();
    }

    @Test
    public void store를_name으로_조회할수있다() throws Exception {
        //given
        String targetName = "1";
        storeRepository.save(new Store(targetName));

        //when
        List<Store> stores = storeRepository.findAllByName(targetName);

        //then
        assertThat(stores.size()).isEqualTo(1);
    }
}
