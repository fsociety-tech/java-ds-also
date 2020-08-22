package interfaces;

public abstract interface Youtuber extends VideoEditor {

	
	abstract void makevideos();
	
	default void upload() {
		System.out.println(" upload video");
	}
	
}
