class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] b = new boolean[26];

        for(int i = 0; i < sentence.length(); i++){

            if((sentence.charAt(i)) >= 'a' && (sentence.charAt(i)) <= 'z' )
                b[sentence.charAt(i) - 'a'] = true;
        }

        for(boolean bo: b){
            if(!bo) return false;
        }
        return true;
    }
}
