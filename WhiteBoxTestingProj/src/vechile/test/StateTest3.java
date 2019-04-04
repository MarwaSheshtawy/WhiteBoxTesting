package vechile.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import vechile.app.State;
import vechile.hal.Temp;

public class StateTest3 {
 State myState= new State() ;
 
 @BeforeEach
public void init() {
	 //myState= new State();
 }
	@Test
	public void testbValidateHighPerformanceTc2(){
		System.out.println("High Performance Test Case 2 Started");
		myState.bValidateHighPerformance();
		// Soft Assertion to check all the assert statements even if one failed.
		assertAll(
			() ->	assertTrue(Temp.iReadT1()>50,"Temp Reading is greater than 50"),
			() ->	assertFalse(myState.bValidateHighPerformance(),"HIGH PERFORMANCE")
				);
	}

}
