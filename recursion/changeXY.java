/**
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
*/

public String changeXY(String str) {
  if(str.length() == 0)
    return "";
  else {
    char c = str.charAt(0);
    if(c == 'x')
      c = 'y';
    return c + changeXY(str.substring(1));
  }
}