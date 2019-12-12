# Principle of Recursion

Everytime a recursive function calls itself, it reduces the given problem into subproblems.

The recursion problem reaches a certain point, we it can be solved without needing to reduce it any further.

Properties of recursion, so that it does not go into infinte loop:

1. Base case - Terminating condition
2. Recurrence relation - reduced each problem towards the base case


# Duplicate calulation in recursion
Intermediate results are calculated multiple times
<u>Memoization<u> is a common technique to avoid this problem

F(n) = F(n-1) + F(n-2)

while F(0)= 0, F(1) = 1

eg. Fibonacci

WE can avoid/speed up  caculations by storing intermediate results of function calls.

#Time Complexity    
it is the product of number of recursion invocations (R) and the complexity of each calculation O(s).

T : = R *O(s).

The number of recursion calls are not always linear. Hence refer to the execution tree.
Where total number of nodes in the tree corresponds to number of recursion calls during execution.


# Space Complexity
Recursion related space and non-recursion related space


## Recursion related space:
In order to complete a function call, system allocates some space in stack to hold three important information.

1. Returning address to function call. Once function is completed
2. Parameters passed to function call
3. Local variables of each function call

# Tail Recursion

The benefit of having tail recursion is that it could avoid the accumulation of stack overheads during the recursive calls, since the system could reuse a fixed amount space in the stack for each recursive call. 

