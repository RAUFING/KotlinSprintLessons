package org.example

class Folder(
    private val actualName: String,
    private val actualFileCount: Int,
    private val isSecret: Boolean,
) {
    val name: String
        get() = if (isSecret) "скрытая папка" else actualName

    val fileCount: Int
        get() = if (isSecret) 0 else actualFileCount
}

fun main() {
    val secretFolder = Folder("Секретные документы", 42, true)
    val normalFolder = Folder("Публичные файлы", 10, false)

    println("Папка 1: Имя = ${secretFolder.name}, Файлов = ${secretFolder.fileCount}")
    println("Папка 2: Имя = ${normalFolder.name}, Файлов = ${normalFolder.fileCount}")
}