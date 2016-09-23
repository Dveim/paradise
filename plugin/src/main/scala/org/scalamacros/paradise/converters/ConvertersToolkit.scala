package org.scalameta.paradise
package converters

import org.scalameta.paradise.reflect.{Metadata, Enrichments, Definitions}

import scala.reflect.internal.Trees

trait ConvertersToolkit extends Enrichments
                        with LogicalTrees
                        with Metadata
                        with Definitions {
  lazy val g: global.type = global
  object l extends LogicalTrees
}
