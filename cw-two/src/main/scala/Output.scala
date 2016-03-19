object Output {
  val intro = "Welcome to Mastermind.\n\n" +
    "This is a text version of the classic board game Mastermind.\n" +
    "The computer will think of a secret code.\n" +
    "The code consists of 4 colored pegs.\n" +
    "The pegs may be one of six colors: blue, green , orange, purple, red, or yellow.\n" +
    "A color may appear more than once in the code.\n\n" +
    "You try to guess what colored pegs are in the code and what order they are in\n" +
    "After making a guess the result will be displayed.\n" +
    "A result consists of a black peg for each peg you have exactly correct (color and position) in your guess.\n" +
    "For each peg in the guess that is the correct color, but is out of position, you get a white peg.\n\n" +
    "Only the first letter of the color is displayed. B for Blue, R for Red, and so forth.\n" +
    "When entering guesses you only need to enter the first character of the color as a capital letter.\n\n" +
    "You have 12 to guess the answer or you lose the game.\n"

  val begin = "Generating secret code ...."

  /*def roundFeedback(easy: Boolean, board: Board) = {
    val output = StringBuilder.newBuilder
    if (easy) output.append(s"The secret code is ${board.secretCode}")
    if (board.rounds.nonEmpty) {
      board.rounds(board.rounds.length - 1).analyse match {
        case Solved() => output.append("\n" + board.secretCode + " SecretCode\n")
        case Unsolved() => output.append("\n.... SecretCode\n")
      }
      board.rounds.map(r => output.append(r))
      // then maybe append "...." for each round yet to be played
    }
    output.toString
  }*/

  def remainingGuesses(turn: Int) = "You have " + (12 - turn) + " guesses left"

  val promptForGuess = "\nWhat is your next guess?\n" +
    "Type in the characters for your guess and press enter.\n" +
    "Enter guess: "

  val congratulate = "You solved the puzzle! Good job." // then controller calls anotherGame()

  val commiserate = "You did not solve the puzzle. Too bad." // then controller calls anotherGame()

  val anotherGame = "Enter Y for another game or anything else to quit: "
}