fun main(args: Array<String>) {


    println("Добро пожаловать в приложение Заметки!\n")
    start()
    println("До свидания!\n" + cuteCat)


}

fun start(){

    var archiveList: ArchiveList = ArchiveList()
    while (archiveList.exit == false){
        archiveList.menu()

    }
}