/**
 * CSE 11 - Exam 1 - Task 1
 *
 * @author Natalie Young
 * @since 2021-10-15
 */

class ExamplesMethods
{
	ExamplesMethods() {}
	
	/**
	 * Returns area difference of two concentric circles given their radii.
	 *
	 * @param radius1
	 * @param radius2
	 * @return ringArea
	 */
	double ringArea(double radius1, double radius2)
	{
		double area1 = Math.PI * Math.pow(radius1, 2);
		double area2 = Math.PI * Math.pow(radius2, 2);
		double ringArea = 0;

		if (area1 > area2)
		{
			ringArea = area1 - area2;
		}
		else if (area1 < area2)
		{
			ringArea = area2 - area1;
		}	
		
		return ringArea;
	}
	
	
	/**
	 * Takes a string and moves a given number of characters from the beginning to the end.
	 * 
	 * @param str
	 * @param n
	 * @return strRotated
	 */
	String rotate(String str, int n)
	{
		String strRotated;

		if (str.length() < n)
		{
			return str;
		}
		else
		{
			strRotated = str.substring(n, str.length()) + str.substring(0, n);
		}
		
		return strRotated;
	}
}

class Examples
{
	// TASK 1
	// Instantiate objects of ExamplesMethods type to test ringArea method
	ExamplesMethods areaEx1 = new ExamplesMethods();
	ExamplesMethods areaEx2 = new ExamplesMethods();
	ExamplesMethods areaEx3 = new ExamplesMethods();
	ExamplesMethods areaEx4 = new ExamplesMethods();
	ExamplesMethods areaEx5 = new ExamplesMethods();
	// Call ringArea method with radii of concentric circles
	double rArea1 = areaEx1.ringArea(1,2);		// expected value: 9.42477796076938
	double rArea2 = areaEx2.ringArea(2,1);		// expected value: 9.42477796076938
	double rArea3 = areaEx3.ringArea(1,1);		// expected value: 0
	double rArea4 = areaEx4.ringArea(5,6);		// expected value: 34.55751918948772
	double rArea5 = areaEx5.ringArea(10,5);		// expected value: 235.61944901923448

	// TASK 2
	// Instantiate objects of ExamplesMethods type to test rotate method
	ExamplesMethods rotateEx1 = new ExamplesMethods();
	ExamplesMethods rotateEx2 = new ExamplesMethods();
	ExamplesMethods rotateEx3 = new ExamplesMethods();
	ExamplesMethods rotateEx4 = new ExamplesMethods();
	ExamplesMethods rotateEx5 = new ExamplesMethods();
	// Use rotate method on various cases
	String rotated1 = rotateEx1.rotate("Hello", 3);		// expected: "loHel"
	String rotated2 = rotateEx2.rotate("abridge", 5);	// expected: "geabrid"
	String rotated3 = rotateEx3.rotate("buffet", 6);	// expected: "buffet"
	String rotated4 = rotateEx4.rotate("see", 4);		// expected: "see"
	String rotated5 = rotateEx5.rotate("production", 8);// expected: "onproducti"
}
