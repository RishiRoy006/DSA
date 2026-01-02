class Solution {
    public String reversePrefix(String word, char ch) {
        //Rishi
        String reverseString="";
        if(word.indexOf(ch)==-1)
        return word;
        for(int i=word.indexOf(ch);i>=0;i--)
        {
            reverseString=reverseString+word.charAt(i);
        }
        reverseString=reverseString+word.substring(word.indexOf(ch)+1,word.length());
        return reverseString;
    }
}