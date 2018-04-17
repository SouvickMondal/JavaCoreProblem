public class String1
{
  public static void main(String[] args) {
    char [] a = {'c', 'o', 'n', 'g', 'r', 'a', 't', 's'};

          String s = "KAMAL";
		     char b[] = new char [10];
		     b[0] = 'N';	 b[1] = 'E';
		     b[2] = 'E';     b[3] = 'L';
		     s.getChars(0, 4, b, 3);
		     System.out.println(b);

  }
}
