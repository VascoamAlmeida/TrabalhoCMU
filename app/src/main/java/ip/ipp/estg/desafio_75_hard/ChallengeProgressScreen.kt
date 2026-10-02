package ip.ipp.estg.desafio_75_hard


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun ChallengeProgressScreen(navController: NavHostController) {
    MyScaffold(navController = navController, title = "Challenge Progress", showBackButton = true) {

        Text(text = "Page of Challenge Progress")
    }
}