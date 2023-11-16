package org.josebaperu.leetcode;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"aflorida","bflower","cflow"};
        System.out.println(doFindLongest(strs, "",0));
    }

    static String doFindLongest(String[]arr, String str, int idx){
            if(arr.length == 0 || arr == null) return "";
            if(arr.length == 1) return arr[0];
            boolean isEqual = true;
            for(int i = 0; i < arr.length-1;i++){
                String left = arr[i];
                String right = arr[i+1];

                if(left.length() <= idx || right.length() <= idx){
                    return str;
                }

                if(left.charAt(idx) != right.charAt(idx)){
                    isEqual = false;
                    break;
                }
            }
            if(isEqual){
                str = str + arr[0].charAt(idx);
                return doFindLongest(arr, str, ++idx);
            } else{
                if(str.length()> 0){
                    return str;
                }
                return "";
            }

    }
}
