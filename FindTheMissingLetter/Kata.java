public class Kata
{
  public static char findMissingLetter(char[] array)
  {
    int iterator = 0;
    while (true) {
      if (array[iterator] - array[++iterator] != -1)
        return (char) (array[iterator] - 1);
      }
  }
}
