package TestLogic;

import Logic.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import Logic.Main;

import java.util.LinkedList;
import java.util.List;

public class TestMain {
    @Test
    public void testListToJson_empty (){
        List <Employee> emptyList = new LinkedList<>();
        final String emptyString = "[]";
        String result = Main.listToJson(emptyList);
        Assertions.assertEquals(emptyString,result);
    }

    @Test
    public void testListToJson1 (){
        List <Employee> list = new LinkedList<>();
        list.add(new Employee(123,"Viacheslav","Sharkovskii", "Sweden",30));
        final String string = "[\n" +
                "  {\n" +
                "    \"id\": 123,\n" +
                "    \"firstName\": \"Viacheslav\",\n" +
                "    \"lastName\": \"Sharkovskii\",\n" +
                "    \"country\": \"Sweden\",\n" +
                "    \"age\": 30\n" +
                "  }\n" +
                "]";
        String result = Main.listToJson(list);
        Assertions.assertEquals(string,result);
    }

    @Test
    public void testListToJson2 () {
        List<Employee> list = new LinkedList<>();
        list.add(new Employee(123, "Viacheslav", "Sharkovskii", "Sweden", 30));
        list.add(new Employee(13, "Pavel", "Bum", "Russia", 98));
        final String string = "[\n" +
                "  {\n" +
                "    \"id\": 123,\n" +
                "    \"firstName\": \"Viacheslav\",\n" +
                "    \"lastName\": \"Sharkovskii\",\n" +
                "    \"country\": \"Sweden\",\n" +
                "    \"age\": 30\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 13,\n" +
                "    \"firstName\": \"Pavel\",\n" +
                "    \"lastName\": \"Bum\",\n" +
                "    \"country\": \"Russia\",\n" +
                "    \"age\": 98\n" +
                "  }\n" +
                "]";
        String result = Main.listToJson(list);
        Assertions.assertEquals(string, result);
    }
}
