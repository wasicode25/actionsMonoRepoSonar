// Test para verificar la función encontrarMayor en el objeto MayorNumero.
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MayorNumeroSpec extends AnyFlatSpec with Matchers {
  "La función encontrarMayor" should "devolver el número más grande cuando se ingresan dos números diferentes" in {
    val resultado = MayorNumero.encontrarMayor(5, 3)
    resultado shouldBe 5
  }

  it should "devolver cualquiera de los dos números cuando son iguales" in {
    val resultado1 = MayorNumero.encontrarMayor(3, 3)
    val resultado2 = MayorNumero.encontrarMayor(10, 10)
    resultado1 shouldBe 3
    resultado2 shouldBe 10
  }
}