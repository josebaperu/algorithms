package org.josebaperu.calc;

public class BasicCalc {
    public static void main(String[] args) {
        System.out.println(doHandleOperation("1-(4-7)*9")); //
        System.out.println(doHandleOperation("(1-(4-71+81))")); //
        System.out.println(doHandleOperation("(11)1(5*8/10)"));
        System.out.println(doHandleOperation("(1)(2)")); //
        System.out.println(doHandleOperation("6"));//
        System.out.println(doHandleOperation("(11+5)"));//
        System.out.println(doHandleOperation("5+8*9"));//
        System.out.println(doHandleOperation("(3+5(3*4)(1+2))"));
    }

    static String doHandleOperation(String input) {
        if (containsParenthesis(input) && !containsOperation(input)) {
            return input;
        }
        input = performOperation(input);
        return doPerformLinearOperation(input);
    }
    static String doPerformLinearOperation(String input){
        if (!containsParenthesis(input)) {
            input = sanitizeParenthesis(input);
        }
        return resolveExpression(input);
    }
    static String sanitizeParenthesis(String s){
        s = s.replaceAll("\\)\\(","*");
        String strCopy = s;
        for(int i =0 ; i< s.length()-3;i++){
            if(s.charAt(i+1) == ')' && isNumeric(s.charAt(i+2))){
                String pattern = s.charAt(i + 1) + "" + s.charAt(i + 2);
                strCopy = strCopy.replace(pattern,"*"+s.charAt(i+2));
            }
            if(isNumeric(s.charAt(i)) && s.charAt(i+1) == '('){
                String pattern = s.charAt(i) + "" + s.charAt(i + 1);
                strCopy = strCopy.replace(pattern, s.charAt(i)+"*");
            }
        }
        strCopy = strCopy.replaceAll("\\(","").replaceAll("\\)","").replaceAll("-+","-").replaceAll("\\++","+").replaceAll("--","+").replaceAll("\\++","+");
        return strCopy;
    }
    static String performOperation(String input) {
        int i = 0;
        int openingIdx = -1;
        String inputCopy = input;
        while (i < input.length()) {
            char current = input.charAt(i);
            if (isOpening(current)) {
                openingIdx = i;
            }
            if (isClosing(current) && openingIdx > -1) {
                String expression = input.substring(openingIdx + 1, i);
                if (containsOperation(expression)) {
                    inputCopy = inputCopy.replace(expression, resolveExpression(expression));
                    openingIdx = -1;
                }
            }
            i++;
        }
        return inputCopy;
    }

    static String resolveExpression(String s) {
        if(!containsOperation(s)){
            return s;
        }
        if(isMulti(s)){
            return resolveExpression(performOperation(s, '*', s.indexOf("*")));
        }
        if(isDiv(s)){
            return resolveExpression(performOperation(s, '/', s.indexOf("/")));
        }
        if(isSubs(s)){
            return resolveExpression(performOperation(s, '-', s.indexOf("-")));
        }
        if(isSum(s)){
            return resolveExpression(performOperation(s, '+', s.indexOf("+")));
        }

        return resolveExpression(s);
    }

    static String reverse(String s){
      return new StringBuilder(s).reverse().toString();
    }

    static String performOperation(String str, char op, int idx) {
        int r= idx +1;
        int l= idx -1;
        boolean isR = false;
        boolean isL = false;
        StringBuilder first = new StringBuilder();
        StringBuilder last = new StringBuilder();

        char charL;
        char charR;
        while(!(isR && isL)){

            if(l >= 0 && !isL){
                charL = str.charAt(l);
                if(isNumeric(charL)){
                    first.append(charL);
                } else {
                    if(charL == '-'){
                        first.append(charL);
                    }
                    isL = true;
                }

            } else {
                isL = true;
            }
            if(r < str.length() && !isR){
               charR = str.charAt(r);
               if(isNumeric(charR)){
                   last.append(charR);
               } else {
                   isR = true;
               }

            } else {
                isR = true;
            }
            l--;
            r++;

        }
        int res;
        String reversedFirst = reverse(first.toString());
        int intReversedFirst = Integer.parseInt(reversedFirst);
        int intLast = Integer.parseInt(last.toString());
        if (op == '+') {
            res =intReversedFirst + intLast;
        } else if (op == '-') {
            res = intReversedFirst - intLast;
        } else if (op == '*') {
            res = intReversedFirst * intLast;
        } else {
            res = intReversedFirst / intLast;
        }
        str = str.replace(reversedFirst + op + last, String.valueOf(res));
        return str;
    }

    static boolean isOpening(char c) {
        return c == '(';
    }

    static boolean isClosing(char c) {
        return c == ')';
    }

    static boolean containsOperation(String s) {
        return isSum(s) || isSubs(s) || isMulti(s) || isDiv(s);
    }
    static boolean isSum(String s) {
        return s.contains("+");
    }
    static boolean isSubs(String s) {
        return s.contains("-") && s.indexOf("-") > 0;
    }
    static boolean isMulti(String s) {
        return s.contains("*");
    }
    static boolean isDiv(String s) {
        return s.contains("/");
    }
    static boolean containsParenthesis(String s) {
        return !s.contains("(") && !s.contains(")");
    }

    static boolean isNumeric(char c) {
        return c != '+' && c != '-' && c != '*' && c != '/';
    }
}

