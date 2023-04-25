# A. Build Queuing classes
#### a. Write 2 classes to implement the following IQueuable interface

    Interface IQueuable {
        //adds value to queue and returns new queue
        enqueue(value: string): string[];
        //removes item from queue, and returns the item removed
        dequeue(): string;
        //returns a list of all the items in the queue
        getQueue(): string[];
        //returns the number of items in the queue
        size():number;
    }

<p>Build your queues ontop of arrays; call your classes FIFOQUEUE and LIFOQUEUE (first-in first-out & last-in first-out) queues, or QUEUE and STACK, whichever names you prefer.</p>

#### c. Show how you would improve the design of your classes, apply various design patterns and techniques as you see fit
<p> I would first of all replace the data type for the queue and structure using generic type instead of string type. This would let the queue or stack to contain different data type instead of being restricted to string <p>

<p> Other than that, I would apply the singleton pattern. This would ensure that only one instance of the queue or stack is created; hence preventing the queue or stack from being modified by other class. </p>

<p> Lastly, I would also apply the factory pattern. This would allow the user to create a queue or stack without having to know the implementation details of the queue or stack. </p>