package com.ly.springbootTest.service.impl;

import com.ly.springbootTest.service.SumService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author ：LY
 * @date ：2021/4/15 15:18
 * @description ：Java7SumService
 */

@Profile("Java7")
@Service
public class Java7SumService implements SumService {
    @Override
    public Integer sum(Integer... integers) {
        System.out.println("java7实现");
        int sum = 0;
        for (Integer integer :integers){
            sum += integer;
        }
        return sum;
    }
}
