# Algorithms

Algorithm is a set of instruction for accomplishing a task. Every piece of code could be called an algorithm.


In this repository we explain the most popular and interesting algorithm, because they're fast, or solve interesting problem, 
or both.

* **Binary algorithm:** Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering 
the whole array. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the 
lower half. Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.

We basically ignore half of the element just after one comparison.
  
  1. Compare X with the middle element.
  2. If X matches with the middle element, we return the mid index.
  3. Else if X is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.   
  4. Else (x is smaller) recur for the left half.