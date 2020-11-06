import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
  
@Test
public void testNothing(){
    
}

@Test
public void testSomeStuff(){
  int a = 2;
  int b = 3;
  assertEquals("1. Methode gescheitert",(a+b),5);


  boolean z;
  int x = 50;
  int y = 45;
  if ( x < y ){
    z = true;
  }else {
    z = false;
  }
  assertFalse("2. Testmethode gescheitert", z);


  String temp = "";
  assertNull("3. Testmethode gescheitert",temp);
}

}