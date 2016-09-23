package mainWithParams

import scala.meta._

@mainWithParams("hello world")
object Test {
  println("bye-bye world")
}

@namedParam(some = "text")
class SomeClass1

@argRepeated(foos: _*)
class SomeClass2

@argRepeated(foos: _*)
class SomeClass3 {
  @Deprecated inline implicit def foo(a: Int, b: Int): Any = meta {
    a + b
  }
}