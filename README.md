Synchronized Printing in Java with Threads
This project demonstrates the usage of Java's synchronized keyword to handle multiple threads accessing the same resource (in this case, printing to the console) while ensuring that only one thread prints at a time.

Overview
In this project, three different threads (Thread1, Thread2, Thread3) are created, each of which will print a message to the console. The Print class contains a synchronized print() method, ensuring that only one thread can execute it at a time. This synchronization prevents the console from getting jumbled with multiple threads printing simultaneously.

Key Concepts
Threading: Multiple threads are created and executed concurrently.
Synchronization: The synchronized keyword ensures that only one thread can execute the print() method at a time.
Thread.sleep(): The Thread.sleep(1000) is used to simulate a delay of 1 second in each thread.
