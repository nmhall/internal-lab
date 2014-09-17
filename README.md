# Lab: Subversive Scala 

## Overview
In this lab, you'll face three puzzles. Each puzzle asks you to implement a 
new control-flow structure *for* Scala *in* Scala.

Implementing a control-flow structure is a lot like implementing a data
structure: Just as you implement a new data structure by using *pre-existing* data
structures, you implement a new control-flow structure by using pre-existing
control-flow structures. 

A more detailed description is below. Here are a few notes about this lab:

  - You **may not use any Scala libraries** to implement you control-flow
  structures. In other words, neither `import` nor `extends` should appear in
  your code (except for `extends App`).
  - Resist the temptation to look for an answer online or in a book. The main
  benefit of this lab is to start developing the thinking process that you
  use to turn syntax into an implementation as an internal DSL.
  - You should follow the standard assignment workflow for the lab, so that you
  can issue a pull request to show off your work.
  - The files are set up for you to run `sbt eclipse`, so you can work in
  ScalaIDE (though you don't *have* to do it that way).
  - Initially, the files won't compile because you haven't implemented the
  control-flow structures. You may want to comment out some of the code until
  you have a chance to implement your control-flow structure.
  - The control-flow structures that you're asked to implement are very 
  un-Scala-y! Their behavior essentially relies on mutable variables, which we 
  try to avoid in traditional Scala. But, of course, this is not traditional 
  Scala. This is subversive Scala :).

## Part 1: `loop_until`
Implement a control-flow structure called `loop_until` that can be used like so:

```
var i = 0 
loop_until (i > 9) {
  if ( (i % 2) == 0 ) 
    println(i)
  i += 1
}
```

The `loop_until` control structure first checks its condition. If the condition
is *false*, it executes the body. It then checks the condition again. If the
condition is still false, it again executes the body and continues in this
fashion until the condition becomes true.

In the case of the example above, the body of the `loop_until` structure should
execute 10 times and print the numbers `0`, `2`, `4`, `6`, `8` (with each number
appearing on a separate line).

Put your implementation in the file `/src/main/scala/internal/LoopUntil.scala`.

## Part 2: `repeat` … `until`
Implement a control-flow structure called `repeat` … `until` that can be used 
like so:

```
var i = 0
repeat {
   if ( (i % 2) == 0 )
      println(i)
   i += 1
} until (i > 9)
```

The `repeat` … `until` control structure first executes its body. Then it checks
its condition. If the condition is *false*, it executes the body again. It then
checks the condition again and  continues in this fashion until the condition
becomes true.

In the case of the example above, the body of the `repeat` … `until` structure
should execute 10 times and print the numbers `0`, `2`, `4`, `6`, `8` (with each
number appearing on a separate line).

Put your implementation in the file 
`/src/main/scala/internal/RepeatUntil.scala`.

## Part 3: `while_c` and `continue`
Implement control-flow structures called `while_c` and `continue` that can be 
used like so:

```
var i = -1
while_c (i < 9) {
   i += 1
   if ( (i % 2) != 0 )
      continue
   println(i)
} 
```

The `while_c` control structure first checks its condition. If the condition
is *true*, it executes the body. It then checks the condition again. If the
condition is still true, it again executes the body and continues in this
fashion until the condition becomes false.

The `continue` control structure, when it appears inside a `while_c`, causes the
program to jump directly to the top of the loop, where it will check the loop
condition again and continue on like normal.

If `continue` appears outside a `while_c` loop, its behavior is undefined. So, 
in your implementation, you don't need to check whether `continue` appears
inside `while_c`. You only need to make the program behave properly in the case
when a `while_c` contains a `continue`.

In the example above, the body of the `while_c` structure should
execute 10 times and print the numbers `0`, `2`, `4`, `6`, `8` (with each number
appearing on a separate line).

Put your implementation in the file 
`/src/main/scala/internal/WhileContinue.scala`.

## Bonus: Summations
If you finish the first three parts of the lab, consider taking on this
challenge: Design and implement a notation for mathematical summations that is a
expressive as those used in math and is a close as possible to the notation that
mathematicians would use.

## Bonus: Baysick
Try your hand at implementing the syntax for
[Baysick](https://github.com/fogus/baysick), an internal DSL that mimics the
[Basic](http://en.wikipedia.org/wiki/BASIC) programming language. (Don't look at
the implementation online; reverse engineer it from the examples!)
