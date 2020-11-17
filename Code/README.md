## Code Folder
#### File format

Please write your practice code here, follow the `2020-XX-XX` format to create each daily folder, such as `2020-11-17`. In each daily folder, create sub-folders for each projects, use full and descriptive name for them, such as `book_p139_exception_finally_test` or `abstract_class_for_shape_circle_rectangle`. Every `.java` and `.class` files should belong to one of the sub-folders.

In every source file, you should add the following comment on the top of your code:

```Java
// Date: 2010-11-17
// Description: ...
// Comiled: Yes/No
// Debugged: Yes/No
// Passed unit test: Yes/No
```

At the end, every project should get triple Yes states.

#### Submission format

Whenever you want to submit you change, you should write a comment to describe the change, for example:

```Java
int[] array = new int[3];
for (int i = 0; i <= array.length; i++) {
    // ... do something
}
```

Later, you debugged out the issue, and rewrote the code to:

```Java
int[] array = new int[3];
for (int i = 0; i < array.length; i++) {
    // ... do something
}
```
On the Github Desktop comment line, where you should write (Chinese or English is ok):

***for loop should use < instead of <= in [0,length) case.***

Every error in debug time or compiling time deserve a comment. If you have other type change (override, etc.), just comment it.

This project is in well configuration thus all `.class` files will be ignored when submitting.