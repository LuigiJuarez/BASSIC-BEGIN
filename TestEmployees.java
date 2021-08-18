class TestEmployees {
public static void main(String[ ] args) {

System.out.println("Employee  --->");

Employee e1 = new Employee("Anna", "05/Mar", 1500);
System.out.println( e1.getDetails( ) );
System.out.println( e1.payment(10.0) );
// System.out.println( e1.getDept( ) );  	 // ---->> Error: Employee no tiene este método

System.out.println();
System.out.println("Subclass Manager  --->");

Manager m1 = new Manager("Nicole", "14/Feb", 2000, "Sales");
System.out.println( m1.getDetails( ) );
System.out.println( m1.payment(10.0) );
System.out.println( m1.getDept( ) );


Employee worker;             // ---->> Referencia Polimórfica

System.out.println();
System.out.println("Referencia Polimorfica a Employee  --->");

worker  =  e1;
System.out.println( worker.getDetails ( ) );
System.out.println( worker.payment(10.0) );
// System.out.println( worker.getDept( ) );  	 // ---->> Error: la clase Employee no tiene este método

System.out.println();
System.out.println("Referencia Polimorfica a Manager  --->");

worker  =  m1;
System.out.println( worker.getDetails ( ) );                 // ---->> Virtual Method Invocation 
System.out.println( worker.payment(10.0) );
// worker.getDept( );                    // ---->> Error: aunque el objeto es un Manager la referencia se declaro Employee
System.out.println(     ( (Manager)worker ).getDept( )     );                // ---->> Cast: elimina el error previo 

Employee [ ] staff = new Employee[2]; // ---->> Arreglo Polimórfico
staff[0] = e1;
staff[1] = m1;

                                         // ---->> Efectos de Overload y Override  :

System.out.println();
System.out.println("Efectos de Overload y Override  --->");

System.out.println( e1.payment(5.0 ) );               
System.out.println( e1.payment(10.0, 2.0) );
System.out.println( m1.payment(15.0, 3.0) );
System.out.println( worker.payment(15.0, 3.0)  );

                                         // ---->> Invocación a constructores con super  :

System.out.println();
System.out.println(" Invocacion a constructores con super  --->");

Employee e2 = new Employee("Tom");
Employee e3 = new Employee("Will", "25/Apr");
Manager   m2 = new Manager("Angelina", "Production");

System.out.println( e2.getDetails ( ) );
System.out.println( e3.getDetails ( ) );
System.out.println( m2.getDetails ( ) );     

}

}
