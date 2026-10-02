package ip.ipp.estg.desafio_75_hard

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun SleepScreen(navController: NavHostController) {
    MyScaffold(navController = navController, title = "Sleep Screen", showBackButton = true) {

        Text(text = "Sleep Screen")
    }
}