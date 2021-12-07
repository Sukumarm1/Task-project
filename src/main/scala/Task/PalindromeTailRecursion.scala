package Task

import scala.annotation.tailrec

object PalindromeTailRecursion extends  App {

  @tailrec
  def verificPalindromo(s: String): String = {
    if (s.length == 0 || s.length == 1)
      "palindrome"
    else

    if(s.charAt(0).toLower == s.charAt(s.length - 1).toLower)
      verificPalindromo(s.substring(1,s.length -1 ))
    //Substring -- Returns a string that is a substring of this string.
    // The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
    // Thus the length of the substring is endIndex-beginIndex.
      else
        "not palindrome"
  }

  var s:String ="mom"
  println(verificPalindromo(s))
}