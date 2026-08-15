class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        ArrayList<Character> list = new ArrayList<>();
    for(int i = 0; i < letters.length; i++) {
        list.add(letters[i]);
    }
    for(int i = 0; i < list.size(); i++) {
        if(list.get(i) > target) {
            return list.get(i);
        }
    }
    return letters[0];
}
        }
    
