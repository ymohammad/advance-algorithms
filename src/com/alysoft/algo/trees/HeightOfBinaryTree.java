package com.alysoft.algo.trees;

/**
 * Given a binary tree, find height of it.

        1
     /     \
   10      39
  /
5
The above tree has a height of 3.
Note: Height of empty tree is considered 0.

Input Format:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains two lines of input. 
The first line contains number of edges. The second line contains relation between nodes.

Output Format:
For each testcase, in a new line, print the height of tree.

Your Task:
You don't have to take input. Complete the function height() that takes node as parameter and returns the height. 
The printing is done by the driver code.

Constraints:
1 <= T <= 100
1 <= Number of nodes <= 100
1 <= Data of a node <= 1000

Example:
Input:
2
2
1 2 L 1 3 R
4
10 20 L 10 30 R 20 40 L 20 60 R

Output:
2
3

Explanation:
Testcase1: The tree is
        1
     /      \
   3       2
So, the height would be 2.
Testcase2: The tree is
                           10
                        /        \
                     20         30
                  /       \
               40       60
So, height would be 3.
 * @author ymohammad
 *
 */
public class HeightOfBinaryTree
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	int height(Node node) 
    {
         if (node == null) return 0;
         
         int leftHeight = height(node.left);
         int rightHeight = height(node.right);
         return Math.max(leftHeight, rightHeight) + 1;
    }
}
