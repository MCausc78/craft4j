package org.mcausc78.craft4j.api;

// great example:
/*
Array<String> array = new Array<>();
array.put("Hello");
array.put("world");
System.out.printf("My array : %s\n", array.toString());
 */

import java.util.Arrays;
import org.mcausc78.craft4j.api.Iterable;
public class Array<E> implements Iterable<E> {
    private E[] array;
    public Array() {
        this.init();
    }

    public Array(E[] array) {
        this.setArray(array);
    }
    private void init() {
        this.array = (E[]) new Object[0];
    }
    public E[] getArray() {
        return this.array;
    }
    public void setArray(E[] array) {
        this.array = array;
    }
    public Array<E> put(E e) {
        int i = 0;
        E[] array = (E[]) new Object[this.getArray().length+1];
        this.array = null;
        for (E ie : this.getArray()) {
            // ie = iterable element
            array[i] = ie;
            i+=1;
        }
        this.setArray(array);
        return this;
    }
    public void forEach(Lambda2<E, Integer> lambda) {
        int i = 0;
        for(E e : this.getArray()) {
            lambda.run(e, i);
            i++;
        }
        return;
    }
    // used for default foreach like List
    public void forEach(Lambda1<E> lambda) {
        for(E e : this.getArray()) {
            lambda.run(e);
        }
        return;
    }
    /*public Array<String> toStrings() {
        this.forEach(e -> {

        });
    }*/
    public String toString() {
        return Arrays.toString((Object[]) this.getArray());
    }

    @Override
    public void forEach(E e) {

    }
}
