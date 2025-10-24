package programmer.zaman.now.maven;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args)
    {
        Gson gson = new Gson();

        Person person = new Person("Mohamad Naufal Azizi");
        String json =gson.toJson(person);
        System.out.println(json);
    }
}
