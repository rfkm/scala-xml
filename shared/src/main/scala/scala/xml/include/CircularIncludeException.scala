/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2020, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    (c) 2011-2020, Lightbend, Inc.       **
** /____/\___/_/ |_/____/_/ | |    http://scala-lang.org/               **
**                          |/                                          **
\*                                                                      */

package scala
package xml
package include

/**
 *  A `CircularIncludeException` is thrown when an included document attempts
 *  to include itself or one of its ancestor documents.
 */
class CircularIncludeException(message: String) extends XIncludeException {

  /**
   * Constructs a `CircularIncludeException` with `'''null'''`.
   * as its error detail message.
   */
  def this() = this(null)

}
