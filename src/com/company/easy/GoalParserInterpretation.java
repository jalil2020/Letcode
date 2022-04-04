package com.company.easy;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }

    public static String interpret(String command) {
        StringBuilder s = new StringBuilder();
  
        for (int i = 0; i <command.length(); i++) {
            if (command.charAt(i) =='('){
                if (command.charAt(i+1)==')'){ s.append('o'); i++;}
                else{ s.append("al"); i+=3;};


            }else {
                s.append(command.charAt(i));
            }
        }
        return s.toString();
    }
}
