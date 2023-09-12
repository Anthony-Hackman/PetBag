package petBAG;

public class Dog {
		private int dogSpaceNumber;	// the space # used for boarding
		private int dogWeight;		// the Dogs weight for ...
		private int grooming;		/* True false for grooming calculation?
	 								Maybe try boolean instead of integer.*/
	//constructor
		public Dog()
		{
		dogSpaceNumber = -1;
		dogWeight = -1;
		grooming = -1;
		}
	
	//access and mutators
		public void setDogSpaceNumber(int ds)
		{
			dogSpaceNumber = ds;
		}
		public int getCatSpaceNumber()
		{
			return dogSpaceNumber;
		}
			public void setDogWeight(int dw)
		{
			dogWeight = dw;
		}
			public int getWeight()
		{
				return dogWeight;
		}
			public void setGrooming(int g)
		{
				grooming = g;
		}
			public int getGrooming()
		{
			return grooming;
		}
}
