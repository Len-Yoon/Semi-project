package Interface;

public interface ChildInterface2 extends ParentInterface {
	
	@Override
	default void method2() {
		//실행문   //재정의
	}
	public void method3();
}
