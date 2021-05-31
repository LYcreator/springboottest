package com.ly.springbootTest.service.impl;

import com.ly.springbootTest.service.SumService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @author ：LY
 * @date ：2021/4/15 15:21
 * @description ：Java8SumService
 */

@Service
@Profile("Java8")
public class Java8SumService implements SumService {
    @Override
    public Integer sum(Integer... integers) {
        System.out.println("java8实现");
        Integer sum = Stream.of(integers).reduce(0,Integer::sum);
        return sum;
    }
}
