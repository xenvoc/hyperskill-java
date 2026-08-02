package org.spring.restresponsebodies.controller;

@RestController
public class DemoController {

    @GetMapping("/person")
    public Person getPerson() {
        return new Person("John", "Doe", 25);
    }

    public class Person {
        private String firstName;
        private String lastName;
        private int age;

        public Person(String firstName, String lastName, int age) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.age = age;
        }
    }
}
