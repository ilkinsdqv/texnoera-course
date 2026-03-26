package l06.algorithims.datastructures.homework;

import java.util.Stack;

public class Task07MediumBracketValidatorStack {
    public static void main(String[] args) {
        //Read a string containing ()[]{} characters.
        //Use Stack<Character> or Deque<Character> to validate brackets.
        //Return true only for properly nested and closed sequences.
        //Add helper method isValid(String s).
        //Print validation result.
        String[] testCases = {
                "({[]})",
                "()[]{}",
                "(((())))",
                "{[()]}",
                "([]){}",
                "([)]",
                "((()",
                "())",
                "{(})",
                "(((((("
        };

        for (String testCase : testCases) {
            if(isValid(testCase)){
                System.out.println(testCase + " is valid");
            }else{
                System.out.println(testCase + " is not valid");
            }
        }
    }
    public static boolean isValid(String testCase){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < testCase.length(); i++){
            char currentChar = testCase.charAt(i);
            if(currentChar == '(' || currentChar == '{' || currentChar == '['){
                stack.push(currentChar);
            }else {
                if (stack.isEmpty()) return false;
                char topChar = stack.pop();
                if (topChar != '(' && currentChar == ')') return false;
                if (topChar != '{' && currentChar == '}') return false;
                if (topChar != '[' && currentChar == ']') return false;
            }
        }
        return stack.isEmpty();
    }
}
