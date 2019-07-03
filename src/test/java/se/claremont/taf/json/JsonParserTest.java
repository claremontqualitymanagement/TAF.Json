package se.claremont.taf.json;

import org.junit.Assert;
import org.junit.Test;
import se.claremont.taf.core.testcase.TestCase;
import se.claremont.taf.core.testset.UnitTestClass;

/**
 * Tests to assure JsonParser works as expected
 *
 * Created by jordam on 2016-10-28.
 */
public class JsonParserTest extends UnitTestClass{

    @Test
    public void nullJsonGet(){
        Assert.assertNull(new Json(new TestCase(), null).get(""));
    }

    @Test
    public void nullParameterNameGet(){
        Assert.assertNull(new Json(new TestCase(), "").get(null));
    }

    @Test
    public void nullJsonGetInt(){
        Assert.assertNull(new Json(new TestCase(), null).getInt(""));
    }

    @Test
    public void nullParameterNameGetInt(){
        Assert.assertNull(new Json(new TestCase(), "").getInt(null));
    }

    @Test
    public void positiveIsJsonCheck(){

        String contentSample = "{\"menu\": {\n" +
                "  \"id\": \"file\",\n" +
                "  \"value\": \"File\",\n" +
                "  \"popup\": {\n" +
                "    \"menuitem\": [\n" +
                "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n" +
                "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n" +
                "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n" +
                "    ]\n" +
                "  }\n" +
                "}}";
        Assert.assertTrue(new Json(new TestCase(), contentSample).isJson());
    }

    @Test
    public void negativeIsJsonCheck(){
        Assert.assertFalse(new Json(new TestCase(), "sdgfsdgf:sdgfasdf. asdfasdg, asdgas;asdgasdg{}()").isJson());
    }
}
