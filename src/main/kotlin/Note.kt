class Note(var name: String, var text: String) {
    fun showNoteText(){
        println("Текст заметки ${name}:")
        println(text + "\n\n====================\n"
        )

    }


}