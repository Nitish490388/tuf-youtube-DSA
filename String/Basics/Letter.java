package String.Basics;
public class Letter {
    

    public static String LetterChanges(String str) {
        String ans = ""; 
        
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isLetterOrDigit(ch) || Character.isDigit(ch)) {
                ans+=ch;
            }
            
             else {
                char newch = (char) (ch+1);
                if(newch == '{') ans+='a';
                else
                if(newch == 'a' || newch== 'e'||newch == 'i' || newch== 'o'||newch=='u') {
                    ans+=Character.toUpperCase(newch);
                }
                else {
                    ans+=newch;
                }
            }
            
        }
        return ans;
      }

      public static void main(String[] args) {
        System.out.println(LetterChanges("fun times2! zzz"));
      }
}
