/**
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
*/

public int countAbc(String str) {
  if (str.length() < 3)
    return 0;
  
  String prefix3 = str.substring(0, 3);
  int count = 0;
  
  if (prefix3.equals("abc") || prefix3.equals("aba"))
    count = 1;
  
  return count + countAbc(str.substring(1));
}