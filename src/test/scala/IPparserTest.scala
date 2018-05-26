import IPparser.{IpAddress, ResultContainer, myCases}

import org.scalatest._

class IPparserTest extends Suite {
  def testHarness(dottedIP: String, expected: ResultContainer) = {
    val r = new IpAddress(dottedIP)
    println(dottedIP, r.result, expected)
    assert(r.result === expected)
  }

  myCases.foreach(a => testHarness(a._1, a._2))

}
