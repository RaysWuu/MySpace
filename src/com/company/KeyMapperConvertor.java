package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyMapperConvertor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input number: ");
        String all = input.nextLine();
        char[] allChar = all.toCharArray();
        if(allChar.length >= 5){
            System.out.println("Data is too long");
        }else {
            List<String> resultList = convertInputNumberToLetters(allChar);
            for(String result : resultList){
                System.out.print(result + " ");
            }
        }
    }

    private static List<String> appendPosibleValue(char[] values,List<String> paramResults){
        List<String> results = new ArrayList<>();
        if(paramResults.size() == 0){
            for(char c:values){
                results.add(String.valueOf(c));
            }
        }else {
            for(String oldResult : paramResults){
                for(char c : values){
                    results.add(oldResult + c);
                }
            }
        }
        return results;
    }

    public static List<String> convertInputNumberToLetters(char[] allChar){
        List<char[]> valuesList = new ArrayList<>();
        List<String> results = new ArrayList<>();
        for(char code : allChar){
            char[] values = KeyMapperEnum.getValue(code);
            if(values.length > 0){
                valuesList.add(values);
            }
        }
        for(char[] values: valuesList){
            results = appendPosibleValue(values,results);
        }
        return results;
    }
}
