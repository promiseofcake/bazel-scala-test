package Sample

import org.scalatest.FunSuite

class SimpleParserTest extends FunSuite {
  test("Attempt to run a .parse with our Parser") {
    SimpleParser.parse(SimpleParser.word, "johnny come lately")
  }
}
