package fintech.homework01

trait IODevice {
  def printLine(text: String): Unit
  def readChar(): Char
}
