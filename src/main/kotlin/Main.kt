package org.example

class MainScreenViewModel {
    data class MainScreenState(
        val data: String? = null,
        val isLoading: Boolean = false,
    )

    var mainScreenState: MainScreenState = MainScreenState()
        private set

    fun loadData() {
        mainScreenState = mainScreenState.copy(isLoading = true)
        mainScreenState = mainScreenState.copy(data = "Данные с сервера загружены", isLoading = false)
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    println("Начальное состояние: ${viewModel.mainScreenState}")

    viewModel.loadData()
    println("Конечное состояние: ${viewModel.mainScreenState}")
}