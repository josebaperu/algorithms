package org.josebaperu.calc;

public class BasicCalc {
    public static void main(String[] args) {
        System.out.println(doParseParenthesis("(1-(4-7))"));
        System.out.println(doParseParenthesis("1-(4-7)*9"));
        System.out.println(doParseParenthesis("(3+5(3*4)(1+2))"));
        System.out.println(doParseParenthesis("6"));
        System.out.println(doParseParenthesis("(11)"));
        System.out.println(doParseParenthesis("(11+5)"));
    }

    static String doParseParenthesis(String input) {
        if (!containsParenthesis(input) && !containsOperation(input)) {
            return input;
        } else if (!containsOperation(input) && containsParenthesis(input)) {
            return input.replace("(", "").replace(")", "");
        }
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
                    inputCopy = inputCopy.replace(expression, resolve(expression));
                    openingIdx = -1;
                }
            }
            i++;
        }
        if (inputCopy.charAt(0) == '(' && inputCopy.charAt(inputCopy.length() - 1) == ')') {
            inputCopy = inputCopy.substring(1, inputCopy.length() - 1);
        }
        return inputCopy;
    }

    static String resolve(String s) {
        String first = "";
        String last = "";
        char operator = ' ';
        boolean isFirstSet = false;
        for (char c : s.toCharArray()) {
            if (isNumeric(c)) {
                if (!isFirstSet) {
                    first = first + c;
                } else {
                    last = last + c;
                }
            } else {
                isFirstSet = true;
                operator = c;
            }
        }
        return performOperation(first, operator, last);
    }

    static String performOperation(String first, char op, String last) {
        int res = 0;
        if (op == '+') {
            res = Integer.valueOf(first) + Integer.valueOf(last);
        } else if (op == '-') {
            res = Integer.valueOf(first) - Integer.valueOf(last);
        } else if (op == '*') {
            res = Integer.valueOf(first) * Integer.valueOf(last);
        } else {
            res = Integer.valueOf(first) / Integer.valueOf(last);
        }
        return String.valueOf(res);
    }

    static boolean isOpening(char c) {
        return c == '(';
    }

    static boolean isClosing(char c) {
        return c == ')';
    }

    static boolean containsOperation(String s) {
        return s.contains("+") || s.contains("-") || s.contains("/") || s.contains("*");
    }

    static boolean containsParenthesis(String s) {
        return s.contains("(") || s.contains(")");
    }

    static boolean isNumeric(char c) {
        return c != '+' && c != '-' && c != '*' && c != '/';
    }
}

