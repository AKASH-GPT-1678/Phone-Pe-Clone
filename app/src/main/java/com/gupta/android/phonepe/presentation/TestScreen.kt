package com.gupta.android.phonepe.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gupta.android.phonepe.phonepe.components.MoneyTransferSection
import com.gupta.android.phonepe.phonepe.components.balance.BalancePage
import com.gupta.android.phonepe.phonepe.components.banktransfer.BankTransferNavigation
import com.gupta.android.phonepe.phonepe.components.banktransfer.BankTransfers
import com.gupta.android.phonepe.phonepe.components.banktransfer.SendMoneyIntro
import com.gupta.android.phonepe.phonepe.components.moneytransfer.MoneyTransferByNumber
import com.gupta.android.phonepe.phonepe.components.moneytransfer.MoneyTransferNavigation
import com.gupta.android.phonepe.phonepe.components.moneytransfer.NavigationMoney
import com.gupta.android.phonepe.phonepe.components.moneytransfer.SearchForPay
import com.gupta.android.phonepe.phonepe.components.refer.NavigationReferEarn


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
                },
                onBanktransferClick ={
                    navcontroller.navigate(NavigationMoney.Banktransfer.name)
                },
                onReferandEarn = {
                    navcontroller.navigate(NavigationMoney.ReferandEarn.name)
                }
            )
        }
        composable (
            route = NavigationMoney.Mobiletransfer.name

        ){
            MoneyTransferNavigation()
        }
         composable(
             route = NavigationMoney.Banktransfer.name
         ) {
             BankTransferNavigation()
         }
        composable (NavigationMoney.ReferandEarn.name) {
            NavigationReferEarn()
        }

    }
}
