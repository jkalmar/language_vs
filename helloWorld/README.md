This is a kotlin example.
========================  
Kotlin is a language that can use rich Java library ecosystem but at the same time
provides a less verbose syntax.

How to run
==========

 1. using InteliJ IDEA IDE
 2. using command line

  
In IDE it is straigforward, just import the file and hit build then run.

Running using command line
--------------------------
1. Compile the *.kt* file
    ```
    kotlinc -include-runtime HelloWorld.kt -d Hello.jar
    ```
2.  Run the resulting *.jar* file
    1. By kotlin wrapper
        ```
        kotlin Hello.jar
        ```
    2. By java
        ```
       java -jar Hello.jar
        ```
    3. By java specifying class name with main. `Kotlinc` generated java class from
    your *.kt* file. The name of the generated java class is *FileName***Kt**
        ```
        java -classpath Hello.jar HelloWorldKt
        ```
