package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 *  public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
 *     // Write your code herefor
 *
 * public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
 *     // Write your code herefor
 *
 *
 *
 */

public class StringAnagram {
    public static void main(String[] args) {
        List<String> dictionary=new ArrayList<>();
        dictionary.add("hack");
        dictionary.add("a");
        dictionary.add("rank");
        dictionary.add("khac");
        dictionary.add("ackh");
        dictionary.add("kran");
        dictionary.add("rankhacker");
        dictionary.add("a");
        dictionary.add("ab");
        dictionary.add("ba");
        dictionary.add("stairs");
        dictionary.add("raits");
        List<String> query=new ArrayList<>();
        query.add("a");
        query.add("nark");
        query.add("bs");
        query.add("hack");
        query.add("stair");

        List<Integer> result=stringAnagram(dictionary,query);
        System.out.println(result);
    }
    static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        List<Integer> result=new ArrayList<>();
        String arr1[]=new String[dictionary.size()];
        String arr2[]=new String[query.size()];
        arr1=dictionary.toArray(arr1);
        arr2=query.toArray(arr2);
        int n=arr1.length;
        int m=arr2.length;
        HashMap<String, Integer> freq = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            arr1[i] = sortString(arr1[i]);
            if (freq.containsKey(arr1[i]))
            {
                freq.put(arr1[i],
                        freq.get(arr1[i]) + 1);
            }
            else
            {
                freq.put(arr1[i], 1);
            }
        }
        for(int i = 0; i < m; i++)
        {
            arr2[i] = sortString(arr2[i]);
            result.add((freq.get(arr2[i])==null?0:freq.get(arr2[i])));
        }
return result;
    }
    }
