/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
*/

public int countHi2(String str) {
  if (str.length() < 2) 
    return 0;
  if (str.length() == 2) {
    if (str.equals("hi"))
      return 1;
    return 0;
  }
  
  char first = str.charAt(0);
  char second = str.charAt(1);
  char third = str.charAt(2);
  int count = 0;
  int skip = 1;
  
  if (first != 'x' && second == 'h' && third == 'i' ) {
    count = 1;
    skip = 3;
  }
  else if (first == 'x' && second == 'h' && third == 'i' ) {
    skip = 3;
  }
  else if (first == 'h' && second == 'i') {
    count = 1;
    skip = 2;
  }
  
  return count + countHi2(str.substring(skip));
}