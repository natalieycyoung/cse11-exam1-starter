
class User
{
	String name;
	String email;
	int followers;

	User(String name, String email, int followers)
	{
		this.name = name;
		this.email = email;
		this.followers = followers;
	}
}

class Tweet
{
	User author;
	String content;
	String tweetId;
	int likes;
	Date date;	// posted date

	Tweet(User author, String content, String tweetId, int likes, Date date)
	{
		this.author = author;
		this.content = content;
		this.tweetId = tweetId;
		this.likes = likes;
		this.date = date;
	}

	/**
	 * Checks if this tweet was posted before another tweet.
	 *
	 * @param otherTweet
	 * @return boolean
	 */
	boolean before(Tweet otherTweet)
	{
		// check if this year or other year is earlier
		if (date.year < otherTweet.date.year)
		{
			return true;
		}
		else if (date.year > otherTweet.date.year)
		{
			return false;
		}

		// check if this month or other month is earlier
		if (date.month < otherTweet.date.month)
		{
			return true;
		}
		else if (date.month > otherTweet.date.month)
		{
			return false;
		}

		// check if this day or other day is earlier
		if (date.day < otherTweet.date.day)
		{
			return true;
		}
		else if (date.day > otherTweet.date.day)
		{
			return false;
		}
			
		// if not returned earlier, then this date must be same as other date
		// therefore, this date is not before the other date
		return false;
	}
}

class Date
{
	int year;
	int month;
	int day;

	Date(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}

	String toText()
	{
		String dateText = this.year + "-" + this.month + "-" + this.day;
		return dateText;
	}
}

class ExamplesTweets
{
	// User
	User twitterUser = new User("jack", "jack@twitter.com", 5700000);

	// Tweet 1
	// URL: https://twitter.com/jack/status/20
	Date twitterEpoch = new Date(2006,3,21);
	Tweet tweet1 = new Tweet(
			twitterUser, "just setting up my twttr", "20", 170600, twitterEpoch);
	
	// Tweet 2
	// URL: https://twitter.com/jack/status/806
	Date date2 = new Date(2006,3,31);
	Tweet tweet2 = new Tweet(
			twitterUser, "drunk", "806", 536, date2);

	// Tweet 3
	// URL: https://twitter.com/jack/status/1012
	Date date3 = new Date(2006,4,2);
	Tweet tweet3 = new Tweet(
			twitterUser, "picking up laundry. Hungry, me.", "1012", 164, date3);

	// Tweet 4
	// URL: https://twitter.com/jack/status/1346245928491966464
	Date date4 = new Date(2021,1,4);
	Tweet tweet4 = new Tweet(
			twitterUser, "Reset to start the year", "1346245928491966464", 5918, date4);

	// Example 1 - Two different Tweets posted on different months in same year
	// that returns false. tweet 1: 2006-03-21, tweet3: 2006-04-02
	boolean tweetExample1 = tweet3.before(tweet1);	// expected value: false

	// Example 2 - Two different Tweets posted on different days in same month and
	// same year that returns true. tweet 1: 2006-03-21, tweet2: 2006-03-31
	boolean tweetExample2 = tweet1.before(tweet2);	// expected value: true

	// Example 3 - The same Tweet used both as this and the argument to before.
	// tweet 1: 2006-03-21
	boolean tweetExample3 = tweet1.before(tweet1);	// expected value: false

	// Example 4 - Two different Tweets posted in different years with this Tweet
	// having an earlier month and day than the argument and that returns false.
	// tweet 4: 2021-01-04, tweet3: 2006-04-02
	boolean tweetExample4 = tweet4.before(tweet3);	// expected value: false	
	
	
	/*	public static void main(String[] args)
	{
		System.out.println("\ndate.year " + tweet1.date.year);
		System.out.println("\nothertweet.date.year " + tweet2.date.year);
		System.out.println(twitterEpoch.toText());
		System.out.println(tweet1.date.toText());
		System.out.println(tweet1.date.year);
		System.out.println(tweet1.date.month);
		System.out.println(tweet1.date.day);
		System.out.println(tweet2.date.year);
		System.out.println(tweet2.date.month);
		System.out.println(tweet2.date.day);
		System.out.println(date2.toText());
		System.out.println(tweet2.date.toText());

		System.out.println("1 before 2: " + tweet1.before(tweet2));
		System.out.println("tweetExample1: " + tweetExample1);
		System.out.println("2 before 1: " + tweet2.before(tweet1));
	}*/
}
