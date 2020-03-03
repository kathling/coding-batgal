/*
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
*/

public String parenBit(String str) {
  if (str.length() == 0)
    return "";
  
  char first = str.charAt(0);
  char last = str.charAt(str.length() - 1);
  
  // open and closed brackets have been found, print out the string
  if (first == '(' && last == ')')
    return str;

  // once you find the open bracket, traverse the string from the back.  
  if (first == '(')
    return parenBit(str.substring(0, str.length() - 1));
    
  // find the open bracket
  return parenBit(str.substring(1));
}