package interfaces;

public class Person implements Student , Youtuber {
	

	public static void main(String[] args) {
Person obj = new Person();
//obj.study();
//obj.makevideos();

Youtuber obj2 = obj;
obj.makevideos();
obj.vidoedit();
obj.upload();
	}

	@Override
	public void study() {
System.out.println(" person is studying ");		
	}

	@Override
	public void makevideos() {
System.out.println(" person is making a good video");		
	}

	@Override
	public void vidoedit() {
System.out.println(" Person is editing a video");		
	}

}
