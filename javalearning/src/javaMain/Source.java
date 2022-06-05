package javaMain;

public class Source {
	
	public static void main(String args[]) {
		int[] votes= {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
		int userWithMostVotes= mostVotes(votes);
		System.out.println("User with the most votes is User: "+ userWithMostVotes );
		
	}
	public static int mostVotes(int max[]) {
		int top=0;
		int winner=0;
		for(int i=0;i<max.length;i++) {
			if(max[i]>top) {
				top=max[i];
				winner=i;
			}
			
		}return winner;
		
	}

}
