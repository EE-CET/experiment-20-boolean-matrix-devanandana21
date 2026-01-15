[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/eN2Gnyvq)
# Experiment 20: Boolean Matrix

## Problem Statement

You are given a matrix `Mat` of $m$ rows and $n$ columns. The elements can only be either 0 or 1.
If any row of the matrix contains a 1, then you need to fill that whole row with 1.
After doing the mentioned operation, you need to return the modified matrix.

**Task:** Create a function `BooleanMatrixProblem` to implement this logic.

## Input Format

* The first line contains two integers $m$ and $n$.
* The next $m$ lines contain $n$ integers each (0 or 1).

## Output Format

Print the modified matrix.

### Example 1

**Input:**

```text
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
```

**Output:**

```text
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
```

**Explanation:**
* Row 1 contains a 1 -> Entire row becomes 1s.
* Row 2 contains no 1s -> Remains 0s.
* Row 3 contains a 1 -> Entire row becomes 1s.
* Row 4 contains no 1s -> Remains 0s.
* Row 5 contains a 1 -> Entire row becomes 1s.
