package com.yd.guava;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import com.yd.guava.bean.Foo;

/**
 * Created by Administrator on 2016/12/30.
 */
public class CollectionUtil {

    public static void main(String[] args) {

        //排序去重
        System.out.println(ImmutableSortedSet.of("a", "b", "c", "a", "d", "b"));

        System.out.println(ImmutableClassToInstanceMap.of(Foo.class, new Foo()));

        //词频统计
        HashMultiset hashMultiset =   HashMultiset.create();
        hashMultiset.addAll(ImmutableList.of("a", "b", "c", "a", "d", "b"));
        System.out.println( hashMultiset.count("a"));
    }

}
