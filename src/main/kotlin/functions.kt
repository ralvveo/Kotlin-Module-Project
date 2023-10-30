fun enterNumberBetween(firstNumber: Int, secondNumber: Int): Int{
    var userInput: String?  = null
    var userInputInt: Int? = userInput?.toIntOrNull()
    var correctInput: Boolean = false
    while (!correctInput){
        println("Введите число от $firstNumber до $secondNumber")
        userInput = readLine()
        userInputInt = userInput?.toIntOrNull()
        if (userInputInt == null){}
        if (userInputInt != null)
            if ((firstNumber!! <= userInputInt!!) and (userInputInt!! <= secondNumber))
                correctInput = true
    }
    return userInputInt as Int
}

fun enterLine(): String {
    var userInput: String? = null
    var correctInput: Boolean = false
    while (!correctInput) {
        userInput = readLine()
        if ((userInput != null) and (userInput!="")) correctInput = true
    }
    return userInput as String
}





public val cuteCat: String =
            " ,_     _\n" +
            " |\\\\_,-~/\n" +
            " / _  _ |    ,--.\n" +
            "(  @  @ )   / ,-'\n" +
            " \\  _T_/-._( (\n" +
            " /         `. \\\n" +
            "|         _  \\ |\n" +
            " \\ \\ ,  /      |\n" +
            "  || |-_\\__   /\n" +
            " ((_/`(____,-'\n"

public val cuteCat2: String =
        "           ／＞　 フ\n" +
        "　　　　　| 　_　 _|\n" +
        "　 　　　／`ミ _x 彡\n" +
        "　　 　 /　　　 　 |\n" +
        "　　　 /　 ヽ　　 ﾉ\n" +
        "　／￣|　　 |　|　|\n" +
        "　| (￣ヽ＿_ヽ_)_)\n" +
        "　＼二つ"

public val cuteCat3: String = "" +
        "／ﾌﾌ 　　　　　 　　 　ム｀ヽ\n" +
        "/ ノ)　　 ∧　　∧　　　　）　ヽ\n" +
        "/ ｜　　(´・ω ・`）ノ⌒（ゝ._,ノ\n" +
        "/　ﾉ⌒＿⌒ゝーく　 ＼　　／\n" +
        "丶＿ ノ 　　 ノ､　　|　/\n" +
        "　　 `ヽ `ー-‘人`ーﾉ /\n" +
        "　　　 丶 ￣ _人’彡ﾉ\n" +
        "　　　／｀ヽ _/\\__'"