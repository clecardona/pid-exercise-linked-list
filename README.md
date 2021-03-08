# Linked list

This document contains a description of the assignments for the data
structure [linked list](https://en.wikipedia.org/wiki/Linked_list). From the lectures
you have acquired knowledge about what a linked list is. In short, it
is a dynamic data structure that is fast when adding elements to
it. Operations for searching and deleting can be a bit slow, however.

#### Recommended reading
- [Linked List (Brief)](https://www.youtube.com/watch?v=njTh_OwMljA&t)
- [Linked List (Detailed)](https://www.youtube.com/watch?v=WwfhLC16bis)
- [Linked List vs Array in Memory](https://www.youtube.com/watch?v=ir2gbu3Lj8s)

## Installing the Gradle build tool

The code for this exercise uses the [Gradle build
tool](https://gradle.org/). Therefore, the first step is to install
it. Instructions for installing Gradle are available in the [official
documentation](https://gradle.org/install/), which describes several
options. For installing Gradle on macOS, the recommendation is to use
the [Homebrew](https://brew.sh/) package manager:

    $ brew install gradle

The installation of Homebrew is explained on the [front
page](https://brew.sh/).

## Introduction

The general idea of the linked list is a chain of nodes. The first
node points to the second node, the second node points to the third
node etc. Linked list is available in the Java standard library and
there are many more operations than you would implement in this
assignment. The most common operations on linked list are `add`, 
`remove` and `size`. You will implement these four operations with the
help of a code template.

Make sure to read the code and comments carefully to understand how
the template works. It will facilitate your implementation of the
different operations.

#### Exercise 1: Add operation

Carefully review the `add` operation that was implemented in the
lecture. Try to understand all parts of the code. What are the
different classes and fields used for? How does the add method work
exactly?

Once you understand how the code for implementing the add operation
works, you have completed this exercise. :-)

#### Exercise 2: Search operation

Now that we are able to add data elements (integers) to the data
structure, we might want to search for some data based on its
value. This can be done iteratively, i.e., by starting at the first
node and checking each node until we find the element or reach
null. If we find the element the function should return the index
otherwise it should return -1.

#### Exercise 3: Get operation

Once you have a linked list and added a few elements to it, you might
want to get access to them. In this assignment you will implement a
`get` method which gets an element based on its index (i.e., its
position in the chain of nodes). This method can be implemented by
iterating through the list and returning the element when you have
reached the index given as the parameter.

#### Exercise 4: Size operation

This operation is a common operation for any data structure. There are
a lot of perks of knowing how many elements a data structure
contains. To implement the `size` operation you can iterate through
the list and increment a variable until you reach a null pointer. Then
you can return the variable that counts the number of elements.

> *Assistant's Note:*
> How can we utilise class fields to keep track of the size instead of
> iterating through the list every time we want to get the size of the
> linked list?

#### Bonus Exercise 5 (Optional): Remove operation

Now that we know how many elements our data structure has, we might
want to remove some when they are no longer needed to save some
space. The `remove` operation can utilise our `search` and `get`
operation. What we want to do is to remove an element and rearrange
the nodes. If this is done correctly we will not have any dangling
pointers, i.e., we have a broken chain and we lose a part of the data
structure.

#### Discussion

What are the advantages/disadvantages for a linked list in comparison to an array in terms of...
1. ...accessing an element (`get` operation)?
1. ...adding an element?
1. ...removing an element?
1. ...memory usage?
