/**
Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
*/

public String noX(String str) {
  if (str.length() == 0)
    return "";
  
  String s = str.substring(0, 1);
  if (s.equals("x"))
    s = "";

  return s + noX(str.substring(1));
}