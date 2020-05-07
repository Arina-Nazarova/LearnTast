package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set <Integer> hashSet = new HashSet<>();
        Set <Integer> treeSet =  new TreeSet<>();


/*
 добавление эл-от в массив занимает меньше времени, чем добавление эл-ов в связный список,
  поэтому arrayList работает быстрее чем linkedList на большинстве занчений
 */

        System.out.println("test add for arrayList " + TestUtils.testAddToCollection(arrayList));
        System.out.println("test add for linkedList " + TestUtils.testAddToCollection(linkedList));
        System.out.println("test add for hashSet " + TestUtils.testAddToCollection(hashSet));
        System.out.println("test add for treeSet " + TestUtils.testAddToCollection(treeSet));


/*
 добавление эл-ов в начало массива потребовало больше времени, чем добавление  в начало связного списка
 */
        System.out.println("test add to the Begining " + " for arrayList " + TestUtils.testAddToTheBegining(arrayList));
        System.out.println("test add to the Begining " + " for linkedList " + TestUtils.testAddToTheBegining(linkedList));
/*
 добавление эл-ов в конец массива потребовало меньше времени, чем добавление  в конец связного списка
 */
        System.out.println("test add to the Ending " + " for arrayList " + TestUtils.testAddToTheEnding(arrayList));
        System.out.println("test add to the Ending " + " for linkedList " + TestUtils.testAddToTheEnding(linkedList));

/*
быстрее всего метод срабатывает для hashSet
 */
        System.out.println("test contains " + " for hashSet " + TestUtils.testSetContains(hashSet));
        System.out.println("test contains " + " for treeSet " + TestUtils.testSetContains(treeSet));
/*
/ быстрее всего метод срабатывает для hashSet
  медленее остальных в linkedLis
 */
        System.out.println("test contains " + " for arrayList " + TestUtils.testListContains(arrayList));
        System.out.println("test contains " + " for linkenList " + TestUtils.testListContains(linkedList));
        System.out.println("test contains " + " for hashSet " + TestUtils.testSetContains(hashSet));

    }
}
