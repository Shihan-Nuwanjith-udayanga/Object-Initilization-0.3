class Box{
	int length;	
	int width;	
	int height;	
	Box(int length, int width, int height){ 
		this.length=length;
		this.width=width;
		this.height=height;
		System.out.println("Box(int,int,int)");
	}
	Box(int length){ 
		this.length=length;
		this.width=length;
		this.height=length;
		System.out.println("Box(int)");
	}
	Box(){ 
		this.length=10;
		this.width=10;
		this.height=10;
		System.out.println("Box()");
	}
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box : "+volume);
	}
	public void setSize(int length, int width, int height){ 
		this.length=length;
		this.width=width;
		this.height=height;
	}
}
class Example{
	public static void main(String args[]){
		Box b1=new Box(); 
		b1.printVolume();
		
		Box b2=new Box(5);
		b2.printVolume();
		
		Box b3=new Box(12,5,3);
		b3.printVolume();
	}
}
