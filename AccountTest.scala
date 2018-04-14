import org.scalatest.FunSuite

class AcountTest extends Funsuite{
  test("Account.deposit"){
    assert((amountDepWithd > 0 && openingAmount == 5000) Account.deposit(200) === 5200)
  }

  test("Account.withdrawal"){
    assert((amountDepWithd > 0 && openingAmount == 5000) Account.withdrawal(200) === 4800)
  }
}