package vechile.test;
import vechile.app.State;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;



public class StateTest {
	
	 State myState =new State();
	 
	 @BeforeEach
	 public void init() {
		 //myState= new State();
	 }
	@Test
	public	void testTempReadCalling(){
		System.out.println("Temp Function Calling Test Case Started");
		myState.bValidateHighPerformance();
		assertEquals(1,State.validateCall);
	}

}
