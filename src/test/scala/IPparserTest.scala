import IPparser.{IpAddress, ResultContainer, myCases}
import org.scalatest._

class IPparserTest extends Suite {
  val prefix = Seq("", "http://")
  val postfix = Seq("", "/")

  def testHarness(dottedIP: String, expected: ResultContainer) = {
    val r = new IpAddress(dottedIP)
    println(dottedIP, r.result, expected)
    assert(r.result === expected)
  }

  //postfix.map(post => prefix.map(pre => myCases.map(s => (pre + s._1 + post, s._2)).foreach(a => testHarness(a._1, a._2))))
  myCases.foreach(a => testHarness(a._1, a._2))

}
