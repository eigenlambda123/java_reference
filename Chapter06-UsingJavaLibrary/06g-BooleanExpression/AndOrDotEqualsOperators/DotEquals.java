class DotEquals{
	public static void main(String[] args) {
		String a = new String("hello");
		String b = new String("hello");

		System.out.println(a == b);       // false (different objects in memory)
		System.out.println(a.equals(b));  // true  (same text content)
	}
}