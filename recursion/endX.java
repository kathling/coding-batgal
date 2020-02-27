/**
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
*/

public String endX(String str) {
  if (str.length() == 0)
    return "";
  
  char first = str.charAt(0);
  
  if (first == 'x')
    return endX(str.substring(1)) + first;
  else
    return first + endX(str.substring(1));
}