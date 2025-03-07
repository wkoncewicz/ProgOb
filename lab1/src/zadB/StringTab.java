package zadB;

public class StringTab {
	public static void main(String[ ] args)
	{
		String[] arr = new String[4];
		for (int i = 0; i < args.length; i++) {
			arr[i] = args[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
