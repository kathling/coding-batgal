/**
Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
*/

public String pairStar(String str) {
  if (str.length() == 0)
    return "";
  else if (str.length() == 1)
    return str;
  
  char first = str.charAt(0);
  char second = str.charAt(1);
  
  String returningPhrase;
  
  if (first == second)
    returningPhrase = first + "*";
  else
    returningPhrase = first + "";
    
  return returningPhrase + pairStar(str.substring(1));
}