package stringclass;

public class Splitpgm {

	public static void main(String[] args) {

		
		String s3=" selenium webdriver is used for webapplication testing";
		
		
		String sr[]=s3.split(" ");
		
		for (String v:sr)
		{
			
			System.out.println(v);

			if(v.contains("webapplication"))
			{
				break;
			}
			
		}
		
	}


}
