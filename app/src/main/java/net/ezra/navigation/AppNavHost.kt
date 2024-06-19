package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.about.AboutScreen
import net.ezra.ui.shoes.DesScreen
import net.ezra.ui.des2.Des2Screen
import net.ezra.ui.des3.Des3Screen
import net.ezra.ui.des4.Des4Screen
import net.ezra.ui.evening.EveningScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.login.LoginScreen
import net.ezra.ui.registration.SignUpScreen
import net.ezra.ui.shir.Shir1Screen
import net.ezra.ui.shir.Shir2Screen
import net.ezra.ui.shir.Shir3Screen
import net.ezra.ui.shir.Shir4Screen
import net.ezra.ui.students.AddStudents
import net.ezra.ui.trouser.Tr2Screen
import net.ezra.ui.trouser.Tr3Screen
import net.ezra.ui.trouser.Tr4Screen
import net.ezra.ui.trouser.TrScreen
import net.ezra.ui.varsity.Var2Screen
import net.ezra.ui.varsity.Var3Screen
import net.ezra.ui.varsity.Var4Screen
import net.ezra.ui.varsity.VarScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH,
) {
    BackHandler {
        navController.popBackStack()
    }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {

        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController){}
        }
        composable(ROUTE_REGISTER) {
            SignUpScreen(navController = navController) { }
        }


        composable(ROUTE_EVENING) {
            EveningScreen(navController)
        }
        composable(ROUTE_ADD_STUDENTS) {
            AddStudents(navController)
        }
        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUTE_SHOES1) {
            DesScreen(navController)
        }
        composable(ROUTE_SHOES2) {
            Des2Screen(navController)
        }
        composable(ROUTE_SHOES3) {
            Des3Screen(navController)
        }

        composable(ROUTE_SHOES4) {
            Des4Screen(navController)
        }
        composable(ROUTE_SHIR1) {
            Shir1Screen(navController)
        }
        composable(ROUTE_SHIR2) {
            Shir2Screen(navController)
        }
        composable(ROUTE_SHIR3) {
            Shir3Screen(navController)
        }
        composable(ROUTE_SHIR4) {
            Shir4Screen(navController)
        }
        composable(ROUTE_VAR) {
            VarScreen(navController)
        }
        composable(ROUTE_VAR2) {
            Var2Screen(navController)
        }
        composable(ROUTE_VAR3) {
            Var3Screen(navController)
        }
        composable(ROUTE_VAR4) {
            Var4Screen(navController)
        }
        composable(ROUTE_TROUSER1) {
            TrScreen(navController)
        }
        composable(ROUTE_TROUSER2) {
            Tr2Screen(navController)
        }
        composable(ROUTE_TROUSER3) {
            Tr3Screen(navController)
        }

        composable(ROUTE_TROUSER4) {
            Tr4Screen(navController)
        }

    }
}
