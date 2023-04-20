package csd;

class App {
	public static void main(String [] args)
	{
		String str = "Bugün.hava.çok.güzel";
		String [] words = str.split("[.]");

		for (int i = 0; i < words.length; ++i)
			System.out.printf("[%s]%n", words[i]);
	}
}