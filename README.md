# The Dining Philosophers Problem 
**The Dining Philosopher Problem** states that K philosophers seated around a circular table with one chopstick between each pair of philosophers. There is one chopstick between each philosopher. Philosophers are either thinking or eating. Whenever a philosopher wishes to eat, s/he first needs to find two chopsticks. S/he may eat if he can pick up the two chopsticks adjacent to him. One chopstick may be picked up by any one of its adjacent followers but not both. If the hungry philosopher does not have two chopsticks (i.e. one or two of her neighbors already picked up the chopstick) s/he will have to wait until both chopsticks are available. When a philosopher finishes eating, s/he puts down both chopsticks to their original places, and resumes thinking. There is an infinite amount of food on their plate, so they only need to worry about the chopsticks.
- Philosophers are either thinking or eating. They do not talk to each other.
- Philosophers can only fetch chopsticks placed between them and their neighbors. • Philosophers cannot take their neighbors’ chopsticks away while they are eating.

## Parameter
Just enter the number of philosophers you want on the table.

> Threads are used for concurrent process management.