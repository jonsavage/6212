import java.util.Arrays;

@SuppressWarnings("unchecked")
public class TwoStacks<T> {
	private Object[] storage;
	private final int INITIAL_SIZE = 10;
	private final int EXPANSION_RATE = 2;
	private int topElementIndexFor1;
	private int topElementIndexFor2;
	
	public TwoStacks() {
		storage = new Object[INITIAL_SIZE];
		topElementIndexFor1 = 0;
		topElementIndexFor2 = INITIAL_SIZE / 2;
	}
	
	public void push1(T thingToPush) {
		if (topElementIndexFor1 + 1 > storage.length- 1)
			expandStorage();
		
		storage[++topElementIndexFor1] = thingToPush;
	}
	
	
	public T pop1() {
		return (T) storage[topElementIndexFor1--];
	}
	
//	public void push2(T thingToPush) {
//		if (topElementIndexFor2 + 1 < storage.length)
//			expandStorage();
//		
//		storage[++topElementIndexFor2] = thingToPush;
//	}
//	
//	
//	public T pop2() {
//		return (T) storage[topElementIndexFor2--];
//	}
	
	private void expandStorage() {
		Object[] newStorage = new Object[storage.length + INITIAL_SIZE * EXPANSION_RATE];
		
		for (int i = 0; i <= topElementIndexFor1; i++){
			newStorage[i] = storage[i];
		}
		
//		for (int i = newStorage.length / 2; i <= newStorage.length / 2; i++) {
//			newStorage[i] = storage[i];
//		}
		
		storage = newStorage;
	}
	
	public void printArray() {
		Arrays.toString(storage);
	}
}
