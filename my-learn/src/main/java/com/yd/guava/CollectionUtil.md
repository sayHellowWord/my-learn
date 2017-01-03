###不可变集合的有点
-   当对象被不可信的库调用时，不可变形时是安全的
-   不可变对象被对多个线程调用时，不存在竞态条件问题
-   不可变集合不需要考虑变化，因此可以节省时间和空间。所有的不可变的集合都比他们的可变形时有更好的内存利用率
-   不可变对象因为有固定不变，可以作为常量来安全使用

###使用
    copyOf 方法，如 ImmutableSet.copyOf(set);
    of 方法，如 ImmutableSet.of(“a”, “b”, “c”)或 ImmutableMap.of(“a”, 1, “b”, 2);
    Builder工具
    
###Multiset
 可以用两种方式看待 Multiset：
-   没有元素顺序限制的 ArrayList
-   Map<E, Integer>，键为元素，值为计数


    count(E) 给定元素在 Multiset 中的计数
    elementSet() Multiset 中不重复元素的集合，类型为 Set<E>
    entrySet() 和 Map 的 entrySet 类似，返回 Set<Multiset.Entry<E>>，其中包含的 Entry 支持 getElement()和 getCount()方法
    add(E, int) 增加给定元素在 Multiset 中的计数
    remove(E, int) 减少给定元素在 Multiset 中的计数
    setCount(E, int) 设置给定元素在 Multiset 中的计数，不可以为负数
    size() 返回集合元素的总个数（包括重复的元素）
    
###Multimap
