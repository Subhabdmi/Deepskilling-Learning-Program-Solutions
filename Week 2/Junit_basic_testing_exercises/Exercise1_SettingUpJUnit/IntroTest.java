import org.junit.Assert;
import org.junit.Test;

public class IntroTest {
    @Test
    public void test(){
        Intro ob=new Intro();
        Assert.assertEquals("My name is Subhalakshmi Sarkar.", ob.MyIntro());

    }
}
