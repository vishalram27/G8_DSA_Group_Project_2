package com.gl.gradedassignment.question2;

import java.util.Stack;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public void insert(int data) {
		if (this.root == null) {
			this.root = new Node(data);
		} else {
			Node current = this.root;
			while (current != null) {
				if (data < current.data) {
					if (current.left == null) {
						current.left = new Node(data);
						break;
					} else {
						current = current.left;
					}
				} else {
					if (current.right == null) {
						current.right = new Node(data);
						break;
					} else {
						current = current.right;
					}
				}
			}
		}
	}

	public void inorderTraversal() {
		if (this.root == null) {
			return;
		}

		Stack<Node> stack = new Stack<>();
		Node current = this.root;
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				current = stack.pop();
				System.out.print(current.data + " ");
				current = current.right;
			}
		}
	}
}

class Node {

	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
