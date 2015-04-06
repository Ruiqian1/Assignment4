public class RoomDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room = new Room();// declare a new Room class
		System.out.println(room);// print out the description
		Room anotherroom = new Room("purple", "tiled", 0);// set a new Room
															// class with
															// different
															// information
		System.out.println(anotherroom);// print out the description
		Room thirdroom = new Room();// declare a new Room class
		thirdroom.setcolor("white");// set the values inside the Room Class
		thirdroom.setfloor("carpeted");
		thirdroom.setwindows(3);
		System.out.println(thirdroom);// print out the description
		Room test = new Room();// declare a new Room class
		test.color = "red";// set the values inside the Room Class
		test.floor = "wood";
		test.windows = 3;
		System.out.println(test);
		System.out.println(test.getcolor());
		System.out.println(test.getfloor());
		System.out.println(test.getwindow());
	}

}
