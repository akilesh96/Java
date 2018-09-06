
public class SplitExamples {
	public static void main(String arg[])
	{
		String string = "004-034556";
		String[] parts = string.split("(?=-)");
		String part1 = parts[0]; // 004
		String part2 = parts[1]; // -034556
		
		String string1 = "004-034556";
		String[] parts1 = string1.split("(?<=-)");
		String par1 = parts1[0]; // 004-
		String par2 = parts1[1]; // 034556
		
		String str = "004-034556-42";
		String[] p = str.split("-", 2);
		String p1 = p[0]; // 004
		String p2 = p[1]; // 034556-42
	}

}
