# COS212_Practical-10
# Implemented By: Mohamed Ameen Omar
# Department of Computer Science

### COS212: Practical 10 (Friday)

### Release: Thursday 18 May 2017

### Deadline: Friday 19 May 2017, 18:


## Instructions

Complete the tasks below. Certain classes have been provided for you in the files sub-folder
of the practical download. Modify the given main class to test the functionality of your
work. Remember to test corner cases. Upload only the given source files with your changes
in a zip archive before the deadline. Please comment your name and student number in at
the top of each file.

## Merge Sort - page 526

The problem with Quicksort is that its complexity in the worst case is O(n^2 ) because it is
difficult to control the partitioning process. The key process in Mergesort is merging sorted
halves of an array into one sorted array. However, these halves have to be sorted first,
which is accomplished by merging the already sorted halves of these halves. You have been
provided with the following file:Mergesort.javaa partially implemented file.

The following methods have been provided to you in theMergesort.javafile, which you
are not to modify:

private void collectOutput(T[] data)
That collects the output at each merge of sub-arrays.

public void toString()
Which provides you the output.

## Task [50]

Implement the following operations:

public void mergesort(T[] data)
The method takes in an array and sorts it.

public void merge(T[] data, int first, int last)
Merges two subarrays into one.

## Submission

Submit your source files on the CS Website. Place all the files in a zip archive named as
uXXXXXXXX.zip where XXXXXXXX is your student number. Please make use of the
submission slot that corresponds to your practical session (Practical 10 - Friday). Submit
your work before the deadline. No late submissions will be accepted.

#### 1


