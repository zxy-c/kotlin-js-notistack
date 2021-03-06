import com.zxy.notistack.snackbarProvider
import kotlinx.browser.document
import react.dom.render

fun main() {
    document.write("Hello, world!")
    render(document.getElementById("root")) {
        snackbarProvider{
            attrs.maxSnack = 1
        }
    }
}