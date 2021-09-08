package github.noargs.app

class App {
    var developmentMode = false
    val pos : UiPos = UiPos()


    fun load() {
        pos.title = "Kanguin"
        pos.isVisible = true
    }
}