# FindDuplicate
Duplicate finder algorithm in Java. Runtime: O(n)

A faster algorithm than other duplicate finder algorithm but it has its limitations.

Built for finding duplicates from a list of numbers but it can be easily modifiable for list of strings or chars.

Prints the duplicate if found.

### Limitations
1. Numbers in the list should not be larger than the length of the list
2. Zero should not be in the list

### Test Cases
```int[] array = {5,4,2,4,5,2,3,7,7,1,10};```

```Output: 4,5,2,7```

```int[] array = {2,4,6,8,2,6,3,5,6,12,4,6,8,2,4,11,10,13,12};```

```Output: 2,6,6,4,6,8,2,4,12```

### How to run the program
1. Clone or copy and paste the code in src/Duplicate.java
2. Open Command Line
3. Go to the directory of the program
4. Modify the list of numbers in the code
5. Type ```javac Duplicate.java```
6. Type ```java Duplicate```

### Copyright
NO COPYRIGHT

### Last Words
Please star the repo if you find it useful :)

I know this algorithm is not perfect so please email me if you have some suggestions on how to improve it
