import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Lists
{
    public static void main(String[] args) {
        // In Java lists are part of Collections, we have several types of lists:
        // ArrayList, LinkedList, Vector

        // Creating LinkedList creates a mutable collection
        List<String> li1 = new LinkedList< String >();

        li1.add("list");
        li1.add("set");
        li1.add("dictionary");

        // Creating List from Array creates immutalbe collection
        List<Object> li2 = Arrays.asList( "one", "1", 2, "two", "three", 4, 5 );
        List<String> li3 = Arrays.asList( "str", "hex", "dec" );

        System.out.println( "Type of li1: " + li1.getClass().getName() );
        System.out.println( "Type of li2: " + li2.getClass().getName() );
        System.out.println( "Type of li3: " + li3.getClass().getName() );

        // elements can be appended to list
        li1.add("added");

        //  lists can be very easy printed, no special function needed
        System.out.println( "li1: " + li1 );

        // elements can be removed from list using .remove method
        li1.remove("added");
        System.out.println( "li1: " + li1 );

        // lists can be merged using Java8 streams
        List<String> li4 = Stream.concat(
             li1.stream(),
             li2.stream().filter(String.class::isInstance).map(String.class::cast).collect(Collectors.toList()).stream()
             ).collect(Collectors.toList());

        // Or simple using addAll method
        List<String> li5 = new LinkedList<String>();
        li5.addAll(li1);
        li5.addAll(li2.stream().filter(String.class::isInstance).map(String.class::cast).collect(Collectors.toList()));

        System.out.println( "li1 + li2 using stream.concat: " + li4 );
        System.out.println( "li1 + li2 using List.addAll: " + li5 );

        // Java does not have build in support for list comprehension
        // but we can use java8 streams for simulating list comprehension
        // by mapping element with mapper

        // li6 is a list of elements from li2 that satisfy is Integer condition
        List<Integer> li6 = li2.stream().filter(Integer.class::isInstance).map(Integer.class::cast).collect(Collectors.toList());
        System.out.println( "li2 filtered to numbers only: " + li6 );

        List<String> li7 = li2.stream().filter( x -> x instanceof String && ((String)x).length() > 4 ).map( String.class::cast ).collect(Collectors.toList());
        System.out.println( "li2 filtered to strings with len bigger than 4: " + li7 );
    }
}
