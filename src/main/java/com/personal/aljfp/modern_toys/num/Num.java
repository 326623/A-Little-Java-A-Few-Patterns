package com.personal.aljfp.modern_toys.num;

/*

  3.

*/

/*

Definitions:

    1. Num is a datatype.
    2. Zero and OneMoreThan are two variants

    contd....

 */

public abstract class Num {}


/*

1. new Zero() is a Num

2.
new OneMoreThan(
  new Zero())

    => This is valid, since
           a. OneMoreThan constructor accepts Num
           b. new Zero() is a num from 1.
    => This gives us a new Num
    => predecessor is set to new Zero()
    => predecessor at this point can have only new Zero() or new OneMoreThan(), in this case it has new Zero()


3.
new OneMoreThan(
  new OneMoreThan(
    new Zero()))

    => This is valid, since
           a. new OneMoreThan(
                new Zero())    is a Num, from 2.

*/

/*

1. new OneMoreThan(0) is invalid since
    a. 0 is not the same as new Zero()

2. 0 is not the same, but similar to new Zero()

3. 1 is not the same, but similar to new OneMoreThan(
                                       new Zero())

4.
new OneMoreThan(
  new OneMoreThan(
    new OneMoreThan(
      new OneMoreThan
        new Zero())))

        is not same, similar to 4

*/

/*

1. There are more Nums than booleans
2. There are less/equal Nums than ints(Java limits ints to 2^32)

3. 0 is not the same new Zero(), because 0 is a int, and new Zero() is a instance of Num

4. If two things are instances of two different basic types, they cannot be same.
5. Primitive types(int and boolean) are distinct, others may overlap.

6. Class definitions do not introduce primitive types.

7. Every class that doesn't explicitly extend another class implicitly extends class Object
    => Implication being everything is an Object.

 */