package org.hashgeek

import org.specs2.Specification

/**
 * Created with IntelliJ IDEA.
 * User: basu
 * Date: 3/14/13
 * Time: 11:36 PM
 */
class HellWorldSpec extends Specification {def is =

  "This is a specification to check the 'Hello world' string"                 ^
    p^
    "The 'Hello world' string should"                                           ^
    "contain 11 characters"                                                   ! e1^
    "start with 'Hello'"                                                      ! e2^
    "end with 'world'"                                                        ! e3^
    end

  def e1 = "Hello world" must have size(11)
  def e2 = "Hello world" must startWith("Hello")
  def e3 = "Hello world" must endWith("world")
}
