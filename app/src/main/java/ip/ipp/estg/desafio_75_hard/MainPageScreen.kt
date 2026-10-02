package ip.ipp.estg.desafio_75_hard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun MainPageScreen(navController: NavHostController) {
    MyScaffold(navController = navController, title = "Página Principal", showBackButton = false) {
        Column(modifier = Modifier.padding(8.dp)) {


            // Botão Ver dias feitos
            Button(onClick = { navController.navigate("ChallengeProgressScreen") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                Text(text = "Dia atual")
            }
            // Botão Ver exercícios
            Button(onClick = { navController.navigate("WorkoutScreen") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                Text(text = "Workout")
            }
            // Botão Ver água
            Button(onClick = { navController.navigate("WaterScreen") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                Text(text = "Water")
            }
            // Botão Ver comida
            Button(onClick = { navController.navigate("FoodScreen") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                Text(text = "Food")
            }
            // Botão Ver livro
            Button(onClick = { navController.navigate("BookScreen") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                Text(text = "Book")
            }
            // Botão Ver dormida
            Button(onClick = { navController.navigate("SleepScreen") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                Text(text = "Sleep")
            }



        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPageScreenPreview() {
    MainPageScreen(navController = rememberNavController())
}
