public class Main {


    public static boolean isBalanced(String in){
        Stack openBrackets = new Stack();
        boolean valid = true;
        int counter = 0;

        while (counter < in.length() && valid){
            char c = in.charAt(counter);

            if (c == '(' || c == '{' || c == '[' || c == '<'){
                openBrackets.push(c);
            }

            if (c == ')' || c == '}' || c == ']' || c == '>'){

                if (!openBrackets.isEmpty()){
                    char openBracket = (char) openBrackets.pop();

                    if ((c == ')' && openBracket != '(') || (c == '}' && openBracket != '{') || (c == ']' && openBracket != '[') || (c == '>' && openBracket != '<')){
                        valid = false;
                    }

                }else{
                    valid = false;
                }

            }

            counter += 1;

        }

        if (!openBrackets.isEmpty()){
            valid = false;
        }

        return valid;

    }

    public static boolean isPalindrome(String in){

        Stack charsForward = new Stack();
        boolean valid = true;
        int counter = 0;


        for (int i = 0; i < in.length(); i++){
            char c = in.charAt(i);

            charsForward.push(c);
        }

        while (counter < in.length() && valid){
            char c = (char) charsForward.pop();

            if (in.charAt(counter) != c){
                valid = false;
            }
            counter += 1;

        }

        return valid;

    }

    public static String reverseString(String in){

        Stack reverser = new Stack();
        String reversed = "";

        for (int i = 0; i < in.length(); i++){
            reverser.push(in.charAt(i));
        }

        while (!reverser.isEmpty()){
            reversed += (char) reverser.pop();
        }

        return reversed;
    }

    public static boolean isIdentical(Queue first, Queue second){
        boolean identical = true;

        Queue holderFirst = first;
        Queue holderSecond = second;

        if (holderFirst.getSize() != holderSecond.getSize()){
            identical = false;
        }else{
            int counter = 0;
            while (counter < holderFirst.getSize() && identical){
                if (holderFirst.remove() != holderSecond.remove()){
                    identical = false;
                }
            }

        }

        return identical;
    }

    public static List insertList(int[] values){
        List returnList = new List();

        for (int i = 0; i < values.length; i++){
            returnList.insertFront(values[i]);
        }

        return returnList;

    }

    public static void main(String[] args) {

        List test1 = new List();
        Queue test2 = new Queue();

        test1.insertFront(1);
        test1.insertFront(2);
        test1.insertFront(3);
        test1.insertFront(4);

        System.out.println(test1.max());
    }
}
