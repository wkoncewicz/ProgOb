package zadA;

public class Hello {
	public static void main(String[ ] args)
	{
		System.out.println("Witaj!");
	    int myInt = Integer.parseInt(args[0]);
	    for (int i = 0; i < myInt; i++) {
	    System.out.println(i+1);
	    }
	}
}

