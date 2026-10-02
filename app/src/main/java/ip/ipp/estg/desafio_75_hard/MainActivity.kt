package ip.ipp.estg.desafio_75_hard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ip.ipp.estg.desafio_75_hard.ui.theme.Desafio75HardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Desafio75HardTheme {
                val navController = rememberNavController()
                MyApp(navController)
            }
        }
    }
}


/**
 * Define a estrutura de navegação do aplicativo.
 *
 */
@Composable
fun MyApp(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "LoginScreen") {
        composable("entry") {
            EntryScreen(navController)
        }
        composable("MainPageScreen") {

            MainPageScreen(navController)
        }
        composable("ChallengeProgressScreen") {
            ChallengeProgressScreen(navController)
        }
        composable("WorkoutScreen") {
            WorkoutScreen(navController)
        }
        composable("WaterScreen") {
            WaterScreen(navController)
        }
        composable("FoodScreen") {
            FoodScreen(navController)
        }
        composable("BookScreen") {
            BookScreen(navController)
        }
        composable("SleepScreen") {
            SleepScreen(navController)
        }
        composable("LoginScreen") {
            LoginScreen(navController)
        }
        composable("StartJourneyPage") {
            val userId = userID.userId ?: ""

            StartJourneyPage(navController, userId )
        }
    }
}


/**
 * Define a estrutura da barra de navegação superior.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(title: String, onNavIconClick: () -> Unit, showBackButton: Boolean = false) {
    TopAppBar(
        title = { Text(text = title) },
        navigationIcon = {
            IconButton(onClick = { onNavIconClick() }) {
                if (showBackButton) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Voltar"
                    )
                } else {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Abrir Itens de Navegação"
                    )
                }
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.4f)
        )
    )
}


@Composable
fun MyScaffold(navController: NavHostController, title: String, content: @Composable () -> Unit, showBackButton: Boolean = false) {
    Scaffold(
        topBar = {
            MyTopAppBar(title = title, onNavIconClick = {
                if (showBackButton) navController.popBackStack() },
                showBackButton = showBackButton)
        },
        content = { padding ->
            Column(modifier = Modifier.padding(padding)) {
                content()
            }
        }
    )
}



@Preview(showBackground = true)
@Composable
fun PreviewMyApp() {
    Desafio75HardTheme {
        val navController = rememberNavController()
        MyApp(navController)
    }
}