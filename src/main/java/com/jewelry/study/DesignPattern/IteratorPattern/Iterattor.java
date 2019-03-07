package com.jewelry.study.DesignPattern.IteratorPattern;
/**
 *
 *
 */
public interface Iterattor<T> {
    /**
     * 是否还有下一个元素
     * @return true 表示有 , false 表示没有
     * */
    boolean hasNext();
    /**
     * 返回当前位置的元素，并将位置移至下一位
     * */
    T next();
}
