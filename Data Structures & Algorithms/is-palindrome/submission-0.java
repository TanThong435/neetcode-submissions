class Solution {
    public boolean isPalindrome(String s) {
      String cleanData ="";
      for(int i=0; i< s.length(); i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            cleanData = cleanData.concat(String.valueOf(s.charAt(i))).toUpperCase();
        }
      }
 System.out.println(cleanData);
        int i=0;
        int j = cleanData.length() -1;
        while(i < j || j > 0){
           if(cleanData.charAt(i) != cleanData.charAt(j)){
            return false;
           }

            i++;
            j--;
        }
        

      /*  if(first.length()-1 != last.length()-1)
            return false;

        int n = 0, m = first.length()-1;

        while(n < m && m >0){
            if(first.charAt(n) != last.charAt(m)){
                return false;
            } 
        } */

        return true;
    }

    static boolean checkCharacter(char c){
        return Character.isLetterOrDigit(c);
    }
}
