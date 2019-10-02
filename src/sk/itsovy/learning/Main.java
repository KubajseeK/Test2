package sk.itsovy.learning;

import sk.itsovy.kubik.other.Goulash;

public class Main {

    public static void main(String[] args) {
        Person person1;
        person1 = new Person();

        Person person2 = new Person();
        person1.setName("Dominik");
        person2.setName("Lucia");
        person1.setAge(30);
        person1.setHeight(1.76);
        person1.setWeight(76);
        person1.setMale(true);
        person1.setStatus('M');

        Mobile mobile1 = new Mobile();
        mobile1.setBrand("iPhone");
        mobile1.setModel("XS");
        mobile1.setPhoneNumber("+421917827658");
        Mobile mobile2 = new Mobile("Samsung", "S10", "0917287643");
        person1.setMobile(mobile2);

        Car car1 = new Car("Audi", "S7", 2017, 176);
        person1.setCar(car1);

        Calculator calc1 = new Calculator("Cassio BebeDobreRano1");
        person1.setCalculator(calc1);


        //person1.setMobile(mobile1);
        System.out.println(person1.sayHi()); //sayHi je vratná metóda (return) potrebujem ju vypísať do sout.
        person1.sayHello(); //sayHello je prázdna metóda, nepotrebujem ju ukončiť príkazom return.
        person2.about();
        System.out.println(person1.calculateBMI());
        System.out.println(person1.getBMIStatus());
        System.out.println(person1.getYearOfBirth());
        //person1.setAge(20);
        System.out.println("Dominik is: " + person1.getAge());
        Person student = new Person("Retard", 19, true, 1.78, 76, 'S');
        person1.print();
        if (person1.hasCalculator()) {
            calc1.turnOn();
            System.out.println(person1.getCalculator().add(50, 50));
            System.out.println(person1.getCalculator().convertDecimalToHexadecimal(4000));
            System.out.println("-----------------------------------------------------------");
            System.out.println(person1.getCalculator().calculateRectangleDiagonal(5, 6));
        }
        Goulash obj = new Goulash();
        obj.sayNHello(12);
        obj.sayHi();
        obj.sayNHi(9);
		System.out.println("------------------------------------------------");
		System.out.println(person1.getCalculator().calculateCircleArea(5));
		System.out.println(obj.getEvenNumber(11));
		System.out.println(person1.getCalculator().getAverageNumber(13, 4, 89));
		System.out.println(obj.getPozicka(12, 0.05, 9000));
		System.out.println("-----------------------------------------------------------------");
		//obj.test();
		obj.addingNumbers();
		obj.primeNumberChecker(12);
        System.out.println("----------------------------------------------------------------------------");
        //obj.biggestDelitel();
        obj.uloha8(6);

    }
}


