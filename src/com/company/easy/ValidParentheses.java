package com.company.easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid4("()[]{}"));
//        System.out.println(isValid4("[]"));
//        System.out.println(isValid4("(]"));
//        System.out.println(isValid4("([)]"));
    }

    public static boolean isValid4(String s) {
        if (s.isEmpty() && s.length() ==0) {
            System.out.println("uzunligi= "+s.length());
            return true;
        } else {
            for (int i = 0; i < s.length() - 1; i++) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(i + 1);
                if (c1 == '(' && c2 == ')' || c1 == '[' && c2 == ']' || c1 == '{' && c2 == '}') {
                    s = s.substring(0, i) + s.substring(i + 2);
                    isValid4(s);
                    break;
                }
            }
            return false;
        }
    }


    public static boolean isValid3(String s) {
        if (s.trim().isEmpty() || s.length() == 0) {
            return true;
        } else {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '(' && s.charAt(i + 1) == ')' || s.charAt(i) == '[' && s.charAt(i + 1) == ']' || s.charAt(i) == '{' && s.charAt(i + 1) == '}') {
                    s = s.substring(0, i) + s.substring(i + 2);
                    if (s.length() == 0) return true;
                    isValid3(s);
                }
            }
        }
        return false;

    }

    public static boolean isValid2(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (map.keySet().contains(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static boolean isValid(String s) {
        int parenthesesOpen = 0;
        int parenthesesClose = 0;
        int squareBracketsOpen = 0;
        int squareBracketsClose = 0;
        int curlyBracketsOpen = 0;
        int curlyBracketsClose = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    parenthesesOpen++;
                    break;
                case ')':
                    parenthesesClose++;
                    if (parenthesesOpen < parenthesesClose && squareBracketsOpen == squareBracketsClose && curlyBracketsOpen == curlyBracketsClose)
                        return false;
                    break;
                case '[':
                    squareBracketsOpen++;
                    break;
                case ']':
                    squareBracketsClose++;
                    if (squareBracketsClose != squareBracketsOpen)
                        return false;
                    break;
                case '{':
                    curlyBracketsOpen++;
                    break;
                case '}':
                    curlyBracketsClose++;
                    if (curlyBracketsClose != curlyBracketsOpen)
                        return false;
                    break;
            }
        }
        System.out.println("log true");
        return parenthesesOpen == parenthesesClose && squareBracketsOpen == squareBracketsClose && curlyBracketsOpen == curlyBracketsClose;
    }

}
