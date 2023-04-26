# Build Queuing classes

#### c. Show how you would improve the design of your classes, apply various design patterns and techniques as you see fit
<p> I would first of all replace the data type for the queue and stack using generic type instead of string type. This would let the queue or stack to contain different data type instead of being restricted to string <p>

<p> Secondly, I would use arraylist instead of array as arraylist is a flexible and resizeable array in which the size of an arraylist can be modified dynamically </p>

<p> Other than that, I would apply the singleton pattern. This would ensure that only one instance of the queue or stack is created; hence preventing the queue or stack from being modified by other class. </p>

<p> Lastly, I would also apply the factory pattern. This would allow the user to create a queue or stack without having to know the implementation details of the queue or stack. </p>
