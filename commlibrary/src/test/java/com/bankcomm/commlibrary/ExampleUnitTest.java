package com.bankcomm.commlibrary;

import com.bankcomm.commlibrary.http.RestClient;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void httpAnnotationTest() {

        RestClient client = new RestClient();
        TestApi api = client.create(TestApi.class);
        try {
            api.getTest("testValue");

            System.out.print("asda");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}