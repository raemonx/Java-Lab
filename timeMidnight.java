
import java.io.*;
class timeMidnight{
	public static void main(String[] pArgs) throws IOException
        {
            final BufferedReader tKeyboard = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Type in the the number of minutes past midnight ");

            final String tInput = tKeyboard.readLine();
            final int tAllMins = new Integer(tInput).intValue();

            final int tHours = tAllMins / 60;
            final int tMins = tAllMins % 60;

            System.out.print(tHours + ":" + tMins/10 + tMins%10);
            System.out.println();
 
        }
}