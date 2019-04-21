package optional;

/* 
 * Print the lyrics to the song "99 Bottles of Beer on the wall"
 * 
 * http://99-bottles-of-beer.net/lyrics.html
 */

public class BeerOnTheWall {
	
	public static void main(String[] args) {
		
		int x = 99;
		
		for (int i = x; i > 1; i--) 
		{
			if((i-1) > 1)
			{
				System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
						"Take one down and pass it around, " + (i-1) + " bottle" + "s " + "of beer on the wall.\n");
			}else
			{
				System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
						"Take one down and pass it around, " + (i-1) + " bottle " + "of beer on the wall.\n");
			}
			
		}
			
		System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\r\n" + 
				"Take one down and pass it around, no more bottles of beer on the wall.\r\n" + 
				"\r\n" + 
				"No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
				"Go to the store and buy some more, " + x + " bottles of beer on the wall.");
	}
}
