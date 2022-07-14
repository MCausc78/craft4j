package org.mcausc78.craft4j.api.util;

import org.mcausc78.craft4j.api.json.JsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class ArraysUtil {
    public static String joinToQuotes(String[] array) {
        StringBuilder sb = new StringBuilder();
        int length = array.length;
        for(int i=0;i<length;i++) {
            sb.append(String.format("\"%s\"", array[i]));
            if(i != length-1) sb.append(",");
        }
        return sb.toString();
    }
    public static String joinToQuotes(char[] array) {
        StringBuilder sb = new StringBuilder();
        int length = array.length;
        for(int i=0;i<length;i++) {
            sb.append(String.format("'%s'", String.valueOf(array[i])));
            if(i != length-1) sb.append(",");
        }
        return sb.toString();
    }
    public static String joinBuildersToQuotes(JsonBuilder[] array) {
        StringBuilder sb = new StringBuilder();
        int length = array.length;
        for(int i=0;i<length;i++) {
            sb.append(String.format("%s", array[i].build()));
            if(i != length-1) sb.append(",");
        }
        return sb.toString();
    }
    public static String numArrayToString(byte[] nums) {
        List<Byte> list = new ArrayList<>();
        for(byte num : nums) {
            list.add(num);
        }
        return list.toString();
    }
    public static String numArrayToString(short[] nums) {
        List<Short> list = new ArrayList<>();
        for(short num : nums) {
            list.add(num);
        }
        return list.toString();
    }
    public static String numArrayToString(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }
        return list.toString();
    }
    public static String numArrayToString(long[] nums) {
        List<Long> list = new ArrayList<>();
        for(long num : nums) {
            list.add(num);
        }
        return list.toString();
    }
    public static String numArrayToString(float[] nums) {
        List<Float> list = new ArrayList<>();
        for(float num : nums) {
            list.add(num);
        }
        return list.toString();
    }
    public static String boolArrayToString(boolean[] bools) {
        List<Boolean> list = new ArrayList<>();
        for(boolean bool : bools) {
            list.add(bool);
        }
        return list.toString();
    }

}
