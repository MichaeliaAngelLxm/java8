package com.demo.test;

import com.demo.entity.Apple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
//比较苹果的重量

public class CompareAppleWeight {
  //传统的比较苹果重量

  @Test
  public void oldCompareWeight(){
    List<Apple> investory = new ArrayList<>();
    Apple apple = new Apple();
    apple.setWeight("3");
    Apple newApple = new Apple();
    newApple.setWeight("4");

    investory.add(apple);

    investory.add(newApple);
    Collections.sort(investory, new

        Comparator<Apple>() {

          @Override
          public int compare(Apple o1, Apple o2) {
            return o2.getWeight().compareTo(o1.getWeight());
          }


        });
    for(int i = 0;i<investory.size();i++){
      Apple apple3 = investory.get(i);
      System.out.println("重量使"+apple3.getWeight());
    }
  }
  //java8比较苹果重量
  @Test
  public void java8CompareWeight(){
    List<Apple> investory = new ArrayList<>();
    Apple apple = new Apple();
    apple.setWeight("4");
    Apple newApple = new Apple();
    newApple.setWeight("3");
    investory.add(apple);

    investory.add(newApple);
    //敲重点
    investory.sort(comparing(Apple::getWeight));
    for(int i = 0;i<investory.size();i++){
      Apple apple3 = investory.get(i);
      System.out.println("重量是"+apple3.getWeight());
    }


  }




}
