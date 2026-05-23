package org.example

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false,
)

class MainScreenViewModel {
    var mainScreenState: MainScreenState = MainScreenState()
        private set

    fun loadData() {
        mainScreenState = MainScreenState(isLoading = true)
        mainScreenState = MainScreenState(data = "Данные с сервера загружены", isLoading = false)
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    println("Начальное состояние: ${viewModel.mainScreenState}")

    viewModel.loadData()
    println("Конечное состояние: ${viewModel.mainScreenState}")
}