package sml

/**
  * This class is the supertype for machine instructions
  *
  */
abstract class Instruction(label: String, opcode: String) {

  override def toString(): String = label + ": " + opcode

  def execute(m: Machine): Unit
}