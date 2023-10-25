package org.josebaperu.algorithms.search;

public class FindOcurrance {


    public static void main(String[] args) {
        String stack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(stack,needle));
    }
    static int strStr(String haystack, String needle) {
        int idxFound = -1;
        StringBuilder sb = new StringBuilder();
        int needleIdx = 0;
        for(int i = 0; i < haystack.length()-1;i++){
            if(sb.length() == needle.length()){
                if(sb.toString().equals(needle)){
                    break;
                } else {
                    idxFound =-1;
                }
            }
            if( haystack.substring(i, i+1).equals(needle.substring(needleIdx, needleIdx+1))){

                if(sb.isEmpty()){
                    idxFound = i;
                }
                if(idxFound > -1){
                    sb.append(haystack.substring(i, i+1));
                    needleIdx++;
                }

            }
        }


        return idxFound;
    }

}
