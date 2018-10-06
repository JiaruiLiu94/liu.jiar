
public class Solution {
    public String reverseWords(String s) {
       
        if (s == null || s.length() == 0) return "";
         
        int length = s.length();
        StringBuilder r = new StringBuilder(); 
        int stringStart = 0;
        int tokenReadPos = length - 1;
        int wordEnd;
         
        while (stringStart < length && s.charAt(stringStart) == ' ')
            stringStart++;
         
        while (tokenReadPos >= stringStart && s.charAt(tokenReadPos) == ' ') {
            tokenReadPos--;
        }
         
        while (tokenReadPos >= stringStart) {
            if (s.charAt(tokenReadPos) == ' ') {
                r.append(' ');
                tokenReadPos--;
                while (tokenReadPos >= stringStart && s.charAt(tokenReadPos) == ' ')
                    tokenReadPos--;
            }
            else {
                wordEnd = tokenReadPos;
                while (tokenReadPos >= stringStart && s.charAt(tokenReadPos) != ' ') {
                    tokenReadPos--;
                }
              
                for (int i = tokenReadPos + 1; i <= wordEnd; i++)
                    r.append(s.charAt(i));
            }
        }
        return r.toString();
    }
}
    public static String Reserve(String s) {
    StringTokenizer strTok = new StringTokenizer(s, " ");
    Stack<String> stack=new Stack<String>();
    StringBuilder buff=new StringBuilder();
    while(strTok.hasMoreElements()) {
        String str = (String)strTok.nextToken();
        if(!str.equals("")) stack.push(str);
    }
    while(!stack.isEmpty()){
        buff.append(stack.pop()); 
        if(!stack.isEmpty()) buff.append(" ");
    }
    return buff.toString();
 }