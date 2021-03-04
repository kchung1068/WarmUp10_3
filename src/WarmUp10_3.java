import java.util.ArrayList;

/* Create an ArrayList to store Doubles. Place any four
 * values into the ArrayList. Then create a method
 * that when sent the ArrayList, it will print to look like:
 * [ 2.1 | 3.4 | 6.3 | 2.1 ]
 * Then create another method that will determine if
 * there are any repeat values in the ArrayList. The method should
 * be sent the ArrayList and return true or false based upon
 * whether or not the value is repeated.
 */
public class WarmUp10_3 {
	public static void main(String args[])
	{
		ArrayList doubles = new ArrayList<Double>();
		doubles.add(2.1);
		doubles.add(3.4);
		doubles.add(6.3);
		doubles.add(2.1);
		printArrayList(doubles);

	}
	public static void printArrayList(ArrayList list) {
		String first = "[ ";
		for (int x = 0; x < list.size(); x += 1) {
			if (x != (list.size() - 1)) {
				first += list.get(x) + " | ";
			} else {
				first += list.get(x) + " ]";
			}

		}
		System.out.println(first);
	}

}
