package com.gupta.android.phonepe.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gupta.android.phonepe.phonepe.components.MoneyTransferSection
import com.gupta.android.phonepe.phonepe.components.balance.BalancePage
import com.gupta.android.phonepe.phonepe.components.banktransfer.BankTransfers
import com.gupta.android.phonepe.phonepe.components.banktransfer.SendMoneyIntro
import com.gupta.android.phonepe.phonepe.components.moneytransfer.MoneyTransferByNumber
import com.gupta.android.phonepe.phonepe.components.moneytransfer.MoneyTransferNavigation
import com.gupta.android.phonepe.phonepe.components.moneytransfer.NavigationMoney
import com.gupta.android.phonepe.phonepe.components.moneytransfer.SearchForPay


@Composable
fun TestScreen() {
    val navcontroller = rememberNavController()

    NavHost(
        navController = navcontroller,
        startDestination = "Home"
    ){
        composable(
            route = "Home"
        ) {
            HomeScreen(
                navController = navcontroller,
                onMoneyCLick = {
                    navcontroller.navigate(NavigationMoney.Mobiletransfer.name)
                }
            )
        }
        composable (
            route = NavigationMoney.Mobiletransfer.name

        ){
            MoneyTransferNavigation()
        }


    }
}
