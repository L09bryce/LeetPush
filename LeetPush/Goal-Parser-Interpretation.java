class Solution {
    public String interpret(String command) {
    
    String command1 = command.replace("()", "o");
    String command2= command1.replace("(al)", "al");

    return command2;
    }
}