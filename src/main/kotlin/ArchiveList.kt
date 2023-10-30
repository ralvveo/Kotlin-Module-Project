class ArchiveList() {
    var archiveList: MutableList<Archive> = mutableListOf()
    var exit: Boolean = false

    fun menu(){
        println(cuteCat + "====================\n    Меню архивов\n====================\n1 - Создать новый архив\n2 - Открыть существующий архив\n3 - Нарисовать котика\n4 - Выход из программы\n====================")
        this.seeAllArchives()
        var userInput: Int = 0
        userInput = enterNumberBetween(1,4)
        when (userInput){
            1 -> this.createArchive()
            2 -> this.goToArchive()
            3 -> println(cuteCat3)
            4 -> exit = true
        }
    }

    fun createArchive(){
        println("Введите название нового архива")
        val archiveName: String = enterLine()
        println("Архив \"$archiveName\" создан!")
        val newArchive: Archive = Archive(archiveName)
        archiveList.add(newArchive)
    }

    fun seeAllArchives(){
        println("Список всех созданных архивов:")
        println(archiveList.joinToString{it.name})
    }

    fun goToArchive(){
        println("Введите название архива, который вы бы хотели открыть")
        val archiveName: String = enterLine()
        if (archiveName in archiveList.map{archive -> archive.name}) {

            for (i in archiveList)
                if (i.name == archiveName){
                    i.exit = false
                    while (i.exit == false)
                        i.menu()
                }
        }
        else
            println("Не найдено архива с названием \"$archiveName\"!")

    }

}