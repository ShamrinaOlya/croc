package com.company;
import java.util.*;
public class Main {

    static String line = "КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики";
    static String delimiter = "/";
    static final String point1 = ".";
    static final String point2 = "..";


    public static void main(String[] args) {
        String[] line2 = line.split(delimiter);
        Deque<String> result = new LinkedList<>();
        for (String s : line2) {
        if (s.equals(point2)){
            String lastDir = result.peekLast();
            if (lastDir == null) {
                result.offerLast(point2);
            } else if (lastDir.equals(point2)) {
                result.offerLast(point2);
            } else {
                result.removeLast();
            }
        }
        else {
            if(!s.equals(point1)){
               result.offerLast(s);
            }
        }
        }
        int n = result.size();
            for (int i = 0; i < n; i++) {
                if (result.peekFirst() != null) {
                    System.out.print(result.peekFirst());
                }
                if (i != n - 1) {
                    System.out.print("/");
                }
                result.removeFirst();
            }
    }
    }

