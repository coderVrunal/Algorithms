# Divide and Conquer

Use recursive paradigm in general.
The problems are broken down in two or more sub problems
Rather than single smaller subproblems


## Merge Sort
Can be solved as top down or bottom up

Intuition:
    1. Divide given unsorted list into several sub list
    2. Sort each sublists recursively
    3. Merge the sorted sublists to produce new sorted lists

### Top-down approach:
    The step two of D&C, divide the array till only one or empty elements remain.
    Thus we reduced the problem into merge N sorted lists
    Which would take O(N) time in total. Since merge of two sorted lists is O(size of lists);

    


