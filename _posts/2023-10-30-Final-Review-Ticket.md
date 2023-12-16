---
toc: true
comments: true
layout: post
title: Final Review Ticket
type: ticket
courses: { csa: {week: 11} }
---

# Trimester reflection
- I most learned about new things in JAVA, and how to succeed in the AP exam
  - I'm glad I learned how to apply the web dev concepts I learned about last year to this year, and was able to lead my team to learning about it as well
  - I'm also glad I'm preparing early for the AP exam
- Leadership
  - I enjoy taking on the leadership role in my group and participating from a "teacher" perspective
  - It helped me learn more in order to 


# Collegeboard MCQ
- I scored a solid 40/40 on my CB exam
<a href="https://ibb.co/cQGgpk9"><img src="https://i.ibb.co/w490bBq/image.png" alt="image" border="0"></a>

- Something I struggled with was thinking about recursion, I spent the longest time there. I have to adjust my thinking away from the typical mindset of loops and create tables for each iteration, keeping track of the different variables

**Question:**
Consider the following code:

```java
public class RecursionExample {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println("The factorial of 4 is: " + result);
    }
}
```

What is the output of the above code?

A) 4  
B) 12  
C) 24  
D) 120

**Answer:**
**Correct Answer: C) 24**

**Explanation:**
The given code defines a recursive function `factorial` to calculate the factorial of a number. In the `main` method, it calls `factorial(4)`. Let's break down the recursion:

- `factorial(4)` calls `4 * factorial(3)`
- `factorial(3)` calls `3 * factorial(2)`
- `factorial(2)` calls `2 * factorial(1)`
- `factorial(1)` returns 1 (base case)

Now, substitute the values back:

- `factorial(2)` returns `2 * 1 = 2`
- `factorial(3)` returns `3 * 2 = 6`
- `factorial(4)` returns `4 * 6 = 24`

So, the output of the code is 24, making option C the correct answer.