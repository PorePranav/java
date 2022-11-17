package MapsCollection;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java"))
            System.out.println("Java already exists");
        else {
            languages.put("Java", "a compiled, high-level, object oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "an interpreted, object oriented, high level language with dynamic semantics");
        languages.put("Algol", "algorithmic language");
        System.out.println(languages.put("BASIC", "beginners all purposes symbolic instruction code"));
        System.out.println(languages.put("Lisp", "therein lies madness"));

        if(languages.containsKey("Java"))
            System.out.println("Java is already in the map");
        else
            System.out.println(languages.put("Java", "this course is about Java"));

        //languages.remove("Lisp");
        if(languages.remove("Algol", "algorithmic language"))
            System.out.println("Algol removed");

        if(languages.replace("Lisp", "therein lies madness", "a functional programming language with imperative features"))
            System.out.println("Lisp replaced");
        else
            System.out.println("This will not work");
        System.out.println(languages.replace("Scala", "this will not be added"));
        for(String key : languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }

    }
}
