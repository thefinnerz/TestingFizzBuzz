import org.example.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;
public class TestCheckFizzBuzz {
    @Test
    public void TestFizz(){
        String actual = FizzBuzz.CheckFizzBuzz(3);
        String expected = "Fizz";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBuzz(){
        String actual = FizzBuzz.CheckFizzBuzz(5);
        String expected = "Buzz";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestFizzBuzz(){
        String actual = FizzBuzz.CheckFizzBuzz(15);
        String expected = "FizzBuzz";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestNumber() {
        String actual = FizzBuzz.CheckFizzBuzz(1);
        String expected = "1";
        Assert.assertEquals(expected,actual);
    }
}
