package com.personal.aljfp.modern_toys.layer;

/*

    4.

 */


public abstract class Layer {};


/*

1. New data type Layer, and its variants Base and Slice
2. Base contains a field Object, and Slice contains Layer

3.
new Base(
  new Zero())

  is valid, since
    a. instance of Base, hence layer, and an Object

4.
new Base(
  new Zero())

and

new Base(
  new Salt())

  are instances of same variant, because
    a. everything created with a new is an Object.
    b. Since o is an Object in Base.
    c. new Salt() and new Zero(), can be both be passed.


EVERYTHING CREATED WITH NEW IS AN OBJECT

5.
new Base(
  5)

  is invalid, because
    a. 5 is not created with new.

6.
new Base(
  false)

  is invalid, because
    a. false is not created with new.

7.
new Base(
  new Integer(5))

  is Valid, because
    a. new Integer(5) creates an Object from an int

8.
new Base(
  new Boolean(false))

  is Valid, because
    a. new Boolean(false) creates an Object from a bool
 */
