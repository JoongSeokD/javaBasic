package format;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1_234_567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println("DecimalFormat(\"0\") : " + df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println("DecimalFormat(\"0\") : " + df.format(num));
		
		df = new DecimalFormat("00000000.000000");
		System.out.println("DecimalFormat(\"00000000.000000\") : " + df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println("DecimalFormat(\"#\") : " + df.format(num));		
		
		df = new DecimalFormat("#.#");
		System.out.println("DecimalFormat(\"#.#\") : " + df.format(num));
		
		df = new DecimalFormat("##########.####");
		System.out.println("DecimalFormat(\"##########.####\") : " + df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println("DecimalFormat(\"#.0\") : " + df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println("DecimalFormat(\"+#.0\") : " + df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println("DecimalFormat(\"-#.0\") : " + df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println("DecimalFormat(\"#,###.0\") : " + df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println("DecimalFormat(\"0.0E0\") : " + df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println("DecimalFormat(\"+#,### ; -#,###\") : " + df.format(num));
		
		df = new DecimalFormat("#.# %");
		System.out.println("DecimalFormat(\"#.# %\") : " + df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println("DecimalFormat(\"\\u00A4 #,###\") : " + df.format(num));
	}
}
