import java.io.*;
import java.util.*;

import javax.script.*;

public class NashornDemo {
    public static void main(String[] args) {
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            List<ScriptEngineFactory> list = mgr.getEngineFactories();

            list.forEach((x)->System.out.println(x.getEngineName()));

            // ScriptEngine engine = mgr.getEngineByName("JavaScript");

            // engine.eval("print('Hello everyone')");

            // ScriptEngine engine = mgr.getEngineByName("nashorn");
            ScriptEngine engine = mgr.getEngineByName("graal.js");

            engine.eval(new FileReader("demo.js"));

            Invocable inv = (Invocable) engine;
            inv.invokeFunction("abc");
            inv.invokeFunction("add", 10, 20);
            inv.invokeFunction("greet", "Sanchit");


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// This file wont run because in java 17 there is no inbuilt engine so we can either include dependencies in pom.xml file in sts ide or we can install jar file of that engine
