package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            // begin loop
            // use `counter` to identify the `current Person` in the array
            Person person = personArray[counter];
            // get `string Representation` of `currentPerson`
            String str = person.toString();
            // append `stringRepresentation` to `result` variable
            result += str;
            //increment
            counter++;
        }
        // end loop
        return result;
    }


    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        for (int i = 0; i < personArray.length; i++) {
            // begin loop
            // use `counter` to identify the `current Person` in the array
            Person person = personArray[i];
            // get `string Representation` of `currentPerson`
            String str = person.toString();
            // append `stringRepresentation` to `result` variable
            result += str;
            // end loop
        }
        return result;
    }


    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for (Person person : personArray) {
            // use the above discoveries to declare for-each-loop signature
            // begin loop
            String str = person.toString();
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result += str;
            // end loop
        }
        return result;
    }
}
