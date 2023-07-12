package com.practice.Iterator;

/**
 * @author wyc
 */
public interface Iterator<E> {
    boolean hasNext();
    void next();
    E currentItem();
}
