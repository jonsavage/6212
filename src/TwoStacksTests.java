import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TwoStacksTests {
	
	TwoStacks<Integer> twoStacks;
	
    @Before
    public void setUp() {
    	twoStacks = new TwoStacks<Integer>();
    }
    
    
	@Test
	public void push1_PushOneElement_SameElementShallBeReturnedWhenPopping() {
		int someInt = 5;
		twoStacks.push1(someInt);
		
		assertSame(someInt, twoStacks.pop1());
	}
	
	@Test
	public void push1_PushFourElements_SameElementsShallBeReturnedInCorrectOrderWhenPopping() {
		int someInt1 = 1;
		int someInt2 = 2;
		int someInt3 = 3;
		int someInt4 = 4;
		
		twoStacks.push1(someInt1);
		twoStacks.push1(someInt2);
		twoStacks.push1(someInt3);
		twoStacks.push1(someInt4);
		
		assertSame(someInt4, twoStacks.pop1());
		assertSame(someInt3, twoStacks.pop1());
		assertSame(someInt2, twoStacks.pop1());
		assertSame(someInt1, twoStacks.pop1());
	}
	
	@Test
	public void push1_PushManyElements_SameElementsShallBeReturnedInCorrectOrderWhenPopping() {
		int someInt1 = 1;
		int someInt2 = 2;
		int someInt3 = 3;
		int someInt4 = 4;
		int someInt5 = 5;
		int someInt6 = 6;
		int someInt7 = 7;
		int someInt8 = 8;
		int someInt9 = 9;
		int someInt10 = 10;
		int someInt11 = 11;
		
		twoStacks.push1(someInt1);
		twoStacks.push1(someInt2);
		twoStacks.push1(someInt3);
		twoStacks.push1(someInt4);
		twoStacks.push1(someInt5);
		twoStacks.push1(someInt6);
		twoStacks.push1(someInt7);
		twoStacks.push1(someInt8);
		twoStacks.push1(someInt9);
		twoStacks.push1(someInt10);
		twoStacks.push1(someInt11);
		
		assertSame(someInt11, twoStacks.pop1());
		assertSame(someInt10, twoStacks.pop1());
		assertSame(someInt9,  twoStacks.pop1());
		assertSame(someInt8,  twoStacks.pop1());
		assertSame(someInt7,  twoStacks.pop1());
		assertSame(someInt6,  twoStacks.pop1());
		assertSame(someInt5,  twoStacks.pop1());
		assertSame(someInt4,  twoStacks.pop1());
		assertSame(someInt3,  twoStacks.pop1());
		assertSame(someInt2,  twoStacks.pop1());
		assertSame(someInt1,  twoStacks.pop1());
	}
	
	@Test
	public void tester() {
		int someInt1 = 1;
		int someInt2 = 2;
		int someInt3 = 3;
		int someInt4 = 4;
		
		twoStacks.push1(someInt1);
		twoStacks.push1(someInt2);
		twoStacks.push1(someInt3);
		twoStacks.push1(someInt4);
		
		twoStacks.printArray();
	}

}
