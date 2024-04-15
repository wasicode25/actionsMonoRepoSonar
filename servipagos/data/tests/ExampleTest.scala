import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ExampleTest extends AnyFlatSpec with Matchers {
  "La función esMayorQue" should "devolver true si el primer número es mayor que el segundo" in {
    val resultado = Example.esMayorQue(5, 3)
    resultado shouldBe true
  }

  it should "devolver false si el primer número es menor o igual al segundo" in {
    val resultado = Example.esMayorQue(3, 5)
    resultado shouldBe false
  }
}