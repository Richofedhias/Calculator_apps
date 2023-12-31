package example.com.calculatorapps

sealed class CalculatorOperation(val symbol:String) {
object Add: CalculatorOperation("+")
object Substract: CalculatorOperation("-")
object Multiply: CalculatorOperation("x")
object Divide: CalculatorOperation("/")
}