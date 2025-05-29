package Learning;

public class WrapperClass {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer a = Integer.valueOf(10);// good way
		Integer b = 10;
		Byte c = 15;
		Byte d = Byte.valueOf("15");
		Byte bb = 15;
		Byte e = Byte.valueOf(bb);

		Short f = Short.valueOf("123");
		Float f1 = 112.3f;
		Double j = Double.valueOf(123.34);
		Boolean bool = Boolean.valueOf(true);
		int m1 = 10;
		Integer m2 = m1;
		System.out.println(m2.equals(m1));
		Integer m3 = 10;
		System.out.println(m2.equals(m3));// Values compared

		Integer m4 = Integer.valueOf("11111111", 2);
		System.out.println(m4);
		Integer m5 = Integer.valueOf("A7", 16);
		System.out.println(m5);

		Integer m6 = Integer.MIN_VALUE;
		System.out.println(m6);

		Integer m7 = Integer.MAX_VALUE;
		System.out.println(m7);
		int rev = 1211;
		Integer m8 = rev;
		System.out.println(Integer.reverse(1211));
		System.out.println("----------------------");
		
		float f12 =  12.4f;
		Float f123 = f12/0;
		System.out.println(f123 == Float.POSITIVE_INFINITY);
		System.out.println(f123 == Float.NEGATIVE_INFINITY);
		
		
	}
}
