/*
Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.

strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
*/
public int strCount(String str, String sub) {
  // make sure str length is less that the sub length so the prefix does not go out of bounds
  if (str.length() < sub.length())
    return 0;
  
  // extract the prefix of str  
  String prefix = str.substring(0, sub.length());

  if (prefix.equals(sub))
    return 1 + strCount(str.substring(sub.length()), sub);
    
  return strCount(str.substring(1), sub);
}