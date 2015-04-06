public class Room {
	public String color;
	public String floor;
	public int windows;
	public Room(){//default constructor
		this.color="yellow";
		this.floor="hard wood";
		this.windows=1;
	}
	public Room (String color, String floor, int windows){ //non default constructor
		this.color=color;
		this.floor=floor;
		this.windows= windows;
		
	}
//declare all the setters and the getters
  public String getcolor (){
	  return color;
  }
  public void setcolor (String color){
	  this.color= color;
  }
  public String getfloor (){
	  return floor;
  }
  public void setfloor (String floor){
	  this.floor= floor;
  }
  public int getwindow (){
	  return windows;
  }
  public void setwindows (int windows){
	  this.windows=windows;
  }
  public String toString (){//create a new method to print out the description about the information inside the Room class
	  return "The color of the wall in the house is "+this.color+", the floor is "+this.floor+" floor, and the room has "+this.windows+" window(s).";
  }
}
