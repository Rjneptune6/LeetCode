import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

  public static int lengthOfLongestSubstring(String s) {
    int aPointer = 0;//sits at the beginning
    int bPointer = 0;//expands the window
    int max = 0;
    HashSet<Character> hashSet = new HashSet();

    while(bPointer < s.length()){ //we have not seen this character yet
      if(!hashSet.contains(s.charAt(bPointer))){
        hashSet.add(s.charAt(bPointer));
        bPointer++;
        max = Math.max(hashSet.size(), max); //update the maximum for each iteration
      }
      else{ //we have seen this character
        hashSet.remove(s.charAt(aPointer));
        aPointer++;
      }
    }
    return max;
  }

  public static void main(String[] args) {
      int sub = lengthOfLongestSubstring("yerrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    System.out.println("Length of longest substring: " +sub);
  }
}
