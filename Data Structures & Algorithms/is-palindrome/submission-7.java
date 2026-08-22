class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j = s.length() -1;
        while(i < j){

            while(i < j && !checkCharacter(s.charAt(i))){
                i++;
            }
            while(i < j && !checkCharacter(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    static boolean checkCharacter(char c){
        return (c >= '0' && c <='9') || 
        (c >= 'a' && c <= 'z') || 
        (c >= 'A' && c <= 'Z'); 
    }
}
