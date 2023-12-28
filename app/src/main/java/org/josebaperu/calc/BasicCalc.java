package org.josebaperu.calc;


public class BasicCalc {
    public static void main( String[] args ) {
        //System.out.println(doParseParenthesis( "(1-(4-7))" ));
        System.out.println(doParseParenthesis( "(4+5(12/2)+123*45)" ));
    }
    static int doParseParenthesis(String input) {
        boolean multiOrDiv = true;
        while(multiOrDiv){
            if(input.contains("*")){
                int idxMulti = input.indexOf("*");
                input = handleOperation(input,"*",idxMulti);
            } else if(input.contains("/")){
                int idxMulti = input.indexOf("/");
                input = handleOperation(input,"/",idxMulti);
            } else {
                multiOrDiv = false;
            }

        }
        input = input.replaceAll("\\(","").replaceAll("\\)","");
        System.out.println(input);
        return -1;
    }
    static String handleOperation(String str,String op, int idx){
        int res = 0;
        int min = 0;
        int max = str.length()-1;
        boolean isCompleteLeft = false;
        boolean isCompleteRight = false;
        int idxR = idx+1;
        int idxL = idx-1;
        String left = "";
        String right = "";
        while(true){
            char l = str.charAt(idxL);
            char r = str.charAt(idxR);
            if(l != '(' && l != '+' && l != '-' && l != '*' && l != '/'){
                left = left + l;
            } else {
                isCompleteLeft = true;
            }
            if(r!= ')' && r != '+' && r != '-' && r != '*' && r != '/'){
                right = right + r;
            } else {
                isCompleteRight = true;
            }
            if(isCompleteRight && isCompleteLeft)break;

            if(idxR < max){
                idxR++;
            }
            if(0 < idxL){
                idxL--;
            }

        }
        if(op.equals("*")){
            return str.substring(0,idxL+1) + (Integer.parseInt(reverse(left)) * Integer.parseInt(right)) + str.substring(idxR);
        } else {
            return str.substring(0,idxL+1) + (Integer.parseInt(reverse(left)) / Integer.parseInt(right)) + str.substring(idxR);
        }
    }
    static String reverse(String num){
        return new StringBuilder(num).reverse().toString();
    }
}

