package AppStatistic;

public class main {

	public static void main(String[] args) {
		
		String str = "gm 2,fb 3,gm 4,fb 5,gm 7";
		
		String[] sa = str.split(",");
		
		RatingCollector rc = new RatingCollector();
		
		for (int i = 0; i < sa.length; i++) 
		{
			String s1 = sa[i];
			String[] s2 = s1.split(" ");
			String app=s2[0];
			int rating = Integer.parseInt(s2[1]);
			rc.putNewRating(app, rating);
		}
		
		System.out.println(rc.li);

	}

}
