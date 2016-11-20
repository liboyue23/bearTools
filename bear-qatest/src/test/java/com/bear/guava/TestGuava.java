package com.bear.guava;


import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.manager.ScheduleBean;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static com.google.common.base.Preconditions.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
