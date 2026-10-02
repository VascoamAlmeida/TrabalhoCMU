package ip.ipp.estg.desafio_75_hard

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun BookScreen(navController: NavHostController) {
    MyScaffold(navController = navController, title = "Book Screen", showBackButton = true) {

        Text(text = "Book Screen")
    }
}