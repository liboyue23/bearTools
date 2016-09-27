package com.bear.guava;


import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static com.google.common.base.Preconditions.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author boyue.lby
 * @date 16/9/10 下午4:26
 */
public class TestGuava {
    @Test
    public void testOptional(){
        Person p1=new Person();
        Person p2=new Person("test");

//        String opt=Optional.of(p1.getName()).or(p2.getName());
//        System.out.println(opt);
        System.out.println(Strings.emptyToNull(""));
        System.out.println(Strings.emptyToNull(null));
//        Optional<String> possible=Optional.of("");
//        possible.isPresent();
//        System.out.println(possible.get());
//        System.out.println(possible.or("qq"));
//        System.out.println(possible.orNull());
    }

    @Test
    public void testPreconditions(){
        int i=3;
        checkArgument(i >= 0, "Argument was %s but expected nonnegative", i);
    }

    @Test
    public void testObjects(){

    }

    @Test
    public void testOrders(){
        List<Integer> list= Lists.newArrayList(1,2,3,5,9,7,6);
        Ordering<Integer> numberOrdering = new Ordering<Integer>() {
            @Override public int compare(Integer left, Integer right) {
                return left.compareTo(right);
            }
        };
        List<Integer> result = numberOrdering.leastOf(list, 3);
        List<Integer> expect = Lists.newArrayList(1,2,3);
        assertThat(expect,is(result));

        Ordering<Comparable> naturalOrdering = Ordering.natural();
        List<Integer> re = naturalOrdering.greatestOf(list, 4);
    }

    @Test
    public void testImmutable(){
        final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple");

        Set bars=ImmutableSet.copyOf(COLOR_NAMES);
        System.out.println(bars);
    }

}

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            '}';
    }
}
