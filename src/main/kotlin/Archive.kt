class Archive (val name: String) {
    var noteList: MutableList<Note> = mutableListOf()
    var exit: Boolean = false

    fun menu(){
        println(cuteCat + "====================\nАрхив \"$name\" \n====================")
        println("1 - Создать новую заметку\n2 - Посмотреть существующую заметку\n3 - Нарисовать котика\n4 - Выход в меню архивов\n====================")
        this.seeAllNotes()
        var userInput: Int = 0
        exit = false
        userInput = enterNumberBetween(1,4)
        when (userInput){
            1 -> this.createNote()
            2 -> this.goToNote()
            3 -> println(cuteCat2)
            4 -> exit = true
        }
    }


    fun createNote(){
        println("Введите название новой заметки")
        val noteName: String = enterLine()
        println("Введите текст заметки(чтобы ввести котика вместо текста введите \"cat\")")
        var noteText: String = enterLine()
        if (noteText == "cat") noteText = cuteCat3
        println("Заметка \"$noteName\" создана!")
        val newNote = Note(noteName, noteText)
        noteList.add(newNote)
    }

    fun seeAllNotes(){
        println("Список всех заметок в этом архиве:")
        println(noteList.joinToString{it.name})
    }

    fun goToNote(){
        println("Введите название заметки, которую вы бы хотели посмотреть")
        val noteName: String = enterLine()
        if (noteName in noteList.map{note -> note.name}) {
            for (i in noteList)
                if (i.name == noteName){
                    i.showNoteText()

                }
        }
        else
            println("Не найдено заметки с именем ${noteName}!")
    }

}